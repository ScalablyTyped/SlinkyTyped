package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPolicyPrincipalsRequest extends js.Object {
  
  /**
    * Specifies the order for results. If true, the results are returned in ascending creation order.
    */
  var ascendingOrder: js.UndefOr[AscendingOrder] = js.native
  
  /**
    * The marker for the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  
  /**
    * The result page size.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
}
object ListPolicyPrincipalsRequest {
  
  @scala.inline
  def apply(policyName: PolicyName): ListPolicyPrincipalsRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyPrincipalsRequest]
  }
  
  @scala.inline
  implicit class ListPolicyPrincipalsRequestOps[Self <: ListPolicyPrincipalsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingOrder(value: AscendingOrder): Self = this.set("ascendingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscendingOrder: Self = this.set("ascendingOrder", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
}
