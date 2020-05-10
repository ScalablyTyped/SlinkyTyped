package typingsSlinky.ckeditorCkeditor5Core

import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPriority extends js.Object {
  var priority: js.UndefOr[PriorityString | Double] = js.native
}

object AnonPriority {
  @scala.inline
  def apply(): AnonPriority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPriority]
  }
  @scala.inline
  implicit class AnonPriorityOps[Self <: AnonPriority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriority(value: PriorityString | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
  }
  
}

