package typingsSlinky.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场深度,由GetDepth函数返回
  */
@js.native
trait Depth extends js.Object {
  /**
    * 卖单数组, MarketOrder数组, 按价格从低向高排序
    */
  var Asks: js.Array[MarketOrder] = js.native
  /**
    * 买单数组, MarketOrder数组, 按价格从高向低排序
    */
  var Bids: js.Array[MarketOrder] = js.native
  var Time: Double = js.native
}

object Depth {
  @scala.inline
  def apply(Asks: js.Array[MarketOrder], Bids: js.Array[MarketOrder], Time: Double): Depth = {
    val __obj = js.Dynamic.literal(Asks = Asks.asInstanceOf[js.Any], Bids = Bids.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
  @scala.inline
  implicit class DepthOps[Self <: Depth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsks(value: js.Array[MarketOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Asks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBids(value: js.Array[MarketOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

