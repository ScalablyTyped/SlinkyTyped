package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRegistrationStateReason extends js.Object {
  /**
    * The code for the state reason.
    */
  var Code: js.UndefOr[TransitGatewayRegistrationState] = js.native
  /**
    * The message for the state reason.
    */
  var Message: js.UndefOr[String] = js.native
}

object TransitGatewayRegistrationStateReason {
  @scala.inline
  def apply(): TransitGatewayRegistrationStateReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRegistrationStateReason]
  }
  @scala.inline
  implicit class TransitGatewayRegistrationStateReasonOps[Self <: TransitGatewayRegistrationStateReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: TransitGatewayRegistrationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

