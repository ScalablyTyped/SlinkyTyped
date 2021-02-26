package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimDevicesByClaimCodeRequest extends StObject {
  
  /**
    * The claim code, starting with "C-", as provided by the device manufacturer.
    */
  var ClaimCode: string = js.native
}
object ClaimDevicesByClaimCodeRequest {
  
  @scala.inline
  def apply(ClaimCode: string): ClaimDevicesByClaimCodeRequest = {
    val __obj = js.Dynamic.literal(ClaimCode = ClaimCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDevicesByClaimCodeRequest]
  }
  
  @scala.inline
  implicit class ClaimDevicesByClaimCodeRequestMutableBuilder[Self <: ClaimDevicesByClaimCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimCode(value: string): Self = StObject.set(x, "ClaimCode", value.asInstanceOf[js.Any])
  }
}
