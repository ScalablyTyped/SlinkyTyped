package typingsSlinky.rsocketCore.rsocketserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSocketServer[D, M] extends js.Object {
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

object RSocketServer {
  @scala.inline
  def apply[D, M](start: () => Unit, stop: () => Unit): RSocketServer[D, M] = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RSocketServer[D, M]]
  }
  @scala.inline
  implicit class RSocketServerOps[Self[d, m] <: RSocketServer[d, m], D, M] (val x: Self[D, M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D, M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D, M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[D, M]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[D, M]) with Other]
    @scala.inline
    def withStart(value: () => Unit): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self[D, M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

