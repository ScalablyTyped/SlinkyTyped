package typingsSlinky.antDesignReactNative.modalPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.antDesignReactNative.modalPropsTypeMod.Callback
  - js.Array[typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action[T]]
*/
trait CallbackOrActions[T] extends js.Object

object CallbackOrActions {
  @scala.inline
  implicit def apply[T](value: js.Array[Action[T]]): CallbackOrActions[T] = value.asInstanceOf[CallbackOrActions[T]]
  @scala.inline
  implicit def apply[T](value: Callback): CallbackOrActions[T] = value.asInstanceOf[CallbackOrActions[T]]
}

