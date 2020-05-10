package typingsSlinky.jspdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetContext extends js.Object {
  var style: js.Any = js.native
  def getContext(): js.Any = js.native
}

object AnonGetContext {
  @scala.inline
  def apply(getContext: () => js.Any, style: js.Any): AnonGetContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetContext]
  }
  @scala.inline
  implicit class AnonGetContextOps[Self <: AnonGetContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContext(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

