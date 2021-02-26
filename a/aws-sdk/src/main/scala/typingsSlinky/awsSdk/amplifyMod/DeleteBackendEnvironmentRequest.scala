package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBackendEnvironmentRequest extends StObject {
  
  /**
    *  The unique ID of an Amplify app. 
    */
  var appId: AppId = js.native
  
  /**
    *  The name of a backend environment of an Amplify app. 
    */
  var environmentName: EnvironmentName = js.native
}
object DeleteBackendEnvironmentRequest {
  
  @scala.inline
  def apply(appId: AppId, environmentName: EnvironmentName): DeleteBackendEnvironmentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackendEnvironmentRequest]
  }
  
  @scala.inline
  implicit class DeleteBackendEnvironmentRequestMutableBuilder[Self <: DeleteBackendEnvironmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}
