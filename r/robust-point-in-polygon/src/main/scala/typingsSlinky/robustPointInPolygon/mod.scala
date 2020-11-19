package typingsSlinky.robustPointInPolygon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("robust-point-in-polygon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(vs: js.Array[Point], point: Point): Double = js.native
  
  type Point = js.Tuple2[Double, Double]
}
