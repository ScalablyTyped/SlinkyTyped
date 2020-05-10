package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rule extends js.Object {
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: identifier = js.native
  /**
    * The rule ID.
    */
  var ruleId: identifier = js.native
  /**
    * The rule version.
    */
  var ruleVersion: nonEmptyString = js.native
}

object Rule {
  @scala.inline
  def apply(detectorId: identifier, ruleId: identifier, ruleVersion: nonEmptyString): Rule = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], ruleVersion = ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleVersion(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

