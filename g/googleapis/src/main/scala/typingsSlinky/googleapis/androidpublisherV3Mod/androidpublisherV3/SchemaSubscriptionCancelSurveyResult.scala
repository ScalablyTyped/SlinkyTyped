package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information provided by the user when they complete the subscription
  * cancellation flow (cancellation reason survey).
  */
@js.native
trait SchemaSubscriptionCancelSurveyResult extends js.Object {
  /**
    * The cancellation reason the user chose in the survey. Possible values
    * are:   - Other  - I don&#39;t use this service enough  - Technical issues
    * - Cost-related reasons  - I found a better app
    */
  var cancelSurveyReason: js.UndefOr[Double] = js.native
  /**
    * The customized input cancel reason from the user. Only present when
    * cancelReason is 0.
    */
  var userInputCancelReason: js.UndefOr[String] = js.native
}

object SchemaSubscriptionCancelSurveyResult {
  @scala.inline
  def apply(): SchemaSubscriptionCancelSurveyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionCancelSurveyResult]
  }
  @scala.inline
  implicit class SchemaSubscriptionCancelSurveyResultOps[Self <: SchemaSubscriptionCancelSurveyResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelSurveyReason(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSurveyReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelSurveyReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelSurveyReason")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInputCancelReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInputCancelReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInputCancelReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInputCancelReason")(js.undefined)
        ret
    }
  }
  
}

