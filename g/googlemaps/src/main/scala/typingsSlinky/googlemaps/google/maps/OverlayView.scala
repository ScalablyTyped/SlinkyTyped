package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.OverlayView")
@js.native
class OverlayView () extends MVCObject {
  def draw(): Unit = js.native
  def getMap(): Map[Element] | StreetViewPanorama = js.native
  def getPanes(): MapPanes = js.native
  def getProjection(): MapCanvasProjection = js.native
  def onAdd(): Unit = js.native
  def onRemove(): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map[typingsSlinky.std.Element]): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
}

