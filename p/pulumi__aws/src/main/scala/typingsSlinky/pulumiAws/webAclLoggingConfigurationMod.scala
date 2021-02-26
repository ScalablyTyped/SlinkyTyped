package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.outputMod.wafv2.WebAclLoggingConfigurationRedactedField
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webAclLoggingConfigurationMod {
  
  @JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration")
  @js.native
  class WebAclLoggingConfiguration protected () extends CustomResource {
    /**
      * Create a WebAclLoggingConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclLoggingConfigurationArgs) = this()
    def this(name: String, args: WebAclLoggingConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL. Currently, only 1 ARN is supported.
      */
    val logDestinationConfigs: Output_[js.Array[String]] = js.native
    
    /**
      * The parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported.
      */
    val redactedFields: Output_[js.UndefOr[js.Array[WebAclLoggingConfigurationRedactedField]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
      */
    val resourceArn: Output_[String] = js.native
  }
  /* static members */
  object WebAclLoggingConfiguration {
    
    /**
      * Get an existing WebAclLoggingConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): WebAclLoggingConfiguration = js.native
    @JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebAclLoggingConfiguration = js.native
    @JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState): WebAclLoggingConfiguration = js.native
    @JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState, opts: CustomResourceOptions): WebAclLoggingConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of WebAclLoggingConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafv2/webAclLoggingConfiguration", "WebAclLoggingConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclLoggingConfiguration.WebAclLoggingConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait WebAclLoggingConfigurationArgs extends StObject {
    
    /**
      * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL. Currently, only 1 ARN is supported.
      */
    val logDestinationConfigs: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported.
      */
    val redactedFields: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField]
          ]
        ]
      ] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
      */
    val resourceArn: Input[String] = js.native
  }
  object WebAclLoggingConfigurationArgs {
    
    @scala.inline
    def apply(logDestinationConfigs: Input[js.Array[Input[String]]], resourceArn: Input[String]): WebAclLoggingConfigurationArgs = {
      val __obj = js.Dynamic.literal(logDestinationConfigs = logDestinationConfigs.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAclLoggingConfigurationArgs]
    }
    
    @scala.inline
    implicit class WebAclLoggingConfigurationArgsMutableBuilder[Self <: WebAclLoggingConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogDestinationConfigs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logDestinationConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDestinationConfigsVarargs(value: Input[String]*): Self = StObject.set(x, "logDestinationConfigs", js.Array(value :_*))
      
      @scala.inline
      def setRedactedFields(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField]
              ]
            ]
      ): Self = StObject.set(x, "redactedFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedactedFieldsUndefined: Self = StObject.set(x, "redactedFields", js.undefined)
      
      @scala.inline
      def setRedactedFieldsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField]*): Self = StObject.set(x, "redactedFields", js.Array(value :_*))
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebAclLoggingConfigurationState extends StObject {
    
    /**
      * The Amazon Kinesis Data Firehose Amazon Resource Name (ARNs) that you want to associate with the web ACL. Currently, only 1 ARN is supported.
      */
    val logDestinationConfigs: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The parts of the request that you want to keep out of the logs. Up to 100 `redactedFields` blocks are supported.
      */
    val redactedFields: js.UndefOr[
        Input[
          js.Array[
            Input[typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField]
          ]
        ]
      ] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the web ACL that you want to associate with `logDestinationConfigs`.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
  }
  object WebAclLoggingConfigurationState {
    
    @scala.inline
    def apply(): WebAclLoggingConfigurationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebAclLoggingConfigurationState]
    }
    
    @scala.inline
    implicit class WebAclLoggingConfigurationStateMutableBuilder[Self <: WebAclLoggingConfigurationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogDestinationConfigs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "logDestinationConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogDestinationConfigsUndefined: Self = StObject.set(x, "logDestinationConfigs", js.undefined)
      
      @scala.inline
      def setLogDestinationConfigsVarargs(value: Input[String]*): Self = StObject.set(x, "logDestinationConfigs", js.Array(value :_*))
      
      @scala.inline
      def setRedactedFields(
        value: Input[
              js.Array[
                Input[typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField]
              ]
            ]
      ): Self = StObject.set(x, "redactedFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedactedFieldsUndefined: Self = StObject.set(x, "redactedFields", js.undefined)
      
      @scala.inline
      def setRedactedFieldsVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafv2.WebAclLoggingConfigurationRedactedField]*): Self = StObject.set(x, "redactedFields", js.Array(value :_*))
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    }
  }
}
