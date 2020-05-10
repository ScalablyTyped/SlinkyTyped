package typingsSlinky.jschannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTransaction extends js.Object {
  def complete(result: js.Any): Unit = js.native
  def completed(): Boolean = js.native
  def delayReturn(delay: Boolean): Boolean = js.native
  def error(error: js.Any, message: String): Unit = js.native
  def invoke(callbackName: String, params: js.Any): Unit = js.native
}

object MessageTransaction {
  @scala.inline
  def apply(
    complete: js.Any => Unit,
    completed: () => Boolean,
    delayReturn: Boolean => Boolean,
    error: (js.Any, String) => Unit,
    invoke: (String, js.Any) => Unit
  ): MessageTransaction = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), completed = js.Any.fromFunction0(completed), delayReturn = js.Any.fromFunction1(delayReturn), error = js.Any.fromFunction2(error), invoke = js.Any.fromFunction2(invoke))
    __obj.asInstanceOf[MessageTransaction]
  }
  @scala.inline
  implicit class MessageTransactionOps[Self <: MessageTransaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompleted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDelayReturn(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayReturn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvoke(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

