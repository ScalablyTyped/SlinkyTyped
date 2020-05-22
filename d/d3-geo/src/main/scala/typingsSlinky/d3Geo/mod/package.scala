package typingsSlinky.d3Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeoGeometryObjects = typingsSlinky.geojson.mod.GeometryObject | typingsSlinky.d3Geo.mod.GeoSphere
  type GeoIdentityTranform = typingsSlinky.d3Geo.mod.GeoIdentityTransform
  type GeoPermissibleObjects = typingsSlinky.d3Geo.mod.GeoGeometryObjects | typingsSlinky.d3Geo.mod.ExtendedGeometryCollection[typingsSlinky.d3Geo.mod.GeoGeometryObjects] | (typingsSlinky.d3Geo.mod.ExtendedFeature[
    typingsSlinky.d3Geo.mod.GeoGeometryObjects | scala.Null, 
    typingsSlinky.geojson.mod.GeoJsonProperties
  ]) | (typingsSlinky.d3Geo.mod.ExtendedFeatureCollection[
    typingsSlinky.d3Geo.mod.ExtendedFeature[
      typingsSlinky.d3Geo.mod.GeoGeometryObjects | scala.Null, 
      typingsSlinky.geojson.mod.GeoJsonProperties
    ]
  ])
}
