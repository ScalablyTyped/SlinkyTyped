package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babylonjs.BABYLON.DeepImmutableObject[T]
  - typingsSlinky.babylonjs.BABYLON.DeepImmutableArray[js.Any]
  - T
*/
trait DeepImmutable[T] extends Immutable[T]

object DeepImmutable {
  @scala.inline
  implicit def apply[T](value: DeepImmutableArray[js.Any]): DeepImmutable[T] = value.asInstanceOf[DeepImmutable[T]]
  @scala.inline
  implicit def apply[T](value: DeepImmutableObject[T]): DeepImmutable[T] = value.asInstanceOf[DeepImmutable[T]]
  @scala.inline
  implicit def apply[T](value: T): DeepImmutable[T] = value.asInstanceOf[DeepImmutable[T]]
}

