package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandleStickDatasetConfig
  extends CommonDatasetConfig
     with BarLineScatterCandleBubbleConfig
     with LineScatterCandleRadarConfig {
  var barSpace: js.UndefOr[Double] = js.native
  var decreasingColor: js.UndefOr[Color] = js.native
  var decreasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.native
  var increasingColor: js.UndefOr[Color] = js.native
  var increasingPaintStyle: js.UndefOr[CandleStickPaintStyle] = js.native
  var neutralColor: js.UndefOr[Color] = js.native
  var shadowColor: js.UndefOr[Color] = js.native
  var shadowColorSameAsCandle: js.UndefOr[Boolean] = js.native
  var shadowWidth: js.UndefOr[Double] = js.native
}

object CandleStickDatasetConfig {
  @scala.inline
  def apply(): CandleStickDatasetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandleStickDatasetConfig]
  }
  @scala.inline
  implicit class CandleStickDatasetConfigOps[Self <: CandleStickDatasetConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withDecreasingColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreasingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecreasingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreasingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDecreasingPaintStyle(value: CandleStickPaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreasingPaintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecreasingPaintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreasingPaintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIncreasingColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreasingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIncreasingPaintStyle(value: CandleStickPaintStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasingPaintStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreasingPaintStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increasingPaintStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNeutralColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeutralColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neutralColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColorSameAsCandle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColorSameAsCandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColorSameAsCandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColorSameAsCandle")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowWidth")(js.undefined)
        ret
    }
  }
  
}

