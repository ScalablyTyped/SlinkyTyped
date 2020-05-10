package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmDeviceResponse extends js.Object {
  /**
    * Indicates whether the user confirmation is necessary to confirm the device response.
    */
  var UserConfirmationNecessary: js.UndefOr[BooleanType] = js.native
}

object ConfirmDeviceResponse {
  @scala.inline
  def apply(): ConfirmDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmDeviceResponse]
  }
  @scala.inline
  implicit class ConfirmDeviceResponseOps[Self <: ConfirmDeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserConfirmationNecessary(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserConfirmationNecessary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserConfirmationNecessary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserConfirmationNecessary")(js.undefined)
        ret
    }
  }
  
}

