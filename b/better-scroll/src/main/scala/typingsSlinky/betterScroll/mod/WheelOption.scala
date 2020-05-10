package typingsSlinky.betterScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WheelOption extends js.Object {
  var adjustTime: Double = js.native
  var rotate: Double = js.native
  var selectedIndex: Double = js.native
  var wheelItemClass: String = js.native
  var wheelWrapperClass: String = js.native
}

object WheelOption {
  @scala.inline
  def apply(
    adjustTime: Double,
    rotate: Double,
    selectedIndex: Double,
    wheelItemClass: String,
    wheelWrapperClass: String
  ): WheelOption = {
    val __obj = js.Dynamic.literal(adjustTime = adjustTime.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], wheelItemClass = wheelItemClass.asInstanceOf[js.Any], wheelWrapperClass = wheelWrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelOption]
  }
  @scala.inline
  implicit class WheelOptionOps[Self <: WheelOption] (val x: Self) extends AnyVal {
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
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheelItemClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelItemClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheelWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelWrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

