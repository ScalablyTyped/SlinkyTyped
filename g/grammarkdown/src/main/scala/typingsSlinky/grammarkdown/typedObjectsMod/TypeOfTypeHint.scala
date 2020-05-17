package typingsSlinky.grammarkdown.typedObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grammarkdown.typedObjectsMod.TypedObject[T]
  - js.Object
  - scala.Null
  - java.lang.String
  - scala.Double
*/
trait TypeOfTypeHint[T /* <: TypeHint */] extends js.Object

object TypeOfTypeHint {
  @scala.inline
  implicit def apply[T](value: Double): TypeOfTypeHint[T] = value.asInstanceOf[TypeOfTypeHint[T]]
  @scala.inline
  implicit def apply[T](value: Null): TypeOfTypeHint[T] = value.asInstanceOf[TypeOfTypeHint[T]]
  @scala.inline
  implicit def apply[T](value: js.Object): TypeOfTypeHint[T] = value.asInstanceOf[TypeOfTypeHint[T]]
  @scala.inline
  implicit def apply[T](value: String): TypeOfTypeHint[T] = value.asInstanceOf[TypeOfTypeHint[T]]
  @scala.inline
  implicit def apply[T](value: TypedObject[T]): TypeOfTypeHint[T] = value.asInstanceOf[TypeOfTypeHint[T]]
}

