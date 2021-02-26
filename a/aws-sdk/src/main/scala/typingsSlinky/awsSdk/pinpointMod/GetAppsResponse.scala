package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppsResponse extends StObject {
  
  var ApplicationsResponse: typingsSlinky.awsSdk.pinpointMod.ApplicationsResponse = js.native
}
object GetAppsResponse {
  
  @scala.inline
  def apply(ApplicationsResponse: ApplicationsResponse): GetAppsResponse = {
    val __obj = js.Dynamic.literal(ApplicationsResponse = ApplicationsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppsResponse]
  }
  
  @scala.inline
  implicit class GetAppsResponseMutableBuilder[Self <: GetAppsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationsResponse(value: ApplicationsResponse): Self = StObject.set(x, "ApplicationsResponse", value.asInstanceOf[js.Any])
  }
}
