package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.cfg.RemediationConfigurationParameter
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remediationConfigurationMod {
  
  @JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration")
  @js.native
  class RemediationConfiguration protected () extends CustomResource {
    /**
      * Create a RemediationConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RemediationConfigurationArgs) = this()
    def this(name: String, args: RemediationConfigurationArgs, opts: CustomResourceOptions) = this()
    
    val arn: Output_[String] = js.native
    
    /**
      * The name of the AWS Config rule
      */
    val configRuleName: Output_[String] = js.native
    
    /**
      * Can be specified multiple times for each
      * parameter. Each parameter block supports fields documented below.
      */
    val parameters: Output_[js.UndefOr[js.Array[RemediationConfigurationParameter]]] = js.native
    
    /**
      * The type of a resource
      */
    val resourceType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Target ID is the name of the public document
      */
    val targetId: Output_[String] = js.native
    
    /**
      * The type of the target. Target executes remediation. For example, SSM document
      */
    val targetType: Output_[String] = js.native
    
    /**
      * Version of the target. For example, version of the SSM document
      */
    val targetVersion: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object RemediationConfiguration {
    
    /**
      * Get an existing RemediationConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): RemediationConfiguration = js.native
    @JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RemediationConfiguration = js.native
    @JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: RemediationConfigurationState): RemediationConfiguration = js.native
    @JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: RemediationConfigurationState, opts: CustomResourceOptions): RemediationConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of RemediationConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/remediationConfiguration", "RemediationConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/remediationConfiguration.RemediationConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait RemediationConfigurationArgs extends StObject {
    
    /**
      * The name of the AWS Config rule
      */
    val configRuleName: Input[String] = js.native
    
    /**
      * Can be specified multiple times for each
      * parameter. Each parameter block supports fields documented below.
      */
    val parameters: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cfg.RemediationConfigurationParameter]]
        ]
      ] = js.native
    
    /**
      * The type of a resource
      */
    val resourceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Target ID is the name of the public document
      */
    val targetId: Input[String] = js.native
    
    /**
      * The type of the target. Target executes remediation. For example, SSM document
      */
    val targetType: Input[String] = js.native
    
    /**
      * Version of the target. For example, version of the SSM document
      */
    val targetVersion: js.UndefOr[Input[String]] = js.native
  }
  object RemediationConfigurationArgs {
    
    @scala.inline
    def apply(configRuleName: Input[String], targetId: Input[String], targetType: Input[String]): RemediationConfigurationArgs = {
      val __obj = js.Dynamic.literal(configRuleName = configRuleName.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemediationConfigurationArgs]
    }
    
    @scala.inline
    implicit class RemediationConfigurationArgsMutableBuilder[Self <: RemediationConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigRuleName(value: Input[String]): Self = StObject.set(x, "configRuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cfg.RemediationConfigurationParameter]]
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cfg.RemediationConfigurationParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetType(value: Input[String]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVersion(value: Input[String]): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    }
  }
  
  @js.native
  trait RemediationConfigurationState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the AWS Config rule
      */
    val configRuleName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Can be specified multiple times for each
      * parameter. Each parameter block supports fields documented below.
      */
    val parameters: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.cfg.RemediationConfigurationParameter]]
        ]
      ] = js.native
    
    /**
      * The type of a resource
      */
    val resourceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Target ID is the name of the public document
      */
    val targetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the target. Target executes remediation. For example, SSM document
      */
    val targetType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Version of the target. For example, version of the SSM document
      */
    val targetVersion: js.UndefOr[Input[String]] = js.native
  }
  object RemediationConfigurationState {
    
    @scala.inline
    def apply(): RemediationConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemediationConfigurationState]
    }
    
    @scala.inline
    implicit class RemediationConfigurationStateMutableBuilder[Self <: RemediationConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setConfigRuleName(value: Input[String]): Self = StObject.set(x, "configRuleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigRuleNameUndefined: Self = StObject.set(x, "configRuleName", js.undefined)
      
      @scala.inline
      def setParameters(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.cfg.RemediationConfigurationParameter]]
            ]
      ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.cfg.RemediationConfigurationParameter]*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
      @scala.inline
      def setTargetId(value: Input[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
      
      @scala.inline
      def setTargetType(value: Input[String]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
      
      @scala.inline
      def setTargetVersion(value: Input[String]): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
    }
  }
}
