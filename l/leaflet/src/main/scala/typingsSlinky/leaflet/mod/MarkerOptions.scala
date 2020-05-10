package typingsSlinky.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends InteractiveLayerOptions {
  /** Text for the `alt` attribute of the icon image (useful for accessibility). */
  var alt: js.UndefOr[String] = js.native
  /** Whether to pan the map when dragging this marker near its edge or not. */
  var autoPan: js.UndefOr[Boolean] = js.native
  /** Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map. */
  var autoPanPadding: js.UndefOr[PointExpression] = js.native
  /** Number of pixels the map should pan by. */
  var autoPanSpeed: js.UndefOr[Double] = js.native
  /** Whether the marker is draggable with mouse/touch or not. */
  var draggable: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  /** Whether the marker can be tabbed to with a keyboard and clicked by pressing enter. */
  var keyboard: js.UndefOr[Boolean] = js.native
  /** The opacity of the marker. */
  var opacity: js.UndefOr[Double] = js.native
  /** The z-index offset used for the `riseOnHover` feature. */
  var riseOffset: js.UndefOr[Double] = js.native
  /** If `true`, the marker will get on top of others when you hover the mouse over it. */
  var riseOnHover: js.UndefOr[Boolean] = js.native
  /** `Map pane` where the markers shadow will be added. */
  var shadowPane: js.UndefOr[String] = js.native
  /** Text for the browser tooltip that appear on marker hover (no tooltip by default). */
  var title: js.UndefOr[String] = js.native
  /** Option for putting the marker on top of all others (or below). */
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
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
    def withAutoPanSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPanSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPanSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
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
    @scala.inline
    def withRiseOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riseOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiseOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riseOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withRiseOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riseOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiseOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riseOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowPane(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowPane")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(js.undefined)
        ret
    }
  }
  
}

