package typingsSlinky.mapboxTileCover.mod

import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/tile-cover", "geojson")
@js.native
object geojson extends js.Object {
  
  def apply(geom: Geometry, limits: Limits): FeatureCollection[Geometry, GeoJsonProperties] = js.native
}
