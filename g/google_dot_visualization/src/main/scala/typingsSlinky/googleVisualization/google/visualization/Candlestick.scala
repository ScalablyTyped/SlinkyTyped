package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Candlestick extends js.Object {
  var fallingColor: js.UndefOr[ChartStrokeFill] = js.native
  var hollowIsRising: js.UndefOr[Boolean] = js.native
  var risingColor: js.UndefOr[ChartStrokeFill] = js.native
}

object Candlestick {
  @scala.inline
  def apply(): Candlestick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Candlestick]
  }
  @scala.inline
  implicit class CandlestickOps[Self <: Candlestick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFallingColor(value: ChartStrokeFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHollowIsRising(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hollowIsRising")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHollowIsRising: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hollowIsRising")(js.undefined)
        ret
    }
    @scala.inline
    def withRisingColor(value: ChartStrokeFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("risingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRisingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("risingColor")(js.undefined)
        ret
    }
  }
  
}

