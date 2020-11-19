package typingsSlinky.mapboxGeojsonArea

import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.geojson.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mapbox/geojson-area", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def geometry(geo: Geometry): Double = js.native
  
  def ring(coordinates: js.Array[Position]): Double = js.native
}
