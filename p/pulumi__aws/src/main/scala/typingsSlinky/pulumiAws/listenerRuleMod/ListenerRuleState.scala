package typingsSlinky.pulumiAws.listenerRuleMod

import typingsSlinky.pulumiAws.inputMod.alb.ListenerRuleAction
import typingsSlinky.pulumiAws.inputMod.alb.ListenerRuleCondition
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleState extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: js.UndefOr[Input[js.Array[Input[ListenerRuleAction]]]] = js.native
  /**
    * The ARN of the rule (matches `id`)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
    */
  val conditions: js.UndefOr[Input[js.Array[Input[ListenerRuleCondition]]]] = js.native
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: js.UndefOr[Input[String]] = js.native
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
}

object ListenerRuleState {
  @scala.inline
  def apply(): ListenerRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerRuleState]
  }
  @scala.inline
  implicit class ListenerRuleStateOps[Self <: ListenerRuleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Input[js.Array[Input[ListenerRuleAction]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[ListenerRuleCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withListenerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

