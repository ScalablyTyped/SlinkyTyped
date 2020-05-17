package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AriaLiveRegion extends js.Object {
  var ariaLiveRegion: js.UndefOr[NavigationFromKeyboard] = js.native
  var labelLandmark: js.UndefOr[String] = js.native
}

object AriaLiveRegion {
  @scala.inline
  def apply(): AriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaLiveRegion]
  }
  @scala.inline
  implicit class AriaLiveRegionOps[Self <: AriaLiveRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLiveRegion(value: NavigationFromKeyboard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLiveRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLandmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLandmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLandmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLandmark")(js.undefined)
        ret
    }
  }
  
}

