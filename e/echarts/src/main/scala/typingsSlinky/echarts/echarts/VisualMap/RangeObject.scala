package typingsSlinky.echarts.echarts.VisualMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeObject extends js.Object {
  var color: js.UndefOr[String | js.Array[String]] = js.native
  var colorAlpha: js.UndefOr[Double | js.Array[Double]] = js.native
  var colorHue: js.UndefOr[Double | js.Array[Double]] = js.native
  var colorLightness: js.UndefOr[Double | js.Array[Double]] = js.native
  var colorSaturation: js.UndefOr[Double | js.Array[Double]] = js.native
  var opacity: js.UndefOr[Double | js.Array[Double]] = js.native
  var symbol: js.UndefOr[String | js.Array[String]] = js.native
  var symbolSize: js.UndefOr[Double | js.Array[Double]] = js.native
}

object RangeObject {
  @scala.inline
  def apply(): RangeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeObject]
  }
  @scala.inline
  implicit class RangeObjectOps[Self <: RangeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withColorAlpha(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withColorHue(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorHue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorHue")(js.undefined)
        ret
    }
    @scala.inline
    def withColorLightness(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorLightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorLightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorLightness")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSaturation(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSaturation")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
        ret
    }
  }
  
}

