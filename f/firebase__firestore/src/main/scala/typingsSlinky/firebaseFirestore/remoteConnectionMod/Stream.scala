package typingsSlinky.firebaseFirestore.remoteConnectionMod

import typingsSlinky.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream[I, O] extends js.Object {
  def close(): Unit = js.native
  def onClose(callback: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]): Unit = js.native
  def onMessage(callback: js.Function1[/* msg */ O, Unit]): Unit = js.native
  def onOpen(callback: js.Function0[Unit]): Unit = js.native
  def send(msg: I): Unit = js.native
}

object Stream {
  @scala.inline
  def apply[I, O](
    close: () => Unit,
    onClose: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit] => Unit,
    onMessage: js.Function1[/* msg */ O, Unit] => Unit,
    onOpen: js.Function0[Unit] => Unit,
    send: I => Unit
  ): Stream[I, O] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onClose = js.Any.fromFunction1(onClose), onMessage = js.Any.fromFunction1(onMessage), onOpen = js.Any.fromFunction1(onOpen), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Stream[I, O]]
  }
  @scala.inline
  implicit class StreamOps[Self[i, o] <: Stream[i, o], I, O] (val x: Self[I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, O]) with Other]
    @scala.inline
    def withClose(value: () => Unit): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnClose(value: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit] => Unit): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnMessage(value: js.Function1[/* msg */ O, Unit] => Unit): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnOpen(value: js.Function0[Unit] => Unit): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSend(value: I => Unit): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

