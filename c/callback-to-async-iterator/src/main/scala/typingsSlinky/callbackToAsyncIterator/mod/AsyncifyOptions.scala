package typingsSlinky.callbackToAsyncIterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncifyOptions[T] extends js.Object {
  var buffering: Boolean
  def onClose(): Unit | T
  def onError(): js.Error
}

object AsyncifyOptions {
  @scala.inline
  def apply[T](buffering: Boolean, onClose: () => Unit | T, onError: () => js.Error): AsyncifyOptions[T] = {
    val __obj = js.Dynamic.literal(buffering = buffering.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction0(onError))
    __obj.asInstanceOf[AsyncifyOptions[T]]
  }
}

