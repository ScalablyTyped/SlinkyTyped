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
trait MapLayerMouseEvent extends js.Object {
  var defaultPrevented: Boolean
  var features: js.UndefOr[js.Array[MapboxGeoJSONFeature]] = js.undefined
  var lngLat: LngLat
  var originalEvent: MouseEvent
  var point: Point
  var target: Map
  var `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu
  def preventDefault(): Unit
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
    `type`: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu,
    features: js.Array[MapboxGeoJSONFeature] = null
  ): MapLayerMouseEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], lngLat = lngLat.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerMouseEvent]
  }
}

