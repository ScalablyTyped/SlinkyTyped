package typingsSlinky.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
/*=============================微信支付================================*/
@js.native
trait IchooseWXPay extends BaseParams {
   // 支付签名随机串，不长于 32 位
  @JSName("package")
  var _package: String = js.native
   // 支付签名时间戳，注意微信jssdk中的所有使用timestamp字段均为小写。但最新版的支付后台生成签名使用的timeStamp字段名需大写其中的S字符
  var nonceStr: String = js.native
   // 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
  var paySign: String = js.native
   // 统一支付接口返回的prepay_id参数值，提交格式如：prepay_id=***）
  var signType: String = js.native
  var timestamp: Double = js.native
   // 支付签名
  // 支付成功后的回调函数
  @JSName("success")
  def success_MIchooseWXPay(res: js.Any): Unit = js.native
}

object IchooseWXPay {
  @scala.inline
  def apply(
    _package: String,
    nonceStr: String,
    paySign: String,
    signType: String,
    success: js.Any => Unit,
    timestamp: Double
  ): IchooseWXPay = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], signType = signType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[IchooseWXPay]
  }
  @scala.inline
  implicit class IchooseWXPayOps[Self <: IchooseWXPay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_package(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceStr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaySign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paySign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

