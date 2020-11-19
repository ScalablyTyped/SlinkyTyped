package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMembersRequest extends js.Object {
  
  /**
    * The unique ID of the detector the member is associated with.
    */
  var DetectorId: typingsSlinky.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 50. The maximum value is 50.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.MaxResults] = js.native
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the list action. For subsequent calls to the action, fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether to only return associated members or to return all members (including members who haven't been invited yet or have been disassociated).
    */
  var OnlyAssociated: js.UndefOr[String] = js.native
}
object ListMembersRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId): ListMembersRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
  
  @scala.inline
  implicit class ListMembersRequestOps[Self <: ListMembersRequest] (val x: Self) extends AnyVal {
    
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
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOnlyAssociated(value: String): Self = this.set("OnlyAssociated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyAssociated: Self = this.set("OnlyAssociated", js.undefined)
  }
}
