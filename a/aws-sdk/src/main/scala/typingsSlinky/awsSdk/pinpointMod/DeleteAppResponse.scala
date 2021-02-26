package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppResponse extends StObject {
  
  var ApplicationResponse: typingsSlinky.awsSdk.pinpointMod.ApplicationResponse = js.native
}
object DeleteAppResponse {
  
  @scala.inline
  def apply(ApplicationResponse: ApplicationResponse): DeleteAppResponse = {
    val __obj = js.Dynamic.literal(ApplicationResponse = ApplicationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppResponse]
  }
  
  @scala.inline
  implicit class DeleteAppResponseMutableBuilder[Self <: DeleteAppResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationResponse(value: ApplicationResponse): Self = StObject.set(x, "ApplicationResponse", value.asInstanceOf[js.Any])
  }
}
