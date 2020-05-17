package typingsSlinky.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.WheelOption> */
@js.native
trait PartialWheelOption extends js.Object {
  var adjustTime: js.UndefOr[Double] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var wheelItemClass: js.UndefOr[String] = js.native
  var wheelWrapperClass: js.UndefOr[String] = js.native
}

object PartialWheelOption {
  @scala.inline
  def apply(): PartialWheelOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWheelOption]
  }
  @scala.inline
  implicit class PartialWheelOptionOps[Self <: PartialWheelOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdjustTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdjustTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adjustTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelItemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelItemClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelItemClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelWrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelWrapperClass")(js.undefined)
        ret
    }
  }
  
}

