package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/flat/segments", JSImport.Namespace)
@js.native
object segmentsMod extends js.Object {
  
  def forEach[T](
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    callback: js.Function2[/* p0 */ Coordinate, /* p1 */ Coordinate, T]
  ): T | Boolean = js.native
}
