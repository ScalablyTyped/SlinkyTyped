package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandlestickData extends js.Object {
  /**
    * The range data (vertical axis) for the close/final value for each candle.
    * This is the top of the candle body.  If greater than the open value the
    * candle will be filled.  Otherwise the candle will be hollow.
    */
  var closeSeries: js.UndefOr[CandlestickSeries] = js.native
  /**
    * The range data (vertical axis) for the high/maximum value for each
    * candle. This is the top of the candle's center line.
    */
  var highSeries: js.UndefOr[CandlestickSeries] = js.native
  /**
    * The range data (vertical axis) for the low/minimum value for each candle.
    * This is the bottom of the candle's center line.
    */
  var lowSeries: js.UndefOr[CandlestickSeries] = js.native
  /**
    * The range data (vertical axis) for the open/initial value for each
    * candle. This is the bottom of the candle body.  If less than the close
    * value the candle will be filled.  Otherwise the candle will be hollow.
    */
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

