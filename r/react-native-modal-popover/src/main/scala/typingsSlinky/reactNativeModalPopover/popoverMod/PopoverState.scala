package typingsSlinky.reactNativeModalPopover.popoverMod

import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Geometry
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Point
import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverState extends Geometry {
  var animation: Value = js.native
  var contentSize: Size = js.native
  var isAwaitingShow: Boolean = js.native
  var visible: Boolean = js.native
}

object PopoverState {
  @scala.inline
  def apply(
    anchor: Point,
    animation: Value,
    contentSize: Size,
    isAwaitingShow: Boolean,
    origin: Point,
    placement: Placement,
    visible: Boolean
  ): PopoverState = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], isAwaitingShow = isAwaitingShow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverState]
  }
  @scala.inline
  implicit class PopoverStateOps[Self <: PopoverState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAwaitingShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAwaitingShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

