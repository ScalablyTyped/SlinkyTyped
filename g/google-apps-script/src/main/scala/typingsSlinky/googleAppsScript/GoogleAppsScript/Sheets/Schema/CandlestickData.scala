package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandlestickData extends js.Object {
  var closeSeries: js.UndefOr[CandlestickSeries] = js.native
  var highSeries: js.UndefOr[CandlestickSeries] = js.native
  var lowSeries: js.UndefOr[CandlestickSeries] = js.native
  var openSeries: js.UndefOr[CandlestickSeries] = js.native
}

object CandlestickData {
  @scala.inline
  def apply(): CandlestickData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandlestickData]
  }
  @scala.inline
  implicit class CandlestickDataOps[Self <: CandlestickData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseSeries(value: CandlestickSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withHighSeries(value: CandlestickSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withLowSeries(value: CandlestickSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenSeries(value: CandlestickSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openSeries")(js.undefined)
        ret
    }
  }
  
}

