package typingsSlinky.googlemaps.google.maps.drawing

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.MVCObject
import typingsSlinky.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.drawing.DrawingManager")
@js.native
class DrawingManager () extends MVCObject {
  def this(options: DrawingManagerOptions) = this()
  def getDrawingMode(): OverlayType = js.native
  def getMap(): Map[Element] = js.native
  def setDrawingMode(): Unit = js.native
  def setDrawingMode(drawingMode: OverlayType): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setOptions(options: DrawingManagerOptions): Unit = js.native
}

