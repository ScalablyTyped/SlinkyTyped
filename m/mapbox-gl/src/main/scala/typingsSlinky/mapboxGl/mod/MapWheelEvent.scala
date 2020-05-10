package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.mapboxGl.mapboxGlStrings.wheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapbox-gl", "MapWheelEvent")
@js.native
class MapWheelEvent () extends MapboxEvent[WheelEvent] {
  var defaultPrevented: Boolean = js.native
  @JSName("type")
  var type_MapWheelEvent: wheel = js.native
  def preventDefault(): Unit = js.native
}

