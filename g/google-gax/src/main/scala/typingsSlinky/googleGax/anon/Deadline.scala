package typingsSlinky.googleGax.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deadline extends js.Object {
  var deadline: js.UndefOr[js.Date] = js.native
}

object Deadline {
  @scala.inline
  def apply(): Deadline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deadline]
  }
  @scala.inline
  implicit class DeadlineOps[Self <: Deadline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeadline(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deadline")(js.undefined)
        ret
    }
  }
  
}

