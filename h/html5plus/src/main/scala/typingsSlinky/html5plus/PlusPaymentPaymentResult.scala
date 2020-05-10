package typingsSlinky.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 支付操作结果对象
  * PaymentResult对象表示支付操作返回结果，用于确认支付操作成功。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentPaymentResult extends js.Object {
  /**
    * 支付通道对象
    * 用于发起支付操作的支付通道对象。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var channel: js.UndefOr[PlusPaymentPaymentChannel] = js.native
  /**
    * 交易描述信息
    * 如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var description: js.UndefOr[Boolean] = js.native
  /**
    * 支付平台返回的原始数据
    * 如果支付平台返回key-value类型字符串，则组合成符合JSON格式的字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var rawdata: js.UndefOr[String] = js.native
  /**
    * 支付操作指纹信息
    * 用于向支付平台查询支付订单信息，如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var signature: js.UndefOr[String] = js.native
  /**
    * 交易编号信息
    * 如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var tradeno: js.UndefOr[String] = js.native
  /**
    * 查找支付交易信息地址
    * 用于向支付平台查询交易信息，如果支付平台不支持此数据则返回undefined。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var url: js.UndefOr[Boolean] = js.native
}

object PlusPaymentPaymentResult {
  @scala.inline
  def apply(): PlusPaymentPaymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentPaymentResult]
  }
  @scala.inline
  implicit class PlusPaymentPaymentResultOps[Self <: PlusPaymentPaymentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: PlusPaymentPaymentChannel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withRawdata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawdata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawdata")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withTradeno(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tradeno")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTradeno: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tradeno")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

