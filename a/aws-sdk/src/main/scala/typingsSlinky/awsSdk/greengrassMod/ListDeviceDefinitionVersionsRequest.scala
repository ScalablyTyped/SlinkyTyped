package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeviceDefinitionVersionsRequest extends StObject {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string = js.native
  
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListDeviceDefinitionVersionsRequest {
  
  @scala.inline
  def apply(DeviceDefinitionId: string): ListDeviceDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceDefinitionVersionsRequest]
  }
  
  @scala.inline
  implicit class ListDeviceDefinitionVersionsRequestMutableBuilder[Self <: ListDeviceDefinitionVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: string): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
