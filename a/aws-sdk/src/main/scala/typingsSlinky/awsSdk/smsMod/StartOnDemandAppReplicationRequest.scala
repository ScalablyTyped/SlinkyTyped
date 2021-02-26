package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOnDemandAppReplicationRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: AppId = js.native
  
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.native
}
object StartOnDemandAppReplicationRequest {
  
  @scala.inline
  def apply(appId: AppId): StartOnDemandAppReplicationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandAppReplicationRequest]
  }
  
  @scala.inline
  implicit class StartOnDemandAppReplicationRequestMutableBuilder[Self <: StartOnDemandAppReplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
