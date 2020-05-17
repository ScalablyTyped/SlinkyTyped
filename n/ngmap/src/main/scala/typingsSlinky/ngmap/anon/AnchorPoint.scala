package typingsSlinky.ngmap.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.Animation
import typingsSlinky.googlemaps.google.maps.Icon
import typingsSlinky.googlemaps.google.maps.Map
import typingsSlinky.googlemaps.google.maps.MarkerShape
import typingsSlinky.googlemaps.google.maps.Point
import typingsSlinky.googlemaps.google.maps.StreetViewPanorama
import typingsSlinky.googlemaps.google.maps.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorPoint extends js.Object {
  /**
    * The offset from the marker's position to the tip of an InfoWindow
    * that has been opened with the marker as anchor.
    */
  var anchorPoint: js.UndefOr[Point] = js.native
  /** Which animation to play when marker is added to a map. */
  var animation: js.UndefOr[Animation] = js.native
  /**
    * If true, the marker receives mouse and touch events.
    * @default true
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /** Mouse cursor to show on hover. */
  var cursor: js.UndefOr[String] = js.native
  /**
    * If true, the marker can be dragged.
    * @default false
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * Icon for the foreground.
    * If a string is provided, it is treated as though it were an Icon with the string as url.
    * @type {(string|Icon|Symbol)}
    */
  var icon: js.UndefOr[String | Icon | Symbol] = js.native
  /**
    * Adds a label to the marker. The label can either be a string, or a MarkerLabel object.
    * Only the first character of the string will be displayed.
    * @type {string}
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Map on which to display Marker.
    * @type {(Map|StreetViewPanorama)}
    *
    */
  var map: js.UndefOr[Map[Element] | StreetViewPanorama] = js.native
  /** The marker's opacity between 0.0 and 1.0. */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Optimization renders many markers as a single static element.
    * Optimized rendering is enabled by default.
    * Disable optimized rendering for animated GIFs or PNGs, or when each
    * marker must be rendered as a separate DOM element (advanced usage
    * only).
    */
  var optimized: js.UndefOr[Boolean] = js.native
  /** Image map region definition used for drag/click. */
  var shape: js.UndefOr[MarkerShape] = js.native
  /** Rollover text. */
  var title: js.UndefOr[String] = js.native
  /** If true, the marker is visible. */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * All markers are displayed on the map in order of their zIndex,
    * with higher values displaying in front of markers with lower values.
    * By default, markers are displayed according to their vertical position on screen,
    * with lower markers appearing in front of markers further up the screen.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object AnchorPoint {
  @scala.inline
  def apply(): AnchorPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorPoint]
  }
  @scala.inline
  implicit class AnchorPointOps[Self <: AnchorPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
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
    def withIcon(value: String | Icon | Symbol): Self = {
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map[Element] | StreetViewPanorama): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
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
    def withOptimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimized")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: MarkerShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
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
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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

