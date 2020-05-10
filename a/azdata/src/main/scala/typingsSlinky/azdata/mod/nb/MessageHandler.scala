package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageHandler[T /* <: IMessage */] extends js.Object {
  def handle(message: T): Unit | Thenable[Unit] = js.native
}

object MessageHandler {
  @scala.inline
  def apply[T](handle: T => Unit | Thenable[Unit]): MessageHandler[T] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[MessageHandler[T]]
  }
  @scala.inline
  implicit class MessageHandlerOps[Self[t] <: MessageHandler[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHandle(value: T => Unit | Thenable[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

