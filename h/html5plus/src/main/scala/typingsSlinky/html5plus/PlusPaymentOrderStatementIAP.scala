package typingsSlinky.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IAP订单数据对象
  * 描述IAP商品订单信息，如标识、数量等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
  */
@js.native
trait PlusPaymentOrderStatementIAP extends StObject {
  
  /**
    * 商品的标识
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var productid: js.UndefOr[String] = js.native
  
  /**
    * 商品数量
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var quantity: js.UndefOr[String] = js.native
  
  /**
    * 购买用户名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/payment.html](http://www.html5plus.org/doc/zh_cn/payment.html)
    */
  var username: js.UndefOr[String] = js.native
}
object PlusPaymentOrderStatementIAP {
  
  @scala.inline
  def apply(): PlusPaymentOrderStatementIAP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPaymentOrderStatementIAP]
  }
  
  @scala.inline
  implicit class PlusPaymentOrderStatementIAPMutableBuilder[Self <: PlusPaymentOrderStatementIAP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductid(value: String): Self = StObject.set(x, "productid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductidUndefined: Self = StObject.set(x, "productid", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
