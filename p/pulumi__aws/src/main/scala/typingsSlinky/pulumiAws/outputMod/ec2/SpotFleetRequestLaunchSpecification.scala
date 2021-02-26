package typingsSlinky.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchSpecification extends StObject {
  
  var ami: String = js.native
  
  var associatePublicIpAddress: js.UndefOr[Boolean] = js.native
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: String = js.native
  
  var ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice] = js.native
  
  var ebsOptimized: js.UndefOr[Boolean] = js.native
  
  var ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice] = js.native
  
  var iamInstanceProfile: js.UndefOr[String] = js.native
  
  var iamInstanceProfileArn: js.UndefOr[String] = js.native
  
  /**
    * The type of instance to request.
    */
  var instanceType: String = js.native
  
  var keyName: String = js.native
  
  var monitoring: js.UndefOr[Boolean] = js.native
  
  var placementGroup: String = js.native
  
  var placementTenancy: js.UndefOr[String] = js.native
  
  var rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice] = js.native
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: js.UndefOr[String] = js.native
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: String = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  var userData: js.UndefOr[String] = js.native
  
  var vpcSecurityGroupIds: js.Array[String] = js.native
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: js.UndefOr[String] = js.native
}
object SpotFleetRequestLaunchSpecification {
  
  @scala.inline
  def apply(
    ami: String,
    availabilityZone: String,
    ebsBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice],
    ephemeralBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice],
    instanceType: String,
    keyName: String,
    placementGroup: String,
    rootBlockDevices: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice],
    subnetId: String,
    vpcSecurityGroupIds: js.Array[String]
  ): SpotFleetRequestLaunchSpecification = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecification]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchSpecificationMutableBuilder[Self <: SpotFleetRequestLaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmi(value: String): Self = StObject.set(x, "ami", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "associatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "associatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEbsBlockDevice]): Self = StObject.set(x, "ebsBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationEbsBlockDevice*): Self = StObject.set(x, "ebsBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
    
    @scala.inline
    def setEphemeralBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]): Self = StObject.set(x, "ephemeralBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationEphemeralBlockDevice*): Self = StObject.set(x, "ephemeralBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setIamInstanceProfile(value: String): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileArn(value: String): Self = StObject.set(x, "iamInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileArnUndefined: Self = StObject.set(x, "iamInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoring(value: Boolean): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
    
    @scala.inline
    def setPlacementGroup(value: String): Self = StObject.set(x, "placementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTenancy(value: String): Self = StObject.set(x, "placementTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementTenancyUndefined: Self = StObject.set(x, "placementTenancy", js.undefined)
    
    @scala.inline
    def setRootBlockDevices(value: js.Array[SpotFleetRequestLaunchSpecificationRootBlockDevice]): Self = StObject.set(x, "rootBlockDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBlockDevicesVarargs(value: SpotFleetRequestLaunchSpecificationRootBlockDevice*): Self = StObject.set(x, "rootBlockDevices", js.Array(value :_*))
    
    @scala.inline
    def setSpotPrice(value: String): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotPriceUndefined: Self = StObject.set(x, "spotPrice", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setWeightedCapacity(value: String): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
