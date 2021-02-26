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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "MapMouseEvent")
@js.native
class MapMouseEvent () extends MapboxEvent[MouseEvent] {
  
  var defaultPrevented: Boolean = js.native
  
  var lngLat: LngLat = js.native
  
  var point: Point = js.native
  
  def preventDefault(): Unit = js.native
  
  @JSName("type")
  var type_MapMouseEvent: mousedown | mouseup | click | dblclick | mousemove | mouseover | mouseenter | mouseleave | mouseout | contextmenu = js.native
}
