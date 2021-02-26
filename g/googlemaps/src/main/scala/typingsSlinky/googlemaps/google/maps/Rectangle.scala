package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rectangle extends MVCObject {
  
  def getBounds(): LatLngBounds = js.native
  
  def getDraggable(): Boolean = js.native
  
  def getEditable(): Boolean = js.native
  
  def getMap(): Map[Element] = js.native
  
  def getVisible(): Boolean = js.native
  
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setEditable(editable: Boolean): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOptions(options: RectangleOptions): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
}
