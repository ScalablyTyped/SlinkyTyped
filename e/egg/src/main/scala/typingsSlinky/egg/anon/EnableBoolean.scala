package typingsSlinky.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableBoolean extends js.Object {
  var enable: Boolean = js.native
}

object EnableBoolean {
  @scala.inline
  def apply(enable: Boolean): EnableBoolean = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableBoolean]
  }
  @scala.inline
  implicit class EnableBooleanOps[Self <: EnableBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

