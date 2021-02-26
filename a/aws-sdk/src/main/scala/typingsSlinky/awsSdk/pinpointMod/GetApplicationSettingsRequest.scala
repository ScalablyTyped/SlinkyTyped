package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationSettingsRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}
object GetApplicationSettingsRequest {
  
  @scala.inline
  def apply(ApplicationId: string): GetApplicationSettingsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationSettingsRequest]
  }
  
  @scala.inline
  implicit class GetApplicationSettingsRequestMutableBuilder[Self <: GetApplicationSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
