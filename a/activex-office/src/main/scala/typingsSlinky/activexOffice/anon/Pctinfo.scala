package typingsSlinky.activexOffice.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pctinfo extends js.Object {
  var pctinfo: Double = js.native
}

object Pctinfo {
  @scala.inline
  def apply(pctinfo: Double): Pctinfo = {
    val __obj = js.Dynamic.literal(pctinfo = pctinfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pctinfo]
  }
  @scala.inline
  implicit class PctinfoOps[Self <: Pctinfo] (val x: Self) extends AnyVal {
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

