package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSMBGuestPasswordInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file gateway the SMB file share is associated with.
    */
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The password that you want to set for your SMB Server.
    */
  var Password: SMBGuestPassword = js.native
}

object SetSMBGuestPasswordInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, Password: SMBGuestPassword): SetSMBGuestPasswordInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSMBGuestPasswordInput]
  }
  @scala.inline
  implicit class SetSMBGuestPasswordInputOps[Self <: SetSMBGuestPasswordInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: SMBGuestPassword): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

