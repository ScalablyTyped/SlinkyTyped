package typingsSlinky.reactNativeChartsWrapper.mod

import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CROSS
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TRIANGLE
import typingsSlinky.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScatterDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  var scatterShape: js.UndefOr[SQUARE | CIRCLE | TRIANGLE | CROSS | X] = js.native
  var scatterShapeHoleColor: js.UndefOr[Color] = js.native
  var scatterShapeHoleRadius: js.UndefOr[Double] = js.native
  var scatterShapeSize: js.UndefOr[Double] = js.native
}

object ScatterDatasetConfig {
  @scala.inline
  def apply(): ScatterDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScatterDatasetConfig]
  }
  @scala.inline
  implicit class ScatterDatasetConfigOps[Self <: ScatterDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScatterShape(value: SQUARE | CIRCLE | TRIANGLE | CROSS | X): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShape")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterShapeHoleColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShapeHoleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterShapeHoleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShapeHoleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterShapeHoleRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShapeHoleRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterShapeHoleRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShapeHoleRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterShapeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShapeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterShapeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterShapeSize")(js.undefined)
        ret
    }
  }
  
}

