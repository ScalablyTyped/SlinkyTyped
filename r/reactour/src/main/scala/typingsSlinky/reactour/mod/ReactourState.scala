package typingsSlinky.reactour.mod

import org.scalajs.dom.raw.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourState extends js.Object {
  var bottom: Double = js.native
  var current: Double = js.native
  var focusUnlocked: Boolean = js.native
  var h: Double = js.native
  var height: Double = js.native
  var helperHeight: js.UndefOr[Double] = js.native
  var helperPosition: js.UndefOr[ReactourStepPosition] = js.native
  var helperWidth: js.UndefOr[Double] = js.native
  var inDOM: Boolean = js.native
  var isOpen: Boolean = js.native
  var left: Double = js.native
  var observer: MutationObserver | Null = js.native
  var right: Double = js.native
  var top: Double = js.native
  var w: Double = js.native
  var width: Double = js.native
}

object ReactourState {
  @scala.inline
  def apply(
    bottom: Double,
    current: Double,
    focusUnlocked: Boolean,
    h: Double,
    height: Double,
    inDOM: Boolean,
    isOpen: Boolean,
    left: Double,
    right: Double,
    top: Double,
    w: Double,
    width: Double
  ): ReactourState = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], focusUnlocked = focusUnlocked.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inDOM = inDOM.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourState]
  }
  @scala.inline
  implicit class ReactourStateOps[Self <: ReactourState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusUnlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusUnlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelperHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperPosition(value: ReactourStepPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHelperWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelperWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helperWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withObserver(value: MutationObserver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(null)
        ret
    }
  }
  
}

