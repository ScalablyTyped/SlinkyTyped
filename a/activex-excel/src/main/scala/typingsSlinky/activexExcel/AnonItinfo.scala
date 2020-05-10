package typingsSlinky.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonItinfo extends js.Object {
  val itinfo: Double = js.native
  val lcid: Double = js.native
  var pptinfo: js.UndefOr[scala.Nothing] = js.native
}

object AnonItinfo {
  @scala.inline
  def apply(itinfo: Double, lcid: Double): AnonItinfo = {
    val __obj = js.Dynamic.literal(itinfo = itinfo.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItinfo]
  }
  @scala.inline
  implicit class AnonItinfoOps[Self <: AnonItinfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItinfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPptinfo(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pptinfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPptinfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pptinfo")(js.undefined)
        ret
    }
  }
  
}

