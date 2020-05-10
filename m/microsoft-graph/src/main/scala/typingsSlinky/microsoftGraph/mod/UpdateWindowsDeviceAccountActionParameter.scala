package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWindowsDeviceAccountActionParameter extends js.Object {
  // Not yet documented
  var calendarSyncEnabled: js.UndefOr[Boolean] = js.native
  // Not yet documented
  var deviceAccount: js.UndefOr[WindowsDeviceAccount] = js.native
  // Not yet documented
  var deviceAccountEmail: js.UndefOr[String] = js.native
  // Not yet documented
  var exchangeServer: js.UndefOr[String] = js.native
  // Not yet documented
  var passwordRotationEnabled: js.UndefOr[Boolean] = js.native
  // Not yet documented
  var sessionInitiationProtocalAddress: js.UndefOr[String] = js.native
}

object UpdateWindowsDeviceAccountActionParameter {
  @scala.inline
  def apply(): UpdateWindowsDeviceAccountActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWindowsDeviceAccountActionParameter]
  }
  @scala.inline
  implicit class UpdateWindowsDeviceAccountActionParameterOps[Self <: UpdateWindowsDeviceAccountActionParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarSyncEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarSyncEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarSyncEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarSyncEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceAccount(value: WindowsDeviceAccount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceAccountEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withExchangeServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExchangeServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchangeServer")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordRotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordRotationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordRotationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionInitiationProtocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInitiationProtocalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionInitiationProtocalAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInitiationProtocalAddress")(js.undefined)
        ret
    }
  }
  
}

