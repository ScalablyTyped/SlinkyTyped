package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroupsResponse extends js.Object {
  
  /**
    * The overview of groups for an organization.
    */
  var Groups: js.UndefOr[typingsSlinky.awsSdk.workmailMod.Groups] = js.native
  
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.workmailMod.NextToken] = js.native
}
object ListGroupsResponse {
  
  @scala.inline
  def apply(): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsResponse]
  }
  
  @scala.inline
  implicit class ListGroupsResponseOps[Self <: ListGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: Group*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: Groups): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
