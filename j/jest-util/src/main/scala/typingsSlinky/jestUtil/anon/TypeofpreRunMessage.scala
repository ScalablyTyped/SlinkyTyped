package typingsSlinky.jestUtil.anon

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofpreRunMessage extends js.Object {
  def print(stream: WritableStream): Unit = js.native
  def remove(stream: WritableStream): Unit = js.native
}

object TypeofpreRunMessage {
  @scala.inline
  def apply(print: WritableStream => Unit, remove: WritableStream => Unit): TypeofpreRunMessage = {
    val __obj = js.Dynamic.literal(print = js.Any.fromFunction1(print), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[TypeofpreRunMessage]
  }
  @scala.inline
  implicit class TypeofpreRunMessageOps[Self <: TypeofpreRunMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrint(value: WritableStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: WritableStream => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

