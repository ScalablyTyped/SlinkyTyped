package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.anon.Phase
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CUBIC_BEZIER
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL_BEZIER
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINEAR
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.STEPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig
     with LineRadarConfig {
  var circleColor: js.UndefOr[Color] = js.native
  var circleColors: js.UndefOr[js.Array[Color]] = js.native
  var circleHoleColor: js.UndefOr[Color] = js.native
  var circleRadius: js.UndefOr[Double] = js.native
  var dashedLine: js.UndefOr[Phase] = js.native
  var drawCircleHole: js.UndefOr[Boolean] = js.native
  var drawCircles: js.UndefOr[Boolean] = js.native
  var drawCubicIntensity: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER] = js.native
}

object LineDatasetConfig {
  @scala.inline
  def apply(): LineDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineDatasetConfig]
  }
  @scala.inline
  implicit class LineDatasetConfigOps[Self <: LineDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircleColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleColors(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleColors")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleHoleColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleHoleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleHoleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleHoleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCircleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircleRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circleRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withDashedLine(value: Phase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashedLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashedLine")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCircleHole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCircleHole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawCircleHole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCircleHole")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCircles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCircles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawCircles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCircles")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawCubicIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCubicIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawCubicIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawCubicIntensity")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: LINEAR | STEPPED | CUBIC_BEZIER | HORIZONTAL_BEZIER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
  }
  
}

