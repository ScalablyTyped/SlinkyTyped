package typingsSlinky.ckeditorCkeditor5Engine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  def add(): Unit = js.native
}

object AnonAdd {
  @scala.inline
  def apply(add: () => Unit): AnonAdd = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add))
    __obj.asInstanceOf[AnonAdd]
  }
  @scala.inline
  implicit class AnonAddOps[Self <: AnonAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

