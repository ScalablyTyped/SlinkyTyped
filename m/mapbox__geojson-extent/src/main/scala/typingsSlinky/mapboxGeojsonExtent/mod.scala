package typingsSlinky.mapboxGeojsonExtent

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJSON
import typingsSlinky.geojson.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/geojson-extent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(geoJson: GeoJSON): BBox = js.native
  
  def bboxify(geoJson: GeoJSON): GeoJSON = js.native
  
  def polygon(geoJson: GeoJSON): Polygon | Null = js.native
}
