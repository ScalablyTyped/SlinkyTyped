package typingsSlinky.javascriptObfuscator.threadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thread[T, U] extends js.Object {
  var killed: Boolean = js.native
  def kill(): Unit = js.native
  def on(eventType: String, responseCallback: ResponseCallback[U]): Thread[T, U] = js.native
  def send(data: T): Thread[T, U] = js.native
}

object Thread {
  @scala.inline
  def apply[T, U](
    kill: () => Unit,
    killed: Boolean,
    on: (String, ResponseCallback[U]) => Thread[T, U],
    send: T => Thread[T, U]
  ): Thread[T, U] = {
    val __obj = js.Dynamic.literal(kill = js.Any.fromFunction0(kill), killed = killed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Thread[T, U]]
  }
  @scala.inline
  implicit class ThreadOps[Self[t, u] <: Thread[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withKill(value: () => Unit): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKilled(value: Boolean): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("killed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: (String, ResponseCallback[U]) => Thread[T, U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSend(value: T => Thread[T, U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

