package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends StObject {
  
  /**
    * The list of EBS volumes that are attached to this instance.
    */
  var EbsVolumes: js.UndefOr[EbsVolumeList] = js.native
  
  /**
    * The unique identifier of the instance in Amazon EC2.
    */
  var Ec2InstanceId: js.UndefOr[InstanceId] = js.native
  
  /**
    * The unique identifier for the instance in Amazon EMR.
    */
  var Id: js.UndefOr[InstanceId] = js.native
  
  /**
    * The unique identifier of the instance fleet to which an EC2 instance belongs.
    */
  var InstanceFleetId: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceFleetId] = js.native
  
  /**
    * The identifier of the instance group to which this instance belongs.
    */
  var InstanceGroupId: js.UndefOr[String] = js.native
  
  /**
    * The EC2 instance type, for example m3.xlarge.
    */
  var InstanceType: js.UndefOr[typingsSlinky.awsSdk.emrMod.InstanceType] = js.native
  
  /**
    * The instance purchasing option. Valid values are ON_DEMAND or SPOT. 
    */
  var Market: js.UndefOr[MarketType] = js.native
  
  /**
    * The private DNS name of the instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  
  /**
    * The private IP address of the instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The public DNS name of the instance.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  
  /**
    * The public IP address of the instance.
    */
  var PublicIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The current status of the instance.
    */
  var Status: js.UndefOr[InstanceStatus] = js.native
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEbsVolumes(value: EbsVolumeList): Self = StObject.set(x, "EbsVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsVolumesUndefined: Self = StObject.set(x, "EbsVolumes", js.undefined)
    
    @scala.inline
    def setEbsVolumesVarargs(value: EbsVolume*): Self = StObject.set(x, "EbsVolumes", js.Array(value :_*))
    
    @scala.inline
    def setEc2InstanceId(value: InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    @scala.inline
    def setId(value: InstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = StObject.set(x, "InstanceFleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetIdUndefined: Self = StObject.set(x, "InstanceFleetId", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: String): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarketUndefined: Self = StObject.set(x, "Market", js.undefined)
    
    @scala.inline
    def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicDnsName(value: String): Self = StObject.set(x, "PublicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicDnsNameUndefined: Self = StObject.set(x, "PublicDnsName", js.undefined)
    
    @scala.inline
    def setPublicIpAddress(value: String): Self = StObject.set(x, "PublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpAddressUndefined: Self = StObject.set(x, "PublicIpAddress", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
