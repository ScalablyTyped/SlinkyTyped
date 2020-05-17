package typingsSlinky.graphqlBinding.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.graphqlBinding.typesMod.FlattenInterpolation[P]
  - js.Array[
typingsSlinky.graphqlBinding.typesMod.FlattenInterpolation[P] | js.Array[typingsSlinky.graphqlBinding.typesMod.FlattenInterpolation[P]]]
*/
trait Interpolation[P] extends js.Object

object Interpolation {
  @scala.inline
  implicit def apply[P](value: js.Array[FlattenInterpolation[P] | js.Array[FlattenInterpolation[P]]]): Interpolation[P] = value.asInstanceOf[Interpolation[P]]
  @scala.inline
  implicit def apply[P](value: FlattenInterpolation[P]): Interpolation[P] = value.asInstanceOf[Interpolation[P]]
}

