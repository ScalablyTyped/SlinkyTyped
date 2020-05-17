package typingsSlinky.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 订单结构, 由GetOrder函数返回
  */
@js.native
trait Order extends js.Object {
  /**
    * 下单数量
    */
  var Amount: Double = js.native
  /**
    * 成交数量
    */
  var DealAmount: Double = js.native
  /**
    * 交易单唯一标识
    */
  var Id: String = js.native
  /**
    * 下单价格
    */
  var Price: Double = js.native
  /**
    * 订单状态, 参考常量里的订单状态
    */
  var Status: VOrderState = js.native
  var Time: Double = js.native
  /**
    * 订单类型, 参考常量里的订单类型
    */
  var Type: VOrderType = js.native
}

object Order {
  @scala.inline
  def apply(
    Amount: Double,
    DealAmount: Double,
    Id: String,
    Price: Double,
    Status: VOrderState,
    Time: Double,
    Type: VOrderType
  ): Order = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], DealAmount = DealAmount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDealAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DealAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: VOrderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: VOrderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

