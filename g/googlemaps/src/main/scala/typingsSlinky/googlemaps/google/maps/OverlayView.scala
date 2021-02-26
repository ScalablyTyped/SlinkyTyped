package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayView extends MVCObject {
  
  def draw(): Unit = js.native
  
  def getMap(): Map[Element] | StreetViewPanorama = js.native
  
  def getPanes(): MapPanes = js.native
  
  def getProjection(): MapCanvasProjection = js.native
  
  def onAdd(): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  def setMap(map: StreetViewPanorama): Unit = js.native
}
