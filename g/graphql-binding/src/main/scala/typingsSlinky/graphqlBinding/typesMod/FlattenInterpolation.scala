package typingsSlinky.graphqlBinding.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlBinding.typesMod.InterpolationValue
  - typingsSlinky.graphqlBinding.typesMod.InterpolationFunction[P]
*/
trait FlattenInterpolation[P] extends Interpolation[P]

object FlattenInterpolation {
  @scala.inline
  implicit def apply[P](value: InterpolationFunction[P]): FlattenInterpolation[P] = value.asInstanceOf[FlattenInterpolation[P]]
  @scala.inline
  implicit def apply[P](value: InterpolationValue): FlattenInterpolation[P] = value.asInstanceOf[FlattenInterpolation[P]]
}

