package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.mod.HostedFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnrollmentId extends js.Object {
  var card: js.Any = js.native
  var enrollmentId: String = js.native
  var hostedFields: HostedFields_ = js.native
  var smsCode: String = js.native
}

object AnonEnrollmentId {
  @scala.inline
  def apply(card: js.Any, enrollmentId: String, hostedFields: HostedFields_, smsCode: String): AnonEnrollmentId = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], enrollmentId = enrollmentId.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], smsCode = smsCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnrollmentId]
  }
  @scala.inline
  implicit class AnonEnrollmentIdOps[Self <: AnonEnrollmentId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCard(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnrollmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostedFields(value: HostedFields_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmsCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

