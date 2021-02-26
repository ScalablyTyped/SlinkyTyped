package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 购买IAP商品交易信息对象
  * 描述购买的IAP商品交易详细信息，如购买商品信息、交易日期、订单标识等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentIAPTransaction extends StObject {
  
  /**
    * 购买商品的信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var payment: js.UndefOr[String] = js.native
  
  /**
    * 购买商品的交易日期
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionDate: js.UndefOr[String] = js.native
  
  /**
    * 购买商品的交易订单标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionIdentifier: js.UndefOr[String] = js.native
  
  /**
    * 购买商品的交易收据
    * base64编码格式字符串数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionReceipt: js.UndefOr[String] = js.native
  
  /**
    * 购买商品的交易状态
    * 可取值："1"为支付成功；"2"为支付失败；"3"为支付已恢复。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var transactionState: js.UndefOr[String] = js.native
}
object PlusPaymentIAPTransaction {
  
  @scala.inline
  def apply(): PlusPaymentIAPTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentIAPTransaction]
  }
  
  @scala.inline
  implicit class PlusPaymentIAPTransactionMutableBuilder[Self <: PlusPaymentIAPTransaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
    
    @scala.inline
    def setTransactionDate(value: String): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionDateUndefined: Self = StObject.set(x, "transactionDate", js.undefined)
    
    @scala.inline
    def setTransactionIdentifier(value: String): Self = StObject.set(x, "transactionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdentifierUndefined: Self = StObject.set(x, "transactionIdentifier", js.undefined)
    
    @scala.inline
    def setTransactionReceipt(value: String): Self = StObject.set(x, "transactionReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionReceiptUndefined: Self = StObject.set(x, "transactionReceipt", js.undefined)
    
    @scala.inline
    def setTransactionState(value: String): Self = StObject.set(x, "transactionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionStateUndefined: Self = StObject.set(x, "transactionState", js.undefined)
  }
}
