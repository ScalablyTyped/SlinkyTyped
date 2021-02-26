package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcEndpointConnectionNotificationResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}
object ModifyVpcEndpointConnectionNotificationResult {
  
  @scala.inline
  def apply(): ModifyVpcEndpointConnectionNotificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationResult]
  }
  
  @scala.inline
  implicit class ModifyVpcEndpointConnectionNotificationResultMutableBuilder[Self <: ModifyVpcEndpointConnectionNotificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
