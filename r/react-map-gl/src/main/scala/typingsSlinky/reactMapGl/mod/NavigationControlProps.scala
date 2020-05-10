package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationControlProps extends BaseControlProps {
  var className: js.UndefOr[String] = js.native
  var compassLabel: js.UndefOr[String] = js.native
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.native
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.native
  var showCompass: js.UndefOr[Boolean] = js.native
  var showZoom: js.UndefOr[Boolean] = js.native
  var zoomInLabel: js.UndefOr[String] = js.native
  var zoomOutLabel: js.UndefOr[String] = js.native
}

object NavigationControlProps {
  @scala.inline
  def apply(): NavigationControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlProps]
  }
  @scala.inline
  implicit class NavigationControlPropsOps[Self <: NavigationControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCompassLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compassLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompassLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compassLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewportChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewportChange")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCompass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCompass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCompass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCompass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomInLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomInLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomInLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOutLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOutLabel")(js.undefined)
        ret
    }
  }
  
}

