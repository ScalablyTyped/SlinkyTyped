package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationCustomRuleMod {
  
  @JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule")
  @js.native
  class OrganizationCustomRule protected () extends CustomResource {
    /**
      * Create a OrganizationCustomRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationCustomRuleArgs) = this()
    def this(name: String, args: OrganizationCustomRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the rule
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the rule
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of AWS account identifiers to exclude from the rule
      */
    val excludedAccounts: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A string in JSON format that is passed to the AWS Config Rule Lambda Function
      */
    val inputParameters: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the rule Lambda Function
      */
    val lambdaFunctionArn: Output_[String] = js.native
    
    /**
      * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
      */
    val maximumExecutionFrequency: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the rule
      */
    val name: Output_[String] = js.native
    
    /**
      * Identifier of the AWS resource to evaluate
      */
    val resourceIdScope: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of types of AWS resources to evaluate
      */
    val resourceTypesScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Tag key of AWS resources to evaluate
      */
    val tagKeyScope: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Tag value of AWS resources to evaluate
      */
    val tagValueScope: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
      */
    val triggerTypes: Output_[js.Array[String]] = js.native
  }
  /* static members */
  object OrganizationCustomRule {
    
    /**
      * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule.get")
    @js.native
    def get(name: String, id: Input[ID]): OrganizationCustomRule = js.native
    @JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): OrganizationCustomRule = js.native
    @JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): OrganizationCustomRule = js.native
    @JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): OrganizationCustomRule = js.native
    
    /**
      * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cfg/organizationCustomRule", "OrganizationCustomRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = js.native
  }
  
  @js.native
  trait OrganizationCustomRuleArgs extends StObject {
    
    /**
      * Description of the rule
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of AWS account identifiers to exclude from the rule
      */
    val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A string in JSON format that is passed to the AWS Config Rule Lambda Function
      */
    val inputParameters: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the rule Lambda Function
      */
    val lambdaFunctionArn: Input[String] = js.native
    
    /**
      * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
      */
    val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the rule
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the AWS resource to evaluate
      */
    val resourceIdScope: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of types of AWS resources to evaluate
      */
    val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Tag key of AWS resources to evaluate
      */
    val tagKeyScope: js.UndefOr[Input[String]] = js.native
    
    /**
      * Tag value of AWS resources to evaluate
      */
    val tagValueScope: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
      */
    val triggerTypes: Input[js.Array[Input[String]]] = js.native
  }
  object OrganizationCustomRuleArgs {
    
    @scala.inline
    def apply(lambdaFunctionArn: Input[String], triggerTypes: Input[js.Array[Input[String]]]): OrganizationCustomRuleArgs = {
      val __obj = js.Dynamic.literal(lambdaFunctionArn = lambdaFunctionArn.asInstanceOf[js.Any], triggerTypes = triggerTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationCustomRuleArgs]
    }
    
    @scala.inline
    implicit class OrganizationCustomRuleArgsMutableBuilder[Self <: OrganizationCustomRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExcludedAccounts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "excludedAccounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedAccountsUndefined: Self = StObject.set(x, "excludedAccounts", js.undefined)
      
      @scala.inline
      def setExcludedAccountsVarargs(value: Input[String]*): Self = StObject.set(x, "excludedAccounts", js.Array(value :_*))
      
      @scala.inline
      def setInputParameters(value: Input[String]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
      
      @scala.inline
      def setLambdaFunctionArn(value: Input[String]): Self = StObject.set(x, "lambdaFunctionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceIdScope(value: Input[String]): Self = StObject.set(x, "resourceIdScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdScopeUndefined: Self = StObject.set(x, "resourceIdScope", js.undefined)
      
      @scala.inline
      def setResourceTypesScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceTypesScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesScopesUndefined: Self = StObject.set(x, "resourceTypesScopes", js.undefined)
      
      @scala.inline
      def setResourceTypesScopesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceTypesScopes", js.Array(value :_*))
      
      @scala.inline
      def setTagKeyScope(value: Input[String]): Self = StObject.set(x, "tagKeyScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeyScopeUndefined: Self = StObject.set(x, "tagKeyScope", js.undefined)
      
      @scala.inline
      def setTagValueScope(value: Input[String]): Self = StObject.set(x, "tagValueScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagValueScopeUndefined: Self = StObject.set(x, "tagValueScope", js.undefined)
      
      @scala.inline
      def setTriggerTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypesVarargs(value: Input[String]*): Self = StObject.set(x, "triggerTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait OrganizationCustomRuleState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the rule
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Description of the rule
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of AWS account identifiers to exclude from the rule
      */
    val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A string in JSON format that is passed to the AWS Config Rule Lambda Function
      */
    val inputParameters: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the rule Lambda Function
      */
    val lambdaFunctionArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
      */
    val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the rule
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the AWS resource to evaluate
      */
    val resourceIdScope: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of types of AWS resources to evaluate
      */
    val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Tag key of AWS resources to evaluate
      */
    val tagKeyScope: js.UndefOr[Input[String]] = js.native
    
    /**
      * Tag value of AWS resources to evaluate
      */
    val tagValueScope: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of notification types that trigger AWS Config to run an evaluation for the rule. Valid values: `ConfigurationItemChangeNotification`, `OversizedConfigurationItemChangeNotification`, and `ScheduledNotification`
      */
    val triggerTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object OrganizationCustomRuleState {
    
    @scala.inline
    def apply(): OrganizationCustomRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationCustomRuleState]
    }
    
    @scala.inline
    implicit class OrganizationCustomRuleStateMutableBuilder[Self <: OrganizationCustomRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExcludedAccounts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "excludedAccounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedAccountsUndefined: Self = StObject.set(x, "excludedAccounts", js.undefined)
      
      @scala.inline
      def setExcludedAccountsVarargs(value: Input[String]*): Self = StObject.set(x, "excludedAccounts", js.Array(value :_*))
      
      @scala.inline
      def setInputParameters(value: Input[String]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
      
      @scala.inline
      def setLambdaFunctionArn(value: Input[String]): Self = StObject.set(x, "lambdaFunctionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaFunctionArnUndefined: Self = StObject.set(x, "lambdaFunctionArn", js.undefined)
      
      @scala.inline
      def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceIdScope(value: Input[String]): Self = StObject.set(x, "resourceIdScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdScopeUndefined: Self = StObject.set(x, "resourceIdScope", js.undefined)
      
      @scala.inline
      def setResourceTypesScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceTypesScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesScopesUndefined: Self = StObject.set(x, "resourceTypesScopes", js.undefined)
      
      @scala.inline
      def setResourceTypesScopesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceTypesScopes", js.Array(value :_*))
      
      @scala.inline
      def setTagKeyScope(value: Input[String]): Self = StObject.set(x, "tagKeyScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeyScopeUndefined: Self = StObject.set(x, "tagKeyScope", js.undefined)
      
      @scala.inline
      def setTagValueScope(value: Input[String]): Self = StObject.set(x, "tagValueScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagValueScopeUndefined: Self = StObject.set(x, "tagValueScope", js.undefined)
      
      @scala.inline
      def setTriggerTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "triggerTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypesUndefined: Self = StObject.set(x, "triggerTypes", js.undefined)
      
      @scala.inline
      def setTriggerTypesVarargs(value: Input[String]*): Self = StObject.set(x, "triggerTypes", js.Array(value :_*))
    }
  }
}
