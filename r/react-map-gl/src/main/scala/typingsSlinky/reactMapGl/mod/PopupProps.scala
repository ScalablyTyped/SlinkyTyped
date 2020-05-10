package typingsSlinky.reactMapGl.mod

import typingsSlinky.reactMapGl.reactMapGlStrings.`bottom-left`
import typingsSlinky.reactMapGl.reactMapGlStrings.`bottom-right`
import typingsSlinky.reactMapGl.reactMapGlStrings.`top-left`
import typingsSlinky.reactMapGl.reactMapGlStrings.`top-right`
import typingsSlinky.reactMapGl.reactMapGlStrings.bottom
import typingsSlinky.reactMapGl.reactMapGlStrings.left
import typingsSlinky.reactMapGl.reactMapGlStrings.right
import typingsSlinky.reactMapGl.reactMapGlStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupProps extends BaseControlProps {
  var altitude: js.UndefOr[Double] = js.native
  var anchor: js.UndefOr[
    top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right
  ] = js.native
  var className: js.UndefOr[String] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var dynamicPosition: js.UndefOr[Boolean] = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var offsetLeft: js.UndefOr[Double] = js.native
  var offsetTop: js.UndefOr[Double] = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var sortByDepth: js.UndefOr[Boolean] = js.native
  var tipSize: js.UndefOr[Double] = js.native
}

object PopupProps {
  @scala.inline
  def apply(latitude: Double, longitude: Double): PopupProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
  @scala.inline
  implicit class PopupPropsOps[Self <: PopupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchor(value: top | `top-left` | `top-right` | bottom | `bottom-left` | `bottom-right` | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButton")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnClick")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSortByDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortByDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withTipSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipSize")(js.undefined)
        ret
    }
  }
  
}

