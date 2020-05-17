package typingsSlinky.graphqlBinding.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait InterpolationValue
  extends FlattenInterpolation[js.Any]
     with SimpleInterpolation

object InterpolationValue {
  @scala.inline
  implicit def apply(value: Boolean): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: Double): InterpolationValue = value.asInstanceOf[InterpolationValue]
  @scala.inline
  implicit def apply(value: String): InterpolationValue = value.asInstanceOf[InterpolationValue]
}

