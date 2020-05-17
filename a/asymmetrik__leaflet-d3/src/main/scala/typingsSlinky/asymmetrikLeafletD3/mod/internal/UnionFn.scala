package typingsSlinky.asymmetrikLeafletD3.mod.internal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.SimpleFn[T]
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.ObjectFn[T]
  - typingsSlinky.asymmetrikLeafletD3.mod.internal.ObjectIndexFn[T]
*/
trait UnionFn[T] extends js.Object

object UnionFn {
  @scala.inline
  implicit def apply[T](value: ObjectFn[T]): UnionFn[T] = value.asInstanceOf[UnionFn[T]]
  @scala.inline
  implicit def apply[T](value: ObjectIndexFn[T]): UnionFn[T] = value.asInstanceOf[UnionFn[T]]
  @scala.inline
  implicit def apply[T](value: SimpleFn[T]): UnionFn[T] = value.asInstanceOf[UnionFn[T]]
}

