package typingsSlinky.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddHeldAccountsResponse extends js.Object {
  
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
  implicit class AddHeldAccountsResponseOps[Self <: AddHeldAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResponsesVarargs(value: AddHeldAccountResult*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[AddHeldAccountResult]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
  }
}
