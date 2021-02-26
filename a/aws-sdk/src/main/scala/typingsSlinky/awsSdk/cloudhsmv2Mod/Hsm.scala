package typingsSlinky.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hsm extends StObject {
  
  /**
    * The Availability Zone that contains the HSM.
    */
  var AvailabilityZone: js.UndefOr[ExternalAz] = js.native
  
  /**
    * The identifier (ID) of the cluster that contains the HSM.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  
  /**
    * The identifier (ID) of the HSM's elastic network interface (ENI).
    */
  var EniId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.EniId] = js.native
  
  /**
    * The IP address of the HSM's elastic network interface (ENI).
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  
  /**
    * The HSM's identifier (ID).
    */
  var HsmId: typingsSlinky.awsSdk.cloudhsmv2Mod.HsmId = js.native
  
  /**
    * The HSM's state.
    */
  var State: js.UndefOr[HsmState] = js.native
  
  /**
    * A description of the HSM's state.
    */
  var StateMessage: js.UndefOr[String] = js.native
  
  /**
    * The subnet that contains the HSM's elastic network interface (ENI).
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmv2Mod.SubnetId] = js.native
}
object Hsm {
  
  @scala.inline
  def apply(HsmId: HsmId): Hsm = {
    val __obj = js.Dynamic.literal(HsmId = HsmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hsm]
  }
  
  @scala.inline
  implicit class HsmMutableBuilder[Self <: Hsm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: ExternalAz): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
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
    def setState(value: HsmState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessage(value: String): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
