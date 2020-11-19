package typingsSlinky.bSpline

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("b-spline", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T]): T = js.native
  def apply[T /* <: ArrayLike[Double] */](
    t: Double,
    degree: Double,
    points: js.Array[T],
    knots: js.UndefOr[scala.Nothing],
    weights: js.Array[Double]
  ): T = js.native
  def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: js.Array[Double]): T = js.native
  def apply[T /* <: ArrayLike[Double] */](t: Double, degree: Double, points: js.Array[T], knots: js.Array[Double], weights: js.Array[Double]): T = js.native
}
