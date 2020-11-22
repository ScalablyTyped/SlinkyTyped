package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptProposalRequest extends js.Object {
  
  /** The last known client revision number of the proposal. */
  var proposalRevision: js.UndefOr[String] = js.native
}
object AcceptProposalRequest {
  
  @scala.inline
  def apply(): AcceptProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptProposalRequest]
  }
  
  @scala.inline
  implicit class AcceptProposalRequestOps[Self <: AcceptProposalRequest] (val x: Self) extends AnyVal {
    
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
    def setProposalRevision(value: String): Self = this.set("proposalRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposalRevision: Self = this.set("proposalRevision", js.undefined)
  }
}
