package typingsSlinky.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场行情
  */
@js.native
trait Ticker extends js.Object {
  /**
    * 买一价
    */
  var Buy: Double = js.native
  /**
    * 最高价
    */
  var High: Double = js.native
  /**
    * 最后成交价
    */
  var Last: Double = js.native
  /**
    * 最低价
    */
  var Low: Double = js.native
  /**
    * 卖一价
    */
  var Sell: Double = js.native
  var Time: Double = js.native
  /**
    * 最近成交量
    */
  var Volume: Double = js.native
}

object Ticker {
  @scala.inline
  def apply(Buy: Double, High: Double, Last: Double, Low: Double, Sell: Double, Time: Double, Volume: Double): Ticker = {
    val __obj = js.Dynamic.literal(Buy = Buy.asInstanceOf[js.Any], High = High.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Sell = Sell.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ticker]
  }
  @scala.inline
  implicit class TickerOps[Self <: Ticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHigh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("High")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSell(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

