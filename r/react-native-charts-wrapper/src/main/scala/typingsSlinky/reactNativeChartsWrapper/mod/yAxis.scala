package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.anon.Enabled
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.INSIDE_CHART
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.OUTSIDE_CHART
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait yAxis extends Axis {
  var inverted: js.UndefOr[Boolean] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var position: js.UndefOr[OUTSIDE_CHART | INSIDE_CHART] = js.native
  var spaceBottom: js.UndefOr[Double] = js.native
  var spaceTop: js.UndefOr[Double] = js.native
  var zeroLine: js.UndefOr[Enabled] = js.native
}

object yAxis {
  @scala.inline
  def apply(): yAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[yAxis]
  }
  @scala.inline
  implicit class yAxisOps[Self <: yAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverted")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: OUTSIDE_CHART | INSIDE_CHART): Self = {
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
    def withSpaceBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceTop")(js.undefined)
        ret
    }
    @scala.inline
    def withZeroLine(value: Enabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZeroLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zeroLine")(js.undefined)
        ret
    }
  }
  
}

