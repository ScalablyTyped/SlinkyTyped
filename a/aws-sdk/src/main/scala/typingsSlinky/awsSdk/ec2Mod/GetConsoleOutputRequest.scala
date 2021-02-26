package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConsoleOutputRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * When enabled, retrieves the latest console output for the instance. Default: disabled (false)
    */
  var Latest: js.UndefOr[Boolean] = js.native
}
object GetConsoleOutputRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): GetConsoleOutputRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsoleOutputRequest]
  }
  
  @scala.inline
  implicit class GetConsoleOutputRequestMutableBuilder[Self <: GetConsoleOutputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest(value: Boolean): Self = StObject.set(x, "Latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestUndefined: Self = StObject.set(x, "Latest", js.undefined)
  }
}
