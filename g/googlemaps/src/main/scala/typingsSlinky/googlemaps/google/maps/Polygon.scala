package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends MVCObject {
  
  def getDraggable(): Boolean = js.native
  
  def getEditable(): Boolean = js.native
  
  def getMap(): Map[Element] = js.native
  
  /** Retrieves the first path. */
  def getPath(): MVCArray[LatLng] = js.native
  
  /** Retrieves the paths for this polygon. */
  def getPaths(): MVCArray[MVCArray[LatLng]] = js.native
  
  def getVisible(): Boolean = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setEditable(editable: Boolean): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOptions(options: PolygonOptions): Unit = js.native
  
  def setPath(path: js.Array[LatLng | LatLngLiteral]): Unit = js.native
  def setPath(path: MVCArray[LatLng]): Unit = js.native
  
  def setPaths(paths: js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral]): Unit = js.native
  def setPaths(paths: MVCArray[LatLng | MVCArray[LatLng]]): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
}
