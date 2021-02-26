package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetEbsDefaultKmsKeyIdRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
}
object ResetEbsDefaultKmsKeyIdRequest {
  
  @scala.inline
  def apply(): ResetEbsDefaultKmsKeyIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetEbsDefaultKmsKeyIdRequest]
  }
  
  @scala.inline
  implicit class ResetEbsDefaultKmsKeyIdRequestMutableBuilder[Self <: ResetEbsDefaultKmsKeyIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
