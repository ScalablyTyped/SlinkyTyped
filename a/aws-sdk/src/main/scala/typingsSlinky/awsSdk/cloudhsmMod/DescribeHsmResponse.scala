package typingsSlinky.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHsmResponse extends StObject {
  
  /**
    * The Availability Zone that the HSM is in.
    */
  var AvailabilityZone: js.UndefOr[AZ] = js.native
  
  /**
    * The identifier of the elastic network interface (ENI) attached to the HSM.
    */
  var EniId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.EniId] = js.native
  
  /**
    * The IP address assigned to the HSM's ENI.
    */
  var EniIp: js.UndefOr[IpAddress] = js.native
  
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.HsmArn] = js.native
  
  /**
    * The HSM model type.
    */
  var HsmType: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the IAM role assigned to the HSM.
    */
  var IamRoleArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.IamRoleArn] = js.native
  
  /**
    * The list of partitions on the HSM.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
  
  /**
    * The serial number of the HSM.
    */
  var SerialNumber: js.UndefOr[HsmSerialNumber] = js.native
  
  /**
    * The date and time that the server certificate was last updated.
    */
  var ServerCertLastUpdated: js.UndefOr[Timestamp] = js.native
  
  /**
    * The URI of the certificate server.
    */
  var ServerCertUri: js.UndefOr[String] = js.native
  
  /**
    * The HSM software version.
    */
  var SoftwareVersion: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the SSH key was last updated.
    */
  var SshKeyLastUpdated: js.UndefOr[Timestamp] = js.native
  
  /**
    * The public SSH key.
    */
  var SshPublicKey: js.UndefOr[SshKey] = js.native
  
  /**
    * The status of the HSM.
    */
  var Status: js.UndefOr[HsmStatus] = js.native
  
  /**
    * Contains additional information about the status of the HSM.
    */
  var StatusDetails: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the subnet that the HSM is in.
    */
  var SubnetId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.SubnetId] = js.native
  
  /**
    * The subscription end date.
    */
  var SubscriptionEndDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The subscription start date.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.native
  
  var SubscriptionType: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.SubscriptionType] = js.native
  
  /**
    * The name of the HSM vendor.
    */
  var VendorName: js.UndefOr[String] = js.native
  
  /**
    * The identifier of the VPC that the HSM is in.
    */
  var VpcId: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.VpcId] = js.native
}
object DescribeHsmResponse {
  
  @scala.inline
  def apply(): DescribeHsmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmResponse]
  }
  
  @scala.inline
  implicit class DescribeHsmResponseMutableBuilder[Self <: DescribeHsmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: AZ): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setEniId(value: EniId): Self = StObject.set(x, "EniId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniIdUndefined: Self = StObject.set(x, "EniId", js.undefined)
    
    @scala.inline
    def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    @scala.inline
    def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmArnUndefined: Self = StObject.set(x, "HsmArn", js.undefined)
    
    @scala.inline
    def setHsmType(value: String): Self = StObject.set(x, "HsmType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmTypeUndefined: Self = StObject.set(x, "HsmType", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    @scala.inline
    def setPartitions(value: PartitionList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: PartitionArn*): Self = StObject.set(x, "Partitions", js.Array(value :_*))
    
    @scala.inline
    def setSerialNumber(value: HsmSerialNumber): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    @scala.inline
    def setServerCertLastUpdated(value: Timestamp): Self = StObject.set(x, "ServerCertLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertLastUpdatedUndefined: Self = StObject.set(x, "ServerCertLastUpdated", js.undefined)
    
    @scala.inline
    def setServerCertUri(value: String): Self = StObject.set(x, "ServerCertUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertUriUndefined: Self = StObject.set(x, "ServerCertUri", js.undefined)
    
    @scala.inline
    def setSoftwareVersion(value: String): Self = StObject.set(x, "SoftwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersionUndefined: Self = StObject.set(x, "SoftwareVersion", js.undefined)
    
    @scala.inline
    def setSshKeyLastUpdated(value: Timestamp): Self = StObject.set(x, "SshKeyLastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyLastUpdatedUndefined: Self = StObject.set(x, "SshKeyLastUpdated", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshKey): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
    
    @scala.inline
    def setStatus(value: HsmStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetails(value: String): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setSubscriptionEndDate(value: Timestamp): Self = StObject.set(x, "SubscriptionEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionEndDateUndefined: Self = StObject.set(x, "SubscriptionEndDate", js.undefined)
    
    @scala.inline
    def setSubscriptionStartDate(value: Timestamp): Self = StObject.set(x, "SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionStartDateUndefined: Self = StObject.set(x, "SubscriptionStartDate", js.undefined)
    
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionTypeUndefined: Self = StObject.set(x, "SubscriptionType", js.undefined)
    
    @scala.inline
    def setVendorName(value: String): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorNameUndefined: Self = StObject.set(x, "VendorName", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
