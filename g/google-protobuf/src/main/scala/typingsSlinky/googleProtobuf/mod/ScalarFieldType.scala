package typingsSlinky.googleProtobuf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
*/
trait ScalarFieldType extends AnyFieldType

object ScalarFieldType {
  @scala.inline
  implicit def apply(value: Boolean): ScalarFieldType = value.asInstanceOf[ScalarFieldType]
  @scala.inline
  implicit def apply(value: Double): ScalarFieldType = value.asInstanceOf[ScalarFieldType]
  @scala.inline
  implicit def apply(value: String): ScalarFieldType = value.asInstanceOf[ScalarFieldType]
}

