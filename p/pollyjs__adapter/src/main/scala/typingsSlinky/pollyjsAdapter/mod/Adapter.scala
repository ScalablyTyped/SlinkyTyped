package typingsSlinky.pollyjsAdapter.mod

import typingsSlinky.pollyjsAdapter.anon.Body
import typingsSlinky.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  def connect(): Unit = js.native
  def disconnect(): Unit = js.native
  def passthroughRequest(pollyRequest: Request): js.Promise[Body] = js.native
}

object Adapter {
  @scala.inline
  def apply(connect: () => Unit, disconnect: () => Unit, passthroughRequest: Request => js.Promise[Body]): Adapter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), passthroughRequest = js.Any.fromFunction1(passthroughRequest))
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPassthroughRequest(value: Request => js.Promise[Body]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthroughRequest")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

