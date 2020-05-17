package typingsSlinky.dayzed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateObj extends js.Object {
  var dateObj: typingsSlinky.dayzed.mod.DateObj = js.native
}

object DateObj {
  @scala.inline
  def apply(dateObj: typingsSlinky.dayzed.mod.DateObj): DateObj = {
    val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObj]
  }
  @scala.inline
  implicit class DateObjOps[Self <: DateObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateObj(value: typingsSlinky.dayzed.mod.DateObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateObj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

