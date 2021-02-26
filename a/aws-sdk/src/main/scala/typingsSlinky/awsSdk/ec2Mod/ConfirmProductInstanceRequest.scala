package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmProductInstanceRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsSlinky.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * The product code. This must be a product code that you own.
    */
  var ProductCode: String = js.native
}
object ConfirmProductInstanceRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, ProductCode: String): ConfirmProductInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], ProductCode = ProductCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmProductInstanceRequest]
  }
  
  @scala.inline
  implicit class ConfirmProductInstanceRequestMutableBuilder[Self <: ConfirmProductInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCode(value: String): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
  }
}
