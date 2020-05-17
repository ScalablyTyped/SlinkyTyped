package typingsSlinky.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.mod.PointLike
  - js.Tuple2[scala.Double, scala.Double]
*/
trait PointCompatible extends js.Object

object PointCompatible {
  @scala.inline
  implicit def apply(value: PointLike): PointCompatible = value.asInstanceOf[PointCompatible]
  @scala.inline
  implicit def apply(value: js.Tuple2[Double, Double]): PointCompatible = value.asInstanceOf[PointCompatible]
}

