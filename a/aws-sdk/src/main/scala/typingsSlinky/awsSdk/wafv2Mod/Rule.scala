package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * The action that AWS WAF should take on a web request when it matches the rule's statement. Settings at the web ACL level can override the rule action setting. 
    */
  var Action: js.UndefOr[RuleAction] = js.native
  /**
    * A friendly name of the rule. You can't change the name of a Rule after you create it. 
    */
  var Name: EntityName = js.native
  /**
    * The action to use to override the rule's Action setting. You can use no override action, in which case the rule action is in effect, or count action, in which case, if the rule matches a web request, it only counts the match.
    */
  var OverrideAction: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.OverrideAction] = js.native
  /**
    * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the Rules in order based on the value of Priority. AWS WAF processes rules with lower priority first. The priorities don't need to be consecutive, but they must all be different.
    */
  var Priority: RulePriority = js.native
  /**
    * The AWS WAF processing statement for the rule, for example ByteMatchStatement or SizeConstraintStatement. 
    */
  var Statement: typingsSlinky.awsSdk.wafv2Mod.Statement = js.native
  /**
    * Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: typingsSlinky.awsSdk.wafv2Mod.VisibilityConfig = js.native
}

object Rule {
  @scala.inline
  def apply(Name: EntityName, Priority: RulePriority, Statement: Statement, VisibilityConfig: VisibilityConfig): Rule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], VisibilityConfig = VisibilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: RulePriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement(value: Statement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisibilityConfig(value: VisibilityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibilityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: RuleAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideAction(value: OverrideAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverrideAction")(js.undefined)
        ret
    }
  }
  
}

