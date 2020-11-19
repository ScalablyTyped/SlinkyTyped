package typingsSlinky.googlemaps.google.maps.drawing

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.MVCObject
import typingsSlinky.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawingManager extends MVCObject {
  
  def getDrawingMode(): OverlayType = js.native
  
  def getMap(): Map[Element] = js.native
  
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: OverlayType): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOptions(options: DrawingManagerOptions): Unit = js.native
}
