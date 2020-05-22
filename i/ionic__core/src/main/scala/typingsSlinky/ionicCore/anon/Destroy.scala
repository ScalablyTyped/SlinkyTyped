package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroy extends js.Object {
  def destroy(): Unit
  def setDisabled(disabled: Boolean): Unit
  def stop(): Unit
}

object Destroy {
  @scala.inline
  def apply(destroy: () => Unit, setDisabled: Boolean => Unit, stop: () => Unit): Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setDisabled = js.Any.fromFunction1(setDisabled), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Destroy]
  }
}

