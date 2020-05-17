package typingsSlinky.normalizr.mod

import typingsSlinky.normalizr.mod.schema.Entity
import typingsSlinky.normalizr.mod.schema.Object
import typingsSlinky.normalizr.mod.schema.Union
import typingsSlinky.normalizr.mod.schema.Values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.normalizr.mod.schema.Entity[T]
  - typingsSlinky.normalizr.mod.schema.Object[T]
  - typingsSlinky.normalizr.mod.schema.Union[T]
  - typingsSlinky.normalizr.mod.schema.Values[T]
  - typingsSlinky.normalizr.mod.SchemaObject[T]
  - typingsSlinky.normalizr.mod.SchemaArray[T]
*/
trait Schema_[T] extends SchemaValue[T]

object Schema_ {
  @scala.inline
  implicit def apply[T](value: Entity[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
  @scala.inline
  implicit def apply[T](value: Object[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
  @scala.inline
  implicit def apply[T](value: SchemaArray[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
  @scala.inline
  implicit def apply[T](value: SchemaObject[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
  @scala.inline
  implicit def apply[T](value: Union[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
  @scala.inline
  implicit def apply[T](value: Values[T]): Schema_[T] = value.asInstanceOf[Schema_[T]]
}

