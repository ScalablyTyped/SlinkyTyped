package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payments extends StObject {
  
  /**
    * Reserved: TBD
    */
  var amount: js.UndefOr[String] = js.native
  
  /**
    * A sender-defined description of the line item.
    *
    */
  var description: js.UndefOr[String] = js.native
  
  var paymentDate: js.UndefOr[String] = js.native
  
  var paymentId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a PDF version of the invoice is available.
    *
    * To get the PDF, make the call again and change "Accept:" in the header to "Accept: application/pdf".
    */
  var paymentNumber: js.UndefOr[String] = js.native
}
object Payments {
  
  @scala.inline
  def apply(): Payments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payments]
  }
  
  @scala.inline
  implicit class PaymentsMutableBuilder[Self <: Payments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
    
    @scala.inline
    def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    @scala.inline
    def setPaymentNumber(value: String): Self = StObject.set(x, "paymentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentNumberUndefined: Self = StObject.set(x, "paymentNumber", js.undefined)
  }
}
