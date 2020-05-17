package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a rule that can be applies to a number of objects.
  *
  * A rule consists of a sequence of RuleTerms describing the objects to which the rule should be applied, the {@link RuleAction} which should be used on
  * the matching objects, and a parameter.
  */
@js.native
trait Rule extends js.Object {
  /**
    * the action to perform on the matching objects.
    *
    * The value can be one of the {@link RuleAction} constants.
    */
  var Action: Double = js.native
  /**
    * Some RuleActions require a parameter.
    *
    * {{table here, see documentation}}
    */
  var Parameter: String = js.native
  /** the rule terms describing the objects to which the rule should be applied. */
  var Terms: SafeArray[RuleTerm] = js.native
}

object Rule {
  @scala.inline
  def apply(Action: Double, Parameter: String, Terms: SafeArray[RuleTerm]): Rule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Terms = Terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerms(value: SafeArray[RuleTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Terms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

