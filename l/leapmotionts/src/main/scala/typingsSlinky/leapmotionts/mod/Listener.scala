package typingsSlinky.leapmotionts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener extends js.Object {
  def onConnect(controller: Controller): Unit = js.native
  def onDisconnect(controller: Controller): Unit = js.native
  def onExit(controller: Controller): Unit = js.native
  def onFrame(controller: Controller, frame: Frame): Unit = js.native
  def onInit(controller: Controller): Unit = js.native
}

object Listener {
  @scala.inline
  def apply(
    onConnect: Controller => Unit,
    onDisconnect: Controller => Unit,
    onExit: Controller => Unit,
    onFrame: (Controller, Frame) => Unit,
    onInit: Controller => Unit
  ): Listener = {
    val __obj = js.Dynamic.literal(onConnect = js.Any.fromFunction1(onConnect), onDisconnect = js.Any.fromFunction1(onDisconnect), onExit = js.Any.fromFunction1(onExit), onFrame = js.Any.fromFunction2(onFrame), onInit = js.Any.fromFunction1(onInit))
    __obj.asInstanceOf[Listener]
  }
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnConnect(value: Controller => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onConnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDisconnect(value: Controller => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisconnect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnExit(value: Controller => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnFrame(value: (Controller, Frame) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFrame")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnInit(value: Controller => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

