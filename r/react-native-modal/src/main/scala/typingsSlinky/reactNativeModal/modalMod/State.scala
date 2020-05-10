package typingsSlinky.reactNativeModal.modalMod

import typingsSlinky.reactNative.mod.Animated.ValueXY
import typingsSlinky.reactNativeModal.typesMod.OrNull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var deviceHeight: Double = js.native
  var deviceWidth: Double = js.native
  var isSwipeable: Boolean = js.native
  var isVisible: Boolean = js.native
  var pan: OrNull[ValueXY] = js.native
  var showContent: Boolean = js.native
}

object State {
  @scala.inline
  def apply(
    deviceHeight: Double,
    deviceWidth: Double,
    isSwipeable: Boolean,
    isVisible: Boolean,
    showContent: Boolean
  ): State = {
    val __obj = js.Dynamic.literal(deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], isSwipeable = isSwipeable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSwipeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSwipeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPan(value: OrNull[ValueXY]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(null)
        ret
    }
  }
  
}

