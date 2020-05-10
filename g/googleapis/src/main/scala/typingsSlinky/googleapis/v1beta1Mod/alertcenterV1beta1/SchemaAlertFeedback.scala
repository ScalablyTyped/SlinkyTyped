package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A customer feedback about an alert.
  */
@js.native
trait SchemaAlertFeedback extends js.Object {
  /**
    * Output only. The alert identifier.
    */
  var alertId: js.UndefOr[String] = js.native
  /**
    * Output only. The time this feedback was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier of the Google account of the customer.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Output only. The email of the user that provided the feedback.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier for the feedback.
    */
  var feedbackId: js.UndefOr[String] = js.native
  /**
    * Required. The type of the feedback.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAlertFeedback {
  @scala.inline
  def apply(): SchemaAlertFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlertFeedback]
  }
  @scala.inline
  implicit class SchemaAlertFeedbackOps[Self <: SchemaAlertFeedback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlertId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFeedbackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedbackId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

