package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlash extends js.Object {
  def flash(): Unit = js.native
  def teardown(): Unit = js.native
}

object AnonFlash {
  @scala.inline
  def apply(flash: () => Unit, teardown: () => Unit): AnonFlash = {
    val __obj = js.Dynamic.literal(flash = js.Any.fromFunction0(flash), teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AnonFlash]
  }
  @scala.inline
  implicit class AnonFlashOps[Self <: AnonFlash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlash(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTeardown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teardown")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

