package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHsmRequest extends StObject {
  
  /**
    * The identifier (ID) of the cluster that contains the HSM that you are deleting.
    */
  var ClusterId: typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId = js.native
  
  /**
    * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.EniId] = js.native
  
  /**
    * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  
  /**
    * The identifier (ID) of the HSM that you are deleting.
    */
  var HsmId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.HsmId] = js.native
}
object DeleteHsmRequest {
  
  @scala.inline
  def apply(ClusterId: ClusterId): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  
  @scala.inline
  implicit class DeleteHsmRequestMutableBuilder[Self <: DeleteHsmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniId(value: EniId): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    @scala.inline
    def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    @scala.inline
    def setHsmId(value: HsmId): Self = StObject.set(x, "HsmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmIdUndefined: Self = StObject.set(x, "HsmId", js.undefined)
  }
}
