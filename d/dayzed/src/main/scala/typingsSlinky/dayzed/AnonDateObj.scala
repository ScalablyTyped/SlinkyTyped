package typingsSlinky.dayzed

import typingsSlinky.dayzed.mod.DateObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateObj extends js.Object {
  var dateObj: DateObj = js.native
}

object AnonDateObj {
  @scala.inline
  def apply(dateObj: DateObj): AnonDateObj = {
    val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateObj]
  }
  @scala.inline
  implicit class AnonDateObjOps[Self <: AnonDateObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateObj(value: DateObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateObj")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

