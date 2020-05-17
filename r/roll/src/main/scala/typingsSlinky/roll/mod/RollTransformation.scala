package typingsSlinky.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.roll.mod.RollTransformationKey
  - js.Tuple2[typingsSlinky.roll.mod.RollTransformationKey, scala.Double]
  - js.Function1[/ * results * / js.Array[scala.Double], js.Array[scala.Double]]
*/
trait RollTransformation extends js.Object

object RollTransformation {
  @scala.inline
  implicit def apply(value: js.Function1[/* results */ js.Array[Double], js.Array[Double]]): RollTransformation = value.asInstanceOf[RollTransformation]
  @scala.inline
  implicit def apply(value: RollTransformationKey): RollTransformation = value.asInstanceOf[RollTransformation]
  @scala.inline
  implicit def apply(value: js.Tuple2[RollTransformationKey, Double]): RollTransformation = value.asInstanceOf[RollTransformation]
}

