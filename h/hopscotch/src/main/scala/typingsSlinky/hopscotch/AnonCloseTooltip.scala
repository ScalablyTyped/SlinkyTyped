package typingsSlinky.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseTooltip extends js.Object {
  var closeTooltip: js.UndefOr[String] = js.native
  var doneBtn: js.UndefOr[String] = js.native
  var nextBtn: js.UndefOr[String] = js.native
  var prevBtn: js.UndefOr[String] = js.native
  var skipBtn: js.UndefOr[String] = js.native
  var stepNums: js.UndefOr[js.Array[String]] = js.native
}

object AnonCloseTooltip {
  @scala.inline
  def apply(): AnonCloseTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCloseTooltip]
  }
  @scala.inline
  implicit class AnonCloseTooltipOps[Self <: AnonCloseTooltip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withDoneBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoneBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doneBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withNextBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipBtn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withStepNums(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepNums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepNums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepNums")(js.undefined)
        ret
    }
  }
  
}

