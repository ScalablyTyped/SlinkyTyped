package typingsSlinky.iscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFn extends js.Object {
  var style: String = js.native
  def fn(k: js.Any): js.Any = js.native
}

object AnonFn {
  @scala.inline
  def apply(fn: js.Any => js.Any, style: String): AnonFn = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFn]
  }
  @scala.inline
  implicit class AnonFnOps[Self <: AnonFn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFn(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

