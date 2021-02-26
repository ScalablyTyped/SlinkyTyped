package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.wafregional.RuleGroupActivatedRule
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafregionalRuleGroupMod {
  
  @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup")
  @js.native
  class RuleGroup protected () extends CustomResource {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleGroupArgs) = this()
    def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of activated rules, see below
      */
    val activatedRules: Output_[js.UndefOr[js.Array[RuleGroupActivatedRule]]] = js.native
    
    /**
      * The ARN of the WAF Regional Rule Group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A friendly name for the metrics from the rule group
      */
    val metricName: Output_[String] = js.native
    
    /**
      * A friendly name of the rule group
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object RuleGroup {
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): RuleGroup = js.native
    @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RuleGroup = js.native
    @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): RuleGroup = js.native
    @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/wafregional/ruleGroup", "RuleGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean = js.native
  }
  
  @js.native
  trait RuleGroupArgs extends StObject {
    
    /**
      * A list of activated rules, see below
      */
    val activatedRules: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]
        ]
      ] = js.native
    
    /**
      * A friendly name for the metrics from the rule group
      */
    val metricName: Input[String] = js.native
    
    /**
      * A friendly name of the rule group
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RuleGroupArgs {
    
    @scala.inline
    def apply(metricName: Input[String]): RuleGroupArgs = {
      val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleGroupArgs]
    }
    
    @scala.inline
    implicit class RuleGroupArgsMutableBuilder[Self <: RuleGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivatedRules(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]
            ]
      ): Self = StObject.set(x, "activatedRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivatedRulesUndefined: Self = StObject.set(x, "activatedRules", js.undefined)
      
      @scala.inline
      def setActivatedRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]*): Self = StObject.set(x, "activatedRules", js.Array(value :_*))
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait RuleGroupState extends StObject {
    
    /**
      * A list of activated rules, see below
      */
    val activatedRules: js.UndefOr[
        Input[
          js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]
        ]
      ] = js.native
    
    /**
      * The ARN of the WAF Regional Rule Group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name for the metrics from the rule group
      */
    val metricName: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name of the rule group
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object RuleGroupState {
    
    @scala.inline
    def apply(): RuleGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleGroupState]
    }
    
    @scala.inline
    implicit class RuleGroupStateMutableBuilder[Self <: RuleGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivatedRules(
        value: Input[
              js.Array[Input[typingsSlinky.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]]
            ]
      ): Self = StObject.set(x, "activatedRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivatedRulesUndefined: Self = StObject.set(x, "activatedRules", js.undefined)
      
      @scala.inline
      def setActivatedRulesVarargs(value: Input[typingsSlinky.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule]*): Self = StObject.set(x, "activatedRules", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setMetricName(value: Input[String]): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
