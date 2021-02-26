package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAdvertiserAssignedTargetingOptionsResponse extends StObject {
  
  /** The list of assigned targeting options. This list will be absent if empty. */
  var assignedTargetingOptions: js.UndefOr[js.Array[AssignedTargetingOption]] = js.native
  
  /**
    * A token identifying the next page of results. This value should be specified as the pageToken in a subsequent ListAdvertiserAssignedTargetingOptionsRequest to fetch the next page of
    * results. This token will be absent if there are no more assigned_targeting_options to return.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAdvertiserAssignedTargetingOptionsResponse {
  
  @scala.inline
  def apply(): ListAdvertiserAssignedTargetingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAdvertiserAssignedTargetingOptionsResponse]
  }
  
  @scala.inline
  implicit class ListAdvertiserAssignedTargetingOptionsResponseMutableBuilder[Self <: ListAdvertiserAssignedTargetingOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedTargetingOptions(value: js.Array[AssignedTargetingOption]): Self = StObject.set(x, "assignedTargetingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedTargetingOptionsUndefined: Self = StObject.set(x, "assignedTargetingOptions", js.undefined)
    
    @scala.inline
    def setAssignedTargetingOptionsVarargs(value: AssignedTargetingOption*): Self = StObject.set(x, "assignedTargetingOptions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
