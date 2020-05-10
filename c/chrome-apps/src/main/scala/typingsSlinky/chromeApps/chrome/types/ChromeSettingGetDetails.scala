package typingsSlinky.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSettingGetDetails extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.native
}

object ChromeSettingGetDetails {
  @scala.inline
  def apply(): ChromeSettingGetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeSettingGetDetails]
  }
  @scala.inline
  implicit class ChromeSettingGetDetailsOps[Self <: ChromeSettingGetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
  }
  
}

