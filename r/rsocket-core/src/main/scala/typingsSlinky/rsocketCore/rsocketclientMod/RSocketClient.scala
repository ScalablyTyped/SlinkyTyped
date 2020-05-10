package typingsSlinky.rsocketCore.rsocketclientMod

import typingsSlinky.rsocketFlowable.mod.Single
import typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSocketClient[D, M] extends js.Object {
  def close(): Unit = js.native
  def connect(): Single[ReactiveSocket[D, M]] = js.native
}

object RSocketClient {
  @scala.inline
  def apply[D, M](close: () => Unit, connect: () => Single[ReactiveSocket[D, M]]): RSocketClient[D, M] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
    __obj.asInstanceOf[RSocketClient[D, M]]
  }
  @scala.inline
  implicit class RSocketClientOps[Self[d, m] <: RSocketClient[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withClose(value: () => Unit): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConnect(value: () => Single[ReactiveSocket[D, M]]): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

