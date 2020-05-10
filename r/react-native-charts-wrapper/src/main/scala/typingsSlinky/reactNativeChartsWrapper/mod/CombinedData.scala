package typingsSlinky.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedData extends js.Object {
  var barData: js.UndefOr[BarData] = js.native
  var bubbleData: js.UndefOr[BubbleData] = js.native
  var candleData: js.UndefOr[CandleStickData] = js.native
  var lineData: js.UndefOr[LineData] = js.native
  var scatterData: js.UndefOr[ScatterData] = js.native
}

object CombinedData {
  @scala.inline
  def apply(): CombinedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedData]
  }
  @scala.inline
  implicit class CombinedDataOps[Self <: CombinedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarData(value: BarData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barData")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleData(value: BubbleData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleData")(js.undefined)
        ret
    }
    @scala.inline
    def withCandleData(value: CandleStickData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candleData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCandleData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candleData")(js.undefined)
        ret
    }
    @scala.inline
    def withLineData(value: LineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineData")(js.undefined)
        ret
    }
    @scala.inline
    def withScatterData(value: ScatterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScatterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scatterData")(js.undefined)
        ret
    }
  }
  
}

