package typingsSlinky.googlemaps.google.maps.visualization

import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.MVCArray
import typingsSlinky.googlemaps.google.maps.MVCObject
import typingsSlinky.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapLayer extends MVCObject {
  
  def getData(): MVCArray[LatLng | WeightedLocation] = js.native
  
  def getMap(): Map[Element] = js.native
  
  def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
  def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map[Element]): Unit = js.native
  
  def setOptions(options: HeatmapLayerOptions): Unit = js.native
}
