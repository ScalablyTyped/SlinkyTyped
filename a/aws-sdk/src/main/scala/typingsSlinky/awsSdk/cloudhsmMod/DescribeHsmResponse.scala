package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHsmResponse extends js.Object {
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
  implicit class DescribeHsmResponseOps[Self <: DescribeHsmResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZone(value: AZ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withEniId(value: EniId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(js.undefined)
        ret
    }
    @scala.inline
    def withEniIp(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniIp")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmArn(value: HsmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmType")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: IamRoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitions(value: PartitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Partitions")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialNumber(value: HsmSerialNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SerialNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCertLastUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertLastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertLastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCertUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCertUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServerCertUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftwareVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSshKeyLastUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshKeyLastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshKeyLastUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshKeyLastUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withSshPublicKey(value: SshKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SshPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: HsmStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetId(value: SubnetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionEndDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionStartDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptionType(value: SubscriptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubscriptionType")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VendorName")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: VpcId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

