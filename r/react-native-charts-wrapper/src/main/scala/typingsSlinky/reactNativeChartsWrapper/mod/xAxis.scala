package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTH_SIDED
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_INSIDE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_INSIDE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait xAxis extends Axis {
  var avoidFirstLastClipping: js.UndefOr[Boolean] = js.native
  var labelRotationAngle: js.UndefOr[Double] = js.native
  var position: js.UndefOr[TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE] = js.native
  var yOffset: js.UndefOr[Double] = js.native
}

object xAxis {
  @scala.inline
  def apply(): xAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[xAxis]
  }
  @scala.inline
  implicit class xAxisOps[Self <: xAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidFirstLastClipping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFirstLastClipping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidFirstLastClipping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidFirstLastClipping")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelRotationAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotationAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelRotationAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelRotationAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withYOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yOffset")(js.undefined)
        ret
    }
  }
  
}

