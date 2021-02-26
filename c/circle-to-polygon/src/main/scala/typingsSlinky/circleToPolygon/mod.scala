package typingsSlinky.circleToPolygon

import typingsSlinky.geojson.mod.Polygon
import typingsSlinky.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("circle-to-polygon", JSImport.Namespace)
  @js.native
  def apply(center: Position, radius: Double): Polygon = js.native
  @JSImport("circle-to-polygon", JSImport.Namespace)
  @js.native
  def apply(center: Position, radius: Double, numberOfSegments: Double): Polygon = js.native
}
