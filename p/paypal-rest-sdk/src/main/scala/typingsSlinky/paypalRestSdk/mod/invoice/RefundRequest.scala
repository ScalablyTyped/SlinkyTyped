package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefundRequest extends StObject {
  
  var amount: Currency = js.native
  
  var date: String = js.native
  
  var note: js.UndefOr[String] = js.native
}
object RefundRequest {
  
  @scala.inline
  def apply(amount: Currency, date: String): RefundRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundRequest]
  }
  
  @scala.inline
  implicit class RefundRequestMutableBuilder[Self <: RefundRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
