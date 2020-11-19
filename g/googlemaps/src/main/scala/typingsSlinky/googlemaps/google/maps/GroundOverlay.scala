package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundOverlay extends MVCObject {
  
  def getBounds(): LatLngBounds = js.native
  
  def getMap(): Map[Element] = js.native
  
  def getOpacity(): Double = js.native
  
  def getUrl(): String = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
}
