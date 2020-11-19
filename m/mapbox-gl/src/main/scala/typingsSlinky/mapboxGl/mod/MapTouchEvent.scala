package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.mapboxGl.mapboxGlStrings.touchcancel
import typingsSlinky.mapboxGl.mapboxGlStrings.touchend
import typingsSlinky.mapboxGl.mapboxGlStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "MapTouchEvent")
@js.native
class MapTouchEvent () extends MapboxEvent[TouchEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  var lngLat: LngLat = js.native
  
  var lngLats: js.Array[LngLat] = js.native
  
  var point: Point = js.native
  
  var points: js.Array[Point] = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapTouchEvent: touchstart | touchend | touchcancel = js.native
}
