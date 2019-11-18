package typingsSlinky.d3DashGeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashGeoMod {
  import typingsSlinky.geojson.geojsonMod.GeoJsonProperties
  import typingsSlinky.geojson.geojsonMod.GeometryObject

  type GeoGeometryObjects = GeometryObject | GeoSphere
  type GeoIdentityTranform = GeoIdentityTransform
  type GeoPermissibleObjects = GeoGeometryObjects | ExtendedGeometryCollection[GeoGeometryObjects] | (ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]) | (ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]])
}
