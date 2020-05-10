package typingsSlinky.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPctinfo extends js.Object {
  var pctinfo: Double = js.native
}

object AnonPctinfo {
  @scala.inline
  def apply(pctinfo: Double): AnonPctinfo = {
    val __obj = js.Dynamic.literal(pctinfo = pctinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPctinfo]
  }
  @scala.inline
  implicit class AnonPctinfoOps[Self <: AnonPctinfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPctinfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pctinfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

