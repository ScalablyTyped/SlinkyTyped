package typingsSlinky.babylonjs.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babylonjs.typesMod.DeepImmutable[T]
  - js.Array[js.Any]
  - T
*/
trait Immutable[T] extends js.Object

object Immutable {
  @scala.inline
  implicit def apply[T](value: js.Array[js.Any]): Immutable[T] = value.asInstanceOf[Immutable[T]]
  @scala.inline
  implicit def apply[T](value: DeepImmutable[T]): Immutable[T] = value.asInstanceOf[Immutable[T]]
  @scala.inline
  implicit def apply[T](value: T): Immutable[T] = value.asInstanceOf[Immutable[T]]
}

