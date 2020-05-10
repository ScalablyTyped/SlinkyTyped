package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.PointExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.DivOverlayOptions because Already inherited
- typingsSlinky.leaflet.mod.PopupOptions because var conflicts: className, offset, pane, zoomAnimation. Inlined autoClose, autoPan, autoPanPadding, autoPanPaddingBottomRight, autoPanPaddingTopLeft, closeButton, closeOnClick, closeOnEscapeKey, keepInView, maxHeight, maxWidth, minWidth */ @js.native
trait PopupProps extends DivOverlayProps {
  var autoClose: js.UndefOr[Boolean] = js.native
  var autoPan: js.UndefOr[Boolean] = js.native
  var autoPanPadding: js.UndefOr[PointExpression] = js.native
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.native
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closeOnEscapeKey: js.UndefOr[Boolean] = js.native
  var keepInView: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var position: js.UndefOr[LatLngExpression] = js.native
}

object PopupProps {
  @scala.inline
  def apply(): PopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupProps]
  }
  @scala.inline
  implicit class PopupPropsOps[Self <: PopupProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPan")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanPadding(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanPaddingBottomRight(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanPaddingBottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanPaddingBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanPaddingBottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPanPaddingTopLeft(value: PointExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanPaddingTopLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanPaddingTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanPaddingTopLeft")(js.undefined)
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
    def withCloseOnEscapeKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscapeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEscapeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscapeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepInView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepInView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepInView")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LatLngExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

