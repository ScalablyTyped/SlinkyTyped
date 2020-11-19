package typingsSlinky.circleToPolygon

import typingsSlinky.geojson.mod.Polygon
import typingsSlinky.geojson.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("circle-to-polygon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(center: Position, radius: Double): Polygon = js.native
  def apply(center: Position, radius: Double, numberOfSegments: Double): Polygon = js.native
}
