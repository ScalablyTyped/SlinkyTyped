package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAppInstanceUsersRequest extends js.Object {
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn = js.native
  
  /**
    * The maximum number of requests that you want returned.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MaxResults] = js.native
  
  /**
    * The token passed by previous API calls until all requested users are returned.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.chimeMod.NextToken] = js.native
}
object ListAppInstanceUsersRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn): ListAppInstanceUsersRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppInstanceUsersRequest]
  }
  
  @scala.inline
  implicit class ListAppInstanceUsersRequestOps[Self <: ListAppInstanceUsersRequest] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceArn(value: ChimeArn): Self = this.set("AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
