package typingsSlinky.proj4leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object proj4leafletMod {
  import typingsSlinky.geojson.geojsonMod.Feature
  import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
  import typingsSlinky.geojson.geojsonMod.GeometryObject
  import typingsSlinky.proj4leaflet.Anon_Crs

  type Proj4GeoJSONFeature = (Feature[GeometryObject, GeoJsonProperties]) with Anon_Crs
}
