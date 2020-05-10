package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundOverlayOptions extends js.Object {
  var displayOnMaxLevel: js.UndefOr[Double] = js.native
  var displayOnMinLevel: js.UndefOr[Double] = js.native
  var imageURL: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object GroundOverlayOptions {
  @scala.inline
  def apply(): GroundOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroundOverlayOptions]
  }
  @scala.inline
  implicit class GroundOverlayOptionsOps[Self <: GroundOverlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayOnMaxLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOnMaxLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOnMaxLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOnMaxLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOnMinLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOnMinLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOnMinLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOnMinLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withImageURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageURL")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

