package typingsSlinky.leafletHeat.mod

import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.TileLayer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatLayer_ extends TileLayer_ {
  def addLatLng(latlng: LatLng_): HeatLayer_ = js.native
  def addLatLng(latlng: HeatLatLngTuple): HeatLayer_ = js.native
  def setLatLngs(latlngs: js.Array[LatLng_ | HeatLatLngTuple]): HeatLayer_ = js.native
  def setOptions(options: HeatMapOptions): HeatLayer_ = js.native
}

