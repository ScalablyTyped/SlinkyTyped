package typingsSlinky.facebookJsSdk.facebook

import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.lead_gen
import typingsSlinky.facebookJsSdk.facebookJsSdkStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeadgenDialogParams extends DialogParams {
  
  var account_id: String = js.native
  
  @JSName("display")
  var display_LeadgenDialogParams: popup = js.native
  
  var method: lead_gen = js.native
  
  var page_id: String = js.native
}
object LeadgenDialogParams {
  
  @scala.inline
  def apply(account_id: String, display: popup, method: lead_gen, page_id: String): LeadgenDialogParams = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], page_id = page_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeadgenDialogParams]
  }
  
  @scala.inline
  implicit class LeadgenDialogParamsMutableBuilder[Self <: LeadgenDialogParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: popup): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: lead_gen): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_id(value: String): Self = StObject.set(x, "page_id", value.asInstanceOf[js.Any])
  }
}
