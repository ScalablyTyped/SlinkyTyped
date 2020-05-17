package typingsSlinky.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowColor extends js.Object {
  var arrowColor: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var beaconSize: js.UndefOr[Double] = js.native
  var overlayColor: js.UndefOr[String] = js.native
  var primaryColor: js.UndefOr[String] = js.native
  var spotlightShadow: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var width: js.UndefOr[String | Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object ArrowColor {
  @scala.inline
  def apply(): ArrowColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrowColor]
  }
  @scala.inline
  implicit class ArrowColorOps[Self <: ArrowColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBeaconSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeaconSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beaconSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotlightShadow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotlightShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotlightShadow")(js.undefined)
        ret
    }
    @scala.inline
    def withTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

