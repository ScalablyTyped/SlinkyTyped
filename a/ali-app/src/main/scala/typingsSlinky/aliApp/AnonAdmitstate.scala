package typingsSlinky.aliApp

import typingsSlinky.aliApp.aliAppStrings.N
import typingsSlinky.aliApp.aliAppStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdmitstate extends js.Object {
  /**
  				 * 是否准入:Y:准入；N:不准入(该字段目前无实际意义)
  				 */
  var admit_state: Y | N | String = js.native
  var callbackData: js.Any = js.native
  /**
  				 * 商户发起借用服务时传入的参数，需要在借用结束后返回给商户的参数
  				 * @example
  				 * {"user_name":"john"}
  				 */
  var invoke_state: String = js.native
  /**
  				 * 芝麻信用借还订单号
  				 * @example
  				 * 10020027631
  				 */
  var order_no: String = js.native
  /**
  				 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+4位随机数
  				 * @example
  				 * 201610010000283627
  				 */
  var out_order_no: String = js.native
  /**
  				 * 物品借用/租赁者的用户id
  				 * @example
  				 * 2088202924240029
  				 */
  var user_id: String = js.native
}

object AnonAdmitstate {
  @scala.inline
  def apply(
    admit_state: Y | N | String,
    callbackData: js.Any,
    invoke_state: String,
    order_no: String,
    out_order_no: String,
    user_id: String
  ): AnonAdmitstate = {
    val __obj = js.Dynamic.literal(admit_state = admit_state.asInstanceOf[js.Any], callbackData = callbackData.asInstanceOf[js.Any], invoke_state = invoke_state.asInstanceOf[js.Any], order_no = order_no.asInstanceOf[js.Any], out_order_no = out_order_no.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdmitstate]
  }
  @scala.inline
  implicit class AnonAdmitstateOps[Self <: AnonAdmitstate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmit_state(value: Y | N | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admit_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvoke_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoke_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder_no(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order_no")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOut_order_no(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out_order_no")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

