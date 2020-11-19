package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupsForCapacityReservationRequest extends js.Object {
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: typingsSlinky.awsSdk.ec2Mod.CapacityReservationId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. This value can be between 5 and 500. If maxResults is given a larger value than 500, you receive an error.
    */
  var MaxResults: js.UndefOr[GetGroupsForCapacityReservationRequestMaxResults] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object GetGroupsForCapacityReservationRequest {
  
  @scala.inline
  def apply(CapacityReservationId: CapacityReservationId): GetGroupsForCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupsForCapacityReservationRequest]
  }
  
  @scala.inline
  implicit class GetGroupsForCapacityReservationRequestOps[Self <: GetGroupsForCapacityReservationRequest] (val x: Self) extends AnyVal {
    
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
    def setCapacityReservationId(value: CapacityReservationId): Self = this.set("CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setMaxResults(value: GetGroupsForCapacityReservationRequestMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
