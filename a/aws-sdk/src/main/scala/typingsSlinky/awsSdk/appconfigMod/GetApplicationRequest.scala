package typingsSlinky.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationRequest extends StObject {
  
  /**
    * The ID of the application you want to get.
    */
  var ApplicationId: Id = js.native
}
object GetApplicationRequest {
  
  @scala.inline
  def apply(ApplicationId: Id): GetApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationRequest]
  }
  
  @scala.inline
  implicit class GetApplicationRequestMutableBuilder[Self <: GetApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
  }
}
