package typingsSlinky.chromeApps.chrome.system.display

import typingsSlinky.chromeApps.chromeAppsStrings.mixed
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import typingsSlinky.chromeApps.chromeAppsStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MirrorModeInfo extends js.Object {
  /**
    * The mirror mode that should be set.
    * **off**
    * Use the default mode (extended or unified desktop).
    * **normal**
    * The default source display will be mirrored to all other displays.
    * **mixed**
    * The specified source display will be mirrored to the provided destination displays. All other connected displays will be extended.
    */
  var mode: js.UndefOr[off | normal_ | mixed] = js.native
}

object MirrorModeInfo {
  @scala.inline
  def apply(): MirrorModeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MirrorModeInfo]
  }
  @scala.inline
  implicit class MirrorModeInfoOps[Self <: MirrorModeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: off | normal_ | mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

