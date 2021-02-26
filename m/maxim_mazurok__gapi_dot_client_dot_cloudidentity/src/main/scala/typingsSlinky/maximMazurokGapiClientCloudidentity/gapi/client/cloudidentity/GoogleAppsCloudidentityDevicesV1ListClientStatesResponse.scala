package typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ListClientStatesResponse extends StObject {
  
  /** Client states meeting the list restrictions. */
  var clientStates: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1ClientState]] = js.native
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1ListClientStatesResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ListClientStatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ListClientStatesResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientStates(value: js.Array[GoogleAppsCloudidentityDevicesV1ClientState]): Self = StObject.set(x, "clientStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientStatesUndefined: Self = StObject.set(x, "clientStates", js.undefined)
    
    @scala.inline
    def setClientStatesVarargs(value: GoogleAppsCloudidentityDevicesV1ClientState*): Self = StObject.set(x, "clientStates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
