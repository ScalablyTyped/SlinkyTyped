package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddHeldAccountsResponse extends StObject {
  
  /** The list of responses, in the same order as the batch request. */
  var responses: js.UndefOr[js.Array[AddHeldAccountResult]] = js.native
}
object AddHeldAccountsResponse {
  
  @scala.inline
  def apply(): AddHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddHeldAccountsResponse]
  }
  
  @scala.inline
  implicit class AddHeldAccountsResponseMutableBuilder[Self <: AddHeldAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponses(value: js.Array[AddHeldAccountResult]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: AddHeldAccountResult*): Self = StObject.set(x, "responses", js.Array(value :_*))
  }
}
