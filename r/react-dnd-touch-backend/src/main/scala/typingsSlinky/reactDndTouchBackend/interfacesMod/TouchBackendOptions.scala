package typingsSlinky.reactDndTouchBackend.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBackendOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var delayMouseStart: js.UndefOr[Double] = js.native
  var delayTouchStart: js.UndefOr[Double] = js.native
  var enableHoverOutsideTarget: js.UndefOr[Boolean] = js.native
  var enableKeyboardEvents: js.UndefOr[Boolean] = js.native
  var enableMouseEvents: js.UndefOr[Boolean] = js.native
  var enableTouchEvents: js.UndefOr[Boolean] = js.native
  var getDropTargetElementsAtPoint: js.UndefOr[js.Function] = js.native
  var ignoreContextMenu: js.UndefOr[Boolean] = js.native
  var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.native
  var touchSlop: js.UndefOr[Double] = js.native
}

object TouchBackendOptions {
  @scala.inline
  def apply(): TouchBackendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBackendOptions]
  }
  @scala.inline
  implicit class TouchBackendOptionsOps[Self <: TouchBackendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayMouseStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMouseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayMouseStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayMouseStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDelayTouchStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTouchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHoverOutsideTarget(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverOutsideTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHoverOutsideTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHoverOutsideTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableKeyboardEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableKeyboardEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableKeyboardEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMouseEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMouseEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMouseEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTouchEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTouchEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTouchEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDropTargetElementsAtPoint(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDropTargetElementsAtPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetDropTargetElementsAtPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDropTargetElementsAtPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollAngleRanges(value: js.Array[AngleRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAngleRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollAngleRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAngleRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchSlop")(js.undefined)
        ret
    }
  }
  
}

