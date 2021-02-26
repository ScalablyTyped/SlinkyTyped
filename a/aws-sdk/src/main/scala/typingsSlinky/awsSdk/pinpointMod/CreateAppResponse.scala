package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppResponse extends StObject {
  
  var ApplicationResponse: typingsSlinky.awsSdk.pinpointMod.ApplicationResponse = js.native
}
object CreateAppResponse {
  
  @scala.inline
  def apply(ApplicationResponse: ApplicationResponse): CreateAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  @scala.inline
  implicit class CreateAppResponseMutableBuilder[Self <: CreateAppResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationResponse(value: ApplicationResponse): Self = StObject.set(x, "ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
