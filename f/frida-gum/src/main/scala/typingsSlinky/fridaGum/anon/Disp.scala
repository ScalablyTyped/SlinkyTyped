package typingsSlinky.fridaGum.anon

import typingsSlinky.fridaGum.ArmRegister
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disp extends js.Object {
  var base: js.UndefOr[ArmRegister] = js.native
  var disp: Double = js.native
  var index: js.UndefOr[ArmRegister] = js.native
  var scale: Double = js.native
}

object Disp {
  @scala.inline
  def apply(disp: Double, scale: Double): Disp = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disp]
  }
  @scala.inline
  implicit class DispOps[Self <: Disp] (val x: Self) extends AnyVal {
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
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: ArmRegister): Self = {
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
    @scala.inline
    def withIndex(value: ArmRegister): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
  }
  
}

