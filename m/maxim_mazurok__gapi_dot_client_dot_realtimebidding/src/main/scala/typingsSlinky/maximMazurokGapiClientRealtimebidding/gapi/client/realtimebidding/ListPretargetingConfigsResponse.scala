package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPretargetingConfigsResponse extends StObject {
  
  /** A token which can be passed to a subsequent call to the `ListPretargetingConfigs` method to retrieve the next page of results in ListPretargetingConfigsRequest.pageToken. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of pretargeting configurations. */
  var pretargetingConfigs: js.UndefOr[js.Array[PretargetingConfig]] = js.native
}
object ListPretargetingConfigsResponse {
  
  @scala.inline
  def apply(): ListPretargetingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPretargetingConfigsResponse]
  }
  
  @scala.inline
  implicit class ListPretargetingConfigsResponseMutableBuilder[Self <: ListPretargetingConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPretargetingConfigs(value: js.Array[PretargetingConfig]): Self = StObject.set(x, "pretargetingConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretargetingConfigsUndefined: Self = StObject.set(x, "pretargetingConfigs", js.undefined)
    
    @scala.inline
    def setPretargetingConfigsVarargs(value: PretargetingConfig*): Self = StObject.set(x, "pretargetingConfigs", js.Array(value :_*))
  }
}
