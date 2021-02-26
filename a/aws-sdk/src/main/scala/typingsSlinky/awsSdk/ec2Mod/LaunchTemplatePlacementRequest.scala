package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplatePlacementRequest extends StObject {
  
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var Affinity: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone for the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The name of the placement group for the instance.
    */
  var GroupName: js.UndefOr[PlacementGroupName] = js.native
  
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var HostId: js.UndefOr[DedicatedHostId] = js.native
  
  /**
    * The ARN of the host resource group in which to launch the instances. If you specify a host resource group ARN, omit the Tenancy parameter or set it to host.
    */
  var HostResourceGroupArn: js.UndefOr[String] = js.native
  
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var PartitionNumber: js.UndefOr[Integer] = js.native
  
  /**
    * Reserved for future use.
    */
  var SpreadDomain: js.UndefOr[String] = js.native
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). An instance with a tenancy of dedicated runs on single-tenant hardware.
    */
  var Tenancy: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Tenancy] = js.native
}
object LaunchTemplatePlacementRequest {
  
  @scala.inline
  def apply(): LaunchTemplatePlacementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacementRequest]
  }
  
  @scala.inline
  implicit class LaunchTemplatePlacementRequestMutableBuilder[Self <: LaunchTemplatePlacementRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinity(value: String): Self = StObject.set(x, "Affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinityUndefined: Self = StObject.set(x, "Affinity", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: PlacementGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    @scala.inline
    def setHostId(value: DedicatedHostId): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    @scala.inline
    def setHostResourceGroupArn(value: String): Self = StObject.set(x, "HostResourceGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostResourceGroupArnUndefined: Self = StObject.set(x, "HostResourceGroupArn", js.undefined)
    
    @scala.inline
    def setPartitionNumber(value: Integer): Self = StObject.set(x, "PartitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionNumberUndefined: Self = StObject.set(x, "PartitionNumber", js.undefined)
    
    @scala.inline
    def setSpreadDomain(value: String): Self = StObject.set(x, "SpreadDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadDomainUndefined: Self = StObject.set(x, "SpreadDomain", js.undefined)
    
    @scala.inline
    def setTenancy(value: Tenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}
