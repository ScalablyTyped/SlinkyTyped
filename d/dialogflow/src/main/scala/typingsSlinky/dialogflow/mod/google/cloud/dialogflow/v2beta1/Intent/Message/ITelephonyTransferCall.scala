package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TelephonyTransferCall. */
@js.native
trait ITelephonyTransferCall extends js.Object {
  /** TelephonyTransferCall phoneNumber */
  var phoneNumber: js.UndefOr[String | Null] = js.native
}

object ITelephonyTransferCall {
  @scala.inline
  def apply(): ITelephonyTransferCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITelephonyTransferCall]
  }
  @scala.inline
  implicit class ITelephonyTransferCallOps[Self <: ITelephonyTransferCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(null)
        ret
    }
  }
  
}

