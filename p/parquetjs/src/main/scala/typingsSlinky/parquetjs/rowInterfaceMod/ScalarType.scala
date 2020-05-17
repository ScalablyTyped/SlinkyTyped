package typingsSlinky.parquetjs.rowInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Date
*/
trait ScalarType extends js.Object

object ScalarType {
  @scala.inline
  implicit def apply(value: Boolean): ScalarType = value.asInstanceOf[ScalarType]
  @scala.inline
  implicit def apply(value: js.Date): ScalarType = value.asInstanceOf[ScalarType]
  @scala.inline
  implicit def apply(value: Double): ScalarType = value.asInstanceOf[ScalarType]
  @scala.inline
  implicit def apply(value: String): ScalarType = value.asInstanceOf[ScalarType]
}

