package typingsSlinky.mapboxGeojsonExtent

import typingsSlinky.geojson.mod.BBox
import typingsSlinky.geojson.mod.GeoJSON
import typingsSlinky.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/geojson-extent", JSImport.Namespace)
  @js.native
  def apply(geoJson: GeoJSON): BBox = js.native
  
  @JSImport("@mapbox/geojson-extent", "bboxify")
  @js.native
  def bboxify(geoJson: GeoJSON): GeoJSON = js.native
  
  @JSImport("@mapbox/geojson-extent", "polygon")
  @js.native
  def polygon(geoJson: GeoJSON): Polygon | Null = js.native
}
