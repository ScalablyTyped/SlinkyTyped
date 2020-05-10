package typingsSlinky.naverWhale.whale.contentSettings

import typingsSlinky.naverWhale.naverWhaleStrings.allow
import typingsSlinky.naverWhale.naverWhaleStrings.block
import typingsSlinky.naverWhale.naverWhaleStrings.session_only
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSetDetails
  extends typingsSlinky.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_CookieSetDetails: allow | block | session_only = js.native
}

object CookieSetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | session_only): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSetDetails]
  }
  @scala.inline
  implicit class CookieSetDetailsOps[Self <: CookieSetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetting(value: allow | block | session_only): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

