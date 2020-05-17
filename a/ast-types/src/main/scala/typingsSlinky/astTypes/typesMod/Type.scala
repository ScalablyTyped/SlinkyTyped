package typingsSlinky.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.typesMod.ArrayType[T]
  - typingsSlinky.astTypes.typesMod.IdentityType[T]
  - typingsSlinky.astTypes.typesMod.ObjectType[T]
  - typingsSlinky.astTypes.typesMod.OrType[T]
  - typingsSlinky.astTypes.typesMod.PredicateType[T]
*/
trait Type[T] extends js.Object

object Type {
  @scala.inline
  implicit def apply[T](value: ArrayType[T]): Type[T] = value.asInstanceOf[Type[T]]
  @scala.inline
  implicit def apply[T](value: IdentityType[T]): Type[T] = value.asInstanceOf[Type[T]]
  @scala.inline
  implicit def apply[T](value: ObjectType[T]): Type[T] = value.asInstanceOf[Type[T]]
  @scala.inline
  implicit def apply[T](value: OrType[T]): Type[T] = value.asInstanceOf[Type[T]]
  @scala.inline
  implicit def apply[T](value: PredicateType[T]): Type[T] = value.asInstanceOf[Type[T]]
}

