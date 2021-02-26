package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppInstanceStreamingConfigurationsRequest extends StObject {
  
  /**
    * The ARN of the streaming configurations being deleted.
    */
  var AppInstanceArn: ChimeArn = js.native
}
object DeleteAppInstanceStreamingConfigurationsRequest {
  
  @scala.inline
  def apply(AppInstanceArn: ChimeArn): DeleteAppInstanceStreamingConfigurationsRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceStreamingConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DeleteAppInstanceStreamingConfigurationsRequestMutableBuilder[Self <: DeleteAppInstanceStreamingConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
