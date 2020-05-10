package typingsSlinky.ldclientJsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDEvaluationReason extends js.Object {
  /**
    * A further description of the error condition, if the kind was `'ERROR'`.
    */
  var errorKind: js.UndefOr[String] = js.native
  /**
    * The general category of the reason:
    *
    * - `'OFF'`: The flag was off and therefore returned its configured off value.
    * - `'FALLTHROUGH'`: The flag was on but the user did not match any targets or rules.
    * - `'TARGET_MATCH'`: The user key was specifically targeted for this flag.
    * - `'RULE_MATCH'`: the user matched one of the flag's rules.
    * - `'PREREQUISITE_FAILED'`: The flag was considered off because it had at least one
    *   prerequisite flag that either was off or did not return the desired variation.
    * - `'ERROR'`: The flag could not be evaluated, e.g. because it does not exist or due
    *   to an unexpected error.
    */
  var kind: String = js.native
  /**
    * The key of the failed prerequisite flag, if the kind was `'PREREQUISITE_FAILED'`.
    */
  var prerequisiteKey: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the matched rule, if the kind was `'RULE_MATCH'`.
    */
  var ruleId: js.UndefOr[String] = js.native
  /**
    * The index of the matched rule (0 for the first), if the kind was `'RULE_MATCH'`.
    */
  var ruleIndex: js.UndefOr[Double] = js.native
}

object LDEvaluationReason {
  @scala.inline
  def apply(kind: String): LDEvaluationReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDEvaluationReason]
  }
  @scala.inline
  implicit class LDEvaluationReasonOps[Self <: LDEvaluationReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorKind")(js.undefined)
        ret
    }
    @scala.inline
    def withPrerequisiteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequisiteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerequisiteKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerequisiteKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleIndex")(js.undefined)
        ret
    }
  }
  
}

