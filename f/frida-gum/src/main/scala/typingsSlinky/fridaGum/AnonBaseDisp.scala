package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseDisp extends js.Object {
  var base: js.UndefOr[MipsRegister] = js.native
  var disp: Double = js.native
}

object AnonBaseDisp {
  @scala.inline
  def apply(disp: Double): AnonBaseDisp = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseDisp]
  }
  @scala.inline
  implicit class AnonBaseDispOps[Self <: AnonBaseDisp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: MipsRegister): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
  }
  
}

