package typingsSlinky.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * The ID of the resource with the tags to list. You can specify any of the following taggable resources.   AWS account – specify the account ID number.   Organizational unit – specify the OU ID that begins with ou- and looks similar to: ou-1a2b-34uvwxyz     Root – specify the root ID that begins with r- and looks similar to: r-1a2b     Policy – specify the policy ID that begins with p- andlooks similar to: p-12abcdefg3    
    */
  var ResourceId: TaggableResourceId = js.native
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(ResourceId: TaggableResourceId): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: TaggableResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
