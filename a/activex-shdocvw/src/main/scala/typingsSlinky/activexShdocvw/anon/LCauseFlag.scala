package typingsSlinky.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LCauseFlag extends js.Object {
  var Cancel: Boolean = js.native
  val lCauseFlag: Double = js.native
  val pWB2: js.Any = js.native
}

object LCauseFlag {
  @scala.inline
  def apply(Cancel: Boolean, lCauseFlag: Double, pWB2: js.Any): LCauseFlag = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], lCauseFlag = lCauseFlag.asInstanceOf[js.Any], pWB2 = pWB2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCauseFlag]
  }
  @scala.inline
  implicit class LCauseFlagOps[Self <: LCauseFlag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLCauseFlag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lCauseFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPWB2(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pWB2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

