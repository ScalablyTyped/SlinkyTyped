package typingsSlinky.graphqlBinding.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlBinding.typesMod.InterpolationValue
  - js.Array[
typingsSlinky.graphqlBinding.typesMod.InterpolationValue | js.Array[typingsSlinky.graphqlBinding.typesMod.InterpolationValue]]
*/
trait SimpleInterpolation extends js.Object

object SimpleInterpolation {
  @scala.inline
  implicit def apply(value: js.Array[InterpolationValue | js.Array[InterpolationValue]]): SimpleInterpolation = value.asInstanceOf[SimpleInterpolation]
  @scala.inline
  implicit def apply(value: InterpolationValue): SimpleInterpolation = value.asInstanceOf[SimpleInterpolation]
}

