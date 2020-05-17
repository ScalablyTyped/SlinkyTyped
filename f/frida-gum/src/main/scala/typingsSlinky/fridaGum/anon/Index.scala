package typingsSlinky.fridaGum.anon

import typingsSlinky.fridaGum.Arm64Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var base: js.UndefOr[Arm64Register] = js.native
  var disp: Double = js.native
  var index: js.UndefOr[Arm64Register] = js.native
}

object Index {
  @scala.inline
  def apply(disp: Double): Index = {
    val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def withBase(value: Arm64Register): Self = {
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
    def withIndex(value: Arm64Register): Self = {
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

