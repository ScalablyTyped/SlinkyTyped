package typingsSlinky.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransportStateListener extends js.Object {
  def onClose(): Unit = js.native
  def onError(error: String): Unit = js.native
  def onOpen(): Unit = js.native
}

object ITransportStateListener {
  @scala.inline
  def apply(onClose: () => Unit, onError: String => Unit, onOpen: () => Unit): ITransportStateListener = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[ITransportStateListener]
  }
  @scala.inline
  implicit class ITransportStateListenerOps[Self <: ITransportStateListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

