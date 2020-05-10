package typingsSlinky.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {string} enrollmentId UnionPay enrollment ID. This value should be passed to `tokenize`.
  * @property {boolean} smsCodeRequired UnionPay `smsCodeRequired` flag.
  * </p><b>true</b> - the user will receive an SMS code that needs to be supplied for tokenization.
  * </p><b>false</b> - the card can be immediately tokenized.
  */
@js.native
trait UnionPayEnrollPayload extends js.Object {
  var enrollmentId: String = js.native
  var smsCodeRequired: Boolean = js.native
}

object UnionPayEnrollPayload {
  @scala.inline
  def apply(enrollmentId: String, smsCodeRequired: Boolean): UnionPayEnrollPayload = {
    val __obj = js.Dynamic.literal(enrollmentId = enrollmentId.asInstanceOf[js.Any], smsCodeRequired = smsCodeRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionPayEnrollPayload]
  }
  @scala.inline
  implicit class UnionPayEnrollPayloadOps[Self <: UnionPayEnrollPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrollmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmsCodeRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsCodeRequired")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

