package typingsSlinky.ldclientJsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDEvaluationDetail extends js.Object {
  /**
    * An object describing the main factor that influenced the flag evaluation value.
    */
  var reason: LDEvaluationReason = js.native
  /**
    * The result of the flag evaluation. This will be either one of the flag's variations or
    * the default value that was passed to [[LDClient.variationDetail]].
    */
  var value: LDFlagValue = js.native
  /**
    * The index of the returned value within the flag's list of variations, e.g. 0 for the
    * first variation-- or `null` if the default value was returned.
    */
  var variationIndex: js.UndefOr[Double] = js.native
}

object LDEvaluationDetail {
  @scala.inline
  def apply(reason: LDEvaluationReason, value: LDFlagValue): LDEvaluationDetail = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDEvaluationDetail]
  }
  @scala.inline
  implicit class LDEvaluationDetailOps[Self <: LDEvaluationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReason(value: LDEvaluationReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: LDFlagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariationIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variationIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariationIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variationIndex")(js.undefined)
        ret
    }
  }
  
}

