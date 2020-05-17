package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Add extends js.Object {
  def add(): Unit = js.native
}

object Add {
  @scala.inline
  def apply(add: () => Unit): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction0(add))
    __obj.asInstanceOf[Add]
  }
  @scala.inline
  implicit class AddOps[Self <: Add] (val x: Self) extends AnyVal {
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

