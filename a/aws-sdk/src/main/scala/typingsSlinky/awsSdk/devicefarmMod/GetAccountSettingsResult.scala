package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsResult extends js.Object {
  /**
    * The account settings.
    */
  var accountSettings: js.UndefOr[AccountSettings] = js.native
}

object GetAccountSettingsResult {
  @scala.inline
  def apply(): GetAccountSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResult]
  }
  @scala.inline
  implicit class GetAccountSettingsResultOps[Self <: GetAccountSettingsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountSettings(value: AccountSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountSettings")(js.undefined)
        ret
    }
  }
  
}

