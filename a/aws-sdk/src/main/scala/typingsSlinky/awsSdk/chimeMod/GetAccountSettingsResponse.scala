package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsResponse extends js.Object {
  /**
    * The Amazon Chime account settings.
    */
  var AccountSettings: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AccountSettings] = js.native
}

object GetAccountSettingsResponse {
  @scala.inline
  def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  @scala.inline
  implicit class GetAccountSettingsResponseOps[Self <: GetAccountSettingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountSettings(value: AccountSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountSettings")(js.undefined)
        ret
    }
  }
  
}

