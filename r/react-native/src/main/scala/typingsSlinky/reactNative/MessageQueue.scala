package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageQueue extends js.Object {
  def getCallableModule(name: String): js.Object = js.native
  def registerCallableModule(name: String, module: js.Object): Unit = js.native
  def registerLazyCallableModule(name: String, factory: js.Function0[js.Object]): Unit = js.native
}

object MessageQueue {
  @scala.inline
  def apply(
    getCallableModule: String => js.Object,
    registerCallableModule: (String, js.Object) => Unit,
    registerLazyCallableModule: (String, js.Function0[js.Object]) => Unit
  ): MessageQueue = {
    val __obj = js.Dynamic.literal(getCallableModule = js.Any.fromFunction1(getCallableModule), registerCallableModule = js.Any.fromFunction2(registerCallableModule), registerLazyCallableModule = js.Any.fromFunction2(registerLazyCallableModule))
    __obj.asInstanceOf[MessageQueue]
  }
  @scala.inline
  implicit class MessageQueueOps[Self <: MessageQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCallableModule(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCallableModule")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterCallableModule(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCallableModule")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterLazyCallableModule(value: (String, js.Function0[js.Object]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerLazyCallableModule")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

