package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAriaLiveRegion extends js.Object {
  var ariaLiveRegion: js.UndefOr[AnonNavigationFromKeyboard] = js.native
  var labelLandmark: js.UndefOr[String] = js.native
}

object AnonAriaLiveRegion {
  @scala.inline
  def apply(): AnonAriaLiveRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAriaLiveRegion]
  }
  @scala.inline
  implicit class AnonAriaLiveRegionOps[Self <: AnonAriaLiveRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAriaLiveRegion(value: AnonNavigationFromKeyboard): Self = {
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

