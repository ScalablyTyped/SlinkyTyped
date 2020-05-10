package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.mapboxGl.mapboxGlStrings.touchcancel
import typingsSlinky.mapboxGl.mapboxGlStrings.touchend
import typingsSlinky.mapboxGl.mapboxGlStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mapbox-gl.mapbox-gl.MapTouchEvent & {  features ? :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature>} */
@js.native
trait MapLayerTouchEvent extends js.Object {
  var defaultPrevented: Boolean = js.native
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.native
  var lngLat: LngLat = js.native
  var lngLats: js.Array[LngLat] = js.native
  var originalEvent: TouchEvent = js.native
  var point: Point = js.native
  var points: js.Array[Point] = js.native
  var target: Map = js.native
  var `type`: touchstart | touchend | touchcancel = js.native
  def preventDefault(): Unit = js.native
}

object MapLayerTouchEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    lngLats: js.Array[LngLat],
    originalEvent: TouchEvent,
    point: Point,
    points: js.Array[Point],
    preventDefault: () => Unit,
    target: Map,
    `type`: touchstart | touchend | touchcancel
  ): MapLayerTouchEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], lngLats = lngLats.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerTouchEvent]
  }
  @scala.inline
  implicit class MapLayerTouchEventOps[Self <: MapLayerTouchEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLngLat(value: LngLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLngLats(value: js.Array[LngLat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngLats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalEvent(value: TouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTarget(value: Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: touchstart | touchend | touchcancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[MapboxGeoJSONFeature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
  }
  
}

