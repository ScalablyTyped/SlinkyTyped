package typingsSlinky.pythonStruct.mod

import typingsSlinky.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.long.mod.Long
  - java.lang.String
  - scala.Boolean
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  implicit def apply(value: Boolean): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: Double): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: Long): DataType = value.asInstanceOf[DataType]
  @scala.inline
  implicit def apply(value: String): DataType = value.asInstanceOf[DataType]
}

