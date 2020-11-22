package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsModeratedByAppInstanceUserRequest extends js.Object {
  
  /**
    * The ARN of the user in the moderated channel.
    */
  var AppInstanceUserArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The maximum number of channels in the request.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.chimeMod.MaxResults] = js.native
  
  /**
    * The token returned from previous API requests until the number of channels moderated by the user is reached.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelsModeratedByAppInstanceUserRequest {
  
  @scala.inline
  def apply(): ListChannelsModeratedByAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsModeratedByAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class ListChannelsModeratedByAppInstanceUserRequestOps[Self <: ListChannelsModeratedByAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceUserArn(value: ChimeArn): Self = this.set("AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppInstanceUserArn: Self = this.set("AppInstanceUserArn", js.undefined)
    
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
