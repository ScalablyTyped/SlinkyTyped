package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAvailabilityZone extends StObject {
  
  /**
    * The identifier of the custom AZ. Amazon RDS generates a unique identifier when a custom AZ is created.
    */
  var CustomAvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * The name of the custom AZ.
    */
  var CustomAvailabilityZoneName: js.UndefOr[String] = js.native
  
  /**
    * The status of the custom AZ.
    */
  var CustomAvailabilityZoneStatus: js.UndefOr[String] = js.native
  
  /**
    * Information about the virtual private network (VPN) between the VMware vSphere cluster and the AWS website.
    */
  var VpnDetails: js.UndefOr[typingsSlinky.awsSdk.rdsMod.VpnDetails] = js.native
}
object CustomAvailabilityZone {
  
  @scala.inline
  def apply(): CustomAvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAvailabilityZone]
  }
  
  @scala.inline
  implicit class CustomAvailabilityZoneMutableBuilder[Self <: CustomAvailabilityZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneIdUndefined: Self = StObject.set(x, "CustomAvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setCustomAvailabilityZoneName(value: String): Self = StObject.set(x, "CustomAvailabilityZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneNameUndefined: Self = StObject.set(x, "CustomAvailabilityZoneName", js.undefined)
    
    @scala.inline
    def setCustomAvailabilityZoneStatus(value: String): Self = StObject.set(x, "CustomAvailabilityZoneStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAvailabilityZoneStatusUndefined: Self = StObject.set(x, "CustomAvailabilityZoneStatus", js.undefined)
    
    @scala.inline
    def setVpnDetails(value: VpnDetails): Self = StObject.set(x, "VpnDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnDetailsUndefined: Self = StObject.set(x, "VpnDetails", js.undefined)
  }
}
