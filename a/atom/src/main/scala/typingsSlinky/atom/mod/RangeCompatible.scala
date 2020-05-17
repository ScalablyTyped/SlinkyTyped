package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.mod.RangeLike
  - js.Tuple2[
typingsSlinky.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
typingsSlinky.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])]
*/
trait RangeCompatible extends js.Object

object RangeCompatible {
  @scala.inline
  implicit def apply(value: RangeLike): RangeCompatible = value.asInstanceOf[RangeCompatible]
  @scala.inline
  implicit def apply(value: js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])]): RangeCompatible = value.asInstanceOf[RangeCompatible]
}

