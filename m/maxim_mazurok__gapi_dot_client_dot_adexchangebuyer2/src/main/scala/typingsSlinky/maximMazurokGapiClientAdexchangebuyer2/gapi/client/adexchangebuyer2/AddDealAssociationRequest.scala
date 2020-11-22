package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDealAssociationRequest extends js.Object {
  
  /** The association between a creative and a deal that should be added. */
  var association: js.UndefOr[CreativeDealAssociation] = js.native
}
object AddDealAssociationRequest {
  
  @scala.inline
  def apply(): AddDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDealAssociationRequest]
  }
  
  @scala.inline
  implicit class AddDealAssociationRequestOps[Self <: AddDealAssociationRequest] (val x: Self) extends AnyVal {
    
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
    def setAssociation(value: CreativeDealAssociation): Self = this.set("association", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociation: Self = this.set("association", js.undefined)
  }
}
