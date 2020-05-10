package typingsSlinky.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AposModule extends js.Object {
  def emit(name: String): Unit = js.native
  def on(name: String, methodName: js.Any, fn: js.Function0[_]): Unit = js.native
}

object AposModule {
  @scala.inline
  def apply(emit: String => Unit, on: (String, js.Any, js.Function0[_]) => Unit): AposModule = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), on = js.Any.fromFunction3(on))
    __obj.asInstanceOf[AposModule]
  }
  @scala.inline
  implicit class AposModuleOps[Self <: AposModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOn(value: (String, js.Any, js.Function0[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

