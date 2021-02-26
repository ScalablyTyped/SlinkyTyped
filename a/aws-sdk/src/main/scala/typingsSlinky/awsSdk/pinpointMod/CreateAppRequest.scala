package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppRequest extends StObject {
  
  var CreateApplicationRequest: typingsSlinky.awsSdk.pinpointMod.CreateApplicationRequest = js.native
}
object CreateAppRequest {
  
  @scala.inline
  def apply(CreateApplicationRequest: CreateApplicationRequest): CreateAppRequest = {
    val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  @scala.inline
  implicit class CreateAppRequestMutableBuilder[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateApplicationRequest(value: CreateApplicationRequest): Self = StObject.set(x, "CreateApplicationRequest", value.asInstanceOf[js.Any])
  }
}
