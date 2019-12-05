package typingsSlinky.proj4leaflet.proj4leafletMod.leafletMod.Proj

import typingsSlinky.leaflet.leafletMod.GeoJSONOptions
import typingsSlinky.proj4leaflet.proj4leafletMod.Proj4GeoJSONFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Proj.GeoJSON")
@js.native
class GeoJSON ()
  extends typingsSlinky.leaflet.leafletMod.GeoJSON[js.Any]

@JSImport("leaflet", "Proj.geoJson")
@js.native
object geoJson extends js.Object {
  def apply(): GeoJSON = js.native
  def apply(geojson: Proj4GeoJSONFeature): GeoJSON = js.native
  def apply(geojson: Proj4GeoJSONFeature, options: GeoJSONOptions[_]): GeoJSON = js.native
}

