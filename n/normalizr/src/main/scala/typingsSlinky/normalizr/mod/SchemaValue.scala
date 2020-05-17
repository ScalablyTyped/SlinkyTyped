package typingsSlinky.normalizr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.normalizr.mod.Schema_[T]
  - typingsSlinky.normalizr.mod.SchemaValueFunction[T]
*/
trait SchemaValue[T] extends js.Object

object SchemaValue {
  @scala.inline
  implicit def apply[T](value: SchemaValueFunction[T]): SchemaValue[T] = value.asInstanceOf[SchemaValue[T]]
  @scala.inline
  implicit def apply[T](value: Schema_[T]): SchemaValue[T] = value.asInstanceOf[SchemaValue[T]]
}

