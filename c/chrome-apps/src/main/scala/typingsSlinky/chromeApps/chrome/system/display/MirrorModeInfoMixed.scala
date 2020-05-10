package typingsSlinky.chromeApps.chrome.system.display

import typingsSlinky.chromeApps.chromeAppsStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MirrorModeInfoMixed extends MirrorModeInfo {
  /** The ids of the mirroring destination displays. */
  var mirroringDestinationIds: js.UndefOr[js.Array[String]] = js.native
  var mirroringSourceId: js.UndefOr[String] = js.native
  @JSName("mode")
  var mode_MirrorModeInfoMixed: mixed = js.native
}

object MirrorModeInfoMixed {
  @scala.inline
  def apply(mode: mixed): MirrorModeInfoMixed = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MirrorModeInfoMixed]
  }
  @scala.inline
  implicit class MirrorModeInfoMixedOps[Self <: MirrorModeInfoMixed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirroringDestinationIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroringDestinationIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirroringDestinationIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroringDestinationIds")(js.undefined)
        ret
    }
    @scala.inline
    def withMirroringSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroringSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMirroringSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroringSourceId")(js.undefined)
        ret
    }
  }
  
}

