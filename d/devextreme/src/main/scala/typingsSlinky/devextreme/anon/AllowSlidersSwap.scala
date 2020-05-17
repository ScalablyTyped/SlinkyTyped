package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.onMoving
import typingsSlinky.devextreme.devextremeStrings.onMovingComplete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowSlidersSwap extends js.Object {
  var allowSlidersSwap: js.UndefOr[Boolean] = js.native
  var animationEnabled: js.UndefOr[Boolean] = js.native
  var callValueChanged: js.UndefOr[onMoving | onMovingComplete] = js.native
  var manualRangeSelectionEnabled: js.UndefOr[Boolean] = js.native
  var moveSelectedRangeByClick: js.UndefOr[Boolean] = js.native
  var snapToTicks: js.UndefOr[Boolean] = js.native
}

object AllowSlidersSwap {
  @scala.inline
  def apply(): AllowSlidersSwap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowSlidersSwap]
  }
  @scala.inline
  implicit class AllowSlidersSwapOps[Self <: AllowSlidersSwap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSlidersSwap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSlidersSwap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSlidersSwap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSlidersSwap")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCallValueChanged(value: onMoving | onMovingComplete): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callValueChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callValueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRangeSelectionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRangeSelectionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRangeSelectionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRangeSelectionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveSelectedRangeByClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSelectedRangeByClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveSelectedRangeByClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSelectedRangeByClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapToTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapToTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapToTicks")(js.undefined)
        ret
    }
  }
  
}

