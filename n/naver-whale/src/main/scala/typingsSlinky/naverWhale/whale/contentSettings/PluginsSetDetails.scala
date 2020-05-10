package typingsSlinky.naverWhale.whale.contentSettings

import typingsSlinky.naverWhale.naverWhaleStrings.allow
import typingsSlinky.naverWhale.naverWhaleStrings.block
import typingsSlinky.naverWhale.naverWhaleStrings.detect_important_content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsSetDetails
  extends typingsSlinky.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_PluginsSetDetails: allow | block | detect_important_content = js.native
}

object PluginsSetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | detect_important_content): PluginsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginsSetDetails]
  }
  @scala.inline
  implicit class PluginsSetDetailsOps[Self <: PluginsSetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetting(value: allow | block | detect_important_content): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

