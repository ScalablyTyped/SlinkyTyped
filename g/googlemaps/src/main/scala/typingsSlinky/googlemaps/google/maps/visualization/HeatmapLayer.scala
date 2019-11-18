package typingsSlinky.googlemaps.google.maps.visualization

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.MVCArray
import typingsSlinky.googlemaps.google.maps.MVCObject
import typingsSlinky.googlemaps.google.maps.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.visualization.HeatmapLayer")
@js.native
class HeatmapLayer () extends MVCObject {
  def this(opts: HeatmapLayerOptions) = this()
  def getData(): MVCArray[LatLng | WeightedLocation] = js.native
  def getMap(): Map = js.native
  def setData(data: js.Array[LatLng | WeightedLocation]): Unit = js.native
  def setData(data: MVCArray[LatLng | WeightedLocation]): Unit = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(options: HeatmapLayerOptions): Unit = js.native
}

