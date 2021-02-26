package typingsSlinky.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSendAsResponse extends StObject {
  
  /** List of send-as aliases. */
  var sendAs: js.UndefOr[js.Array[SendAs]] = js.native
}
object ListSendAsResponse {
  
  @scala.inline
  def apply(): ListSendAsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSendAsResponse]
  }
  
  @scala.inline
  implicit class ListSendAsResponseMutableBuilder[Self <: ListSendAsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendAs(value: js.Array[SendAs]): Self = StObject.set(x, "sendAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAsUndefined: Self = StObject.set(x, "sendAs", js.undefined)
    
    @scala.inline
    def setSendAsVarargs(value: SendAs*): Self = StObject.set(x, "sendAs", js.Array(value :_*))
  }
}
