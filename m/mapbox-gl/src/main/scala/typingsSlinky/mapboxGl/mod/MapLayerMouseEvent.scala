package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.mapboxGl.mapboxGlStrings.click
import typingsSlinky.mapboxGl.mapboxGlStrings.contextmenu
import typingsSlinky.mapboxGl.mapboxGlStrings.dblclick
import typingsSlinky.mapboxGl.mapboxGlStrings.mousedown
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseenter
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseleave
import typingsSlinky.mapboxGl.mapboxGlStrings.mousemove
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseout
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseover
import typingsSlinky.mapboxGl.mapboxGlStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mapbox-gl.mapbox-gl.MapMouseEvent & {  features ? :std.Array<mapbox-gl.mapbox-gl.MapboxGeoJSONFeature>} */
@js.native
trait MapLayerMouseEvent extends js.Object {
  var defaultPrevented: Boolean = js.native
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.native
  var lngLat: LngLat = js.native
  var originalEvent: MouseEvent = js.native
  var point: Point = js.native
  var target: Map = js.native
  var `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
  def preventDefault(): Unit = js.native
}

object MapLayerMouseEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    lngLat: LngLat,
    originalEvent: MouseEvent,
    point: Point,
    preventDefault: () => Unit,
    target: Map,
    `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
  ): MapLayerMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerMouseEvent]
  }
  @scala.inline
  implicit class MapLayerMouseEventOps[Self <: MapLayerMouseEvent] (val x: Self) extends AnyVal {
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
    def withOriginalEvent(value: MouseEvent): Self = {
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
    def withType(
      value: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
    ): Self = {
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

