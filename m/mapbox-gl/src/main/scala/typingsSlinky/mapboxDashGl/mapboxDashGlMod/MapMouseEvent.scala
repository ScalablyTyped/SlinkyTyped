package typingsSlinky.mapboxDashGl.mapboxDashGlMod

import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.click
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.contextmenu
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.dblclick
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mousedown
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mouseenter
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mouseleave
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mousemove
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mouseout
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mouseover
import typingsSlinky.mapboxDashGl.mapboxDashGlStrings.mouseup
import typingsSlinky.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapMouseEvent")
@js.native
class MapMouseEvent () extends MapboxEvent[MouseEvent] {
  var defaultPrevented: Boolean = js.native
  var lngLat: LngLat = js.native
  var point: Point = js.native
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
  def preventDefault(): Unit = js.native
}

