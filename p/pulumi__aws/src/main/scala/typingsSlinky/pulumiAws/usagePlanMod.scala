package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.apigateway.UsagePlanApiStage
import typingsSlinky.pulumiAws.outputMod.apigateway.UsagePlanQuotaSettings
import typingsSlinky.pulumiAws.outputMod.apigateway.UsagePlanThrottleSettings
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usagePlanMod {
  
  @JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan")
  @js.native
  class UsagePlan protected () extends CustomResource {
    /**
      * Create a UsagePlan resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UsagePlanArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: UsagePlanArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The associated API stages of the usage plan.
      */
    val apiStages: Output_[js.UndefOr[js.Array[UsagePlanApiStage]]] = js.native
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The description of a usage plan.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the usage plan.
      */
    val name: Output_[String] = js.native
    
    /**
      * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
      */
    val productCode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The quota settings of the usage plan.
      */
    val quotaSettings: Output_[js.UndefOr[UsagePlanQuotaSettings]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The throttling limits of the usage plan.
      */
    val throttleSettings: Output_[js.UndefOr[UsagePlanThrottleSettings]] = js.native
  }
  /* static members */
  object UsagePlan {
    
    /**
      * Get an existing UsagePlan resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan.get")
    @js.native
    def get(name: String, id: Input[ID]): UsagePlan = js.native
    @JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UsagePlan = js.native
    @JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan.get")
    @js.native
    def get(name: String, id: Input[ID], state: UsagePlanState): UsagePlan = js.native
    @JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan.get")
    @js.native
    def get(name: String, id: Input[ID], state: UsagePlanState, opts: CustomResourceOptions): UsagePlan = js.native
    
    /**
      * Returns true if the given object is an instance of UsagePlan.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/apigateway/usagePlan", "UsagePlan.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlan.UsagePlan */ Boolean = js.native
  }
  
  @js.native
  trait UsagePlanArgs extends StObject {
    
    /**
      * The associated API stages of the usage plan.
      */
    val apiStages: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage]]]
      ] = js.native
    
    /**
      * The description of a usage plan.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the usage plan.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
      */
    val productCode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The quota settings of the usage plan.
      */
    val quotaSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The throttling limits of the usage plan.
      */
    val throttleSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings]] = js.native
  }
  object UsagePlanArgs {
    
    @scala.inline
    def apply(): UsagePlanArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsagePlanArgs]
    }
    
    @scala.inline
    implicit class UsagePlanArgsMutableBuilder[Self <: UsagePlanArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiStages(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage]]]): Self = StObject.set(x, "apiStages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiStagesUndefined: Self = StObject.set(x, "apiStages", js.undefined)
      
      @scala.inline
      def setApiStagesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage]*): Self = StObject.set(x, "apiStages", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProductCode(value: Input[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
      
      @scala.inline
      def setQuotaSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings]): Self = StObject.set(x, "quotaSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaSettingsUndefined: Self = StObject.set(x, "quotaSettings", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setThrottleSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings]): Self = StObject.set(x, "throttleSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleSettingsUndefined: Self = StObject.set(x, "throttleSettings", js.undefined)
    }
  }
  
  @js.native
  trait UsagePlanState extends StObject {
    
    /**
      * The associated API stages of the usage plan.
      */
    val apiStages: js.UndefOr[
        Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage]]]
      ] = js.native
    
    /**
      * Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of a usage plan.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the usage plan.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
      */
    val productCode: js.UndefOr[Input[String]] = js.native
    
    /**
      * The quota settings of the usage plan.
      */
    val quotaSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The throttling limits of the usage plan.
      */
    val throttleSettings: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings]] = js.native
  }
  object UsagePlanState {
    
    @scala.inline
    def apply(): UsagePlanState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsagePlanState]
    }
    
    @scala.inline
    implicit class UsagePlanStateMutableBuilder[Self <: UsagePlanState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiStages(value: Input[js.Array[Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage]]]): Self = StObject.set(x, "apiStages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiStagesUndefined: Self = StObject.set(x, "apiStages", js.undefined)
      
      @scala.inline
      def setApiStagesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanApiStage]*): Self = StObject.set(x, "apiStages", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProductCode(value: Input[String]): Self = StObject.set(x, "productCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductCodeUndefined: Self = StObject.set(x, "productCode", js.undefined)
      
      @scala.inline
      def setQuotaSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanQuotaSettings]): Self = StObject.set(x, "quotaSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaSettingsUndefined: Self = StObject.set(x, "quotaSettings", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setThrottleSettings(value: Input[typingsSlinky.pulumiAws.inputMod.apigateway.UsagePlanThrottleSettings]): Self = StObject.set(x, "throttleSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleSettingsUndefined: Self = StObject.set(x, "throttleSettings", js.undefined)
    }
  }
}
