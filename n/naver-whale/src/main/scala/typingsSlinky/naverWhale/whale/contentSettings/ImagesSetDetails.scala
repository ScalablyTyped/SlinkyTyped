package typingsSlinky.naverWhale.whale.contentSettings

import typingsSlinky.naverWhale.naverWhaleStrings.allow
import typingsSlinky.naverWhale.naverWhaleStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesSetDetails
  extends typingsSlinky.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_ImagesSetDetails: allow | block = js.native
}

object ImagesSetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block): ImagesSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesSetDetails]
  }
  @scala.inline
  implicit class ImagesSetDetailsOps[Self <: ImagesSetDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetting(value: allow | block): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setting")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

