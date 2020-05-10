package typingsSlinky.pulumiAws.getInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceCreditSpecification
import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceEbsBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceEphemeralBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceFilter
import typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceRootBlockDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceResult extends js.Object {
  /**
    * The ID of the AMI used to launch the instance.
    */
  val ami: String = js.native
  /**
    * The ARN of the instance.
    */
  val arn: String = js.native
  /**
    * Whether or not the Instance is associated with a public IP address or not (Boolean).
    */
  val associatePublicIpAddress: Boolean = js.native
  /**
    * The availability zone of the Instance.
    */
  val availabilityZone: String = js.native
  /**
    * The credit specification of the Instance.
    */
  val creditSpecifications: js.Array[GetInstanceCreditSpecification] = js.native
  val disableApiTermination: Boolean = js.native
  /**
    * The EBS block device mappings of the Instance.
    */
  val ebsBlockDevices: js.Array[GetInstanceEbsBlockDevice] = js.native
  /**
    * Whether the Instance is EBS optimized or not (Boolean).
    */
  val ebsOptimized: Boolean = js.native
  /**
    * The ephemeral block device mappings of the Instance.
    */
  val ephemeralBlockDevices: js.Array[GetInstanceEphemeralBlockDevice] = js.native
  val filters: js.UndefOr[js.Array[GetInstanceFilter]] = js.native
  val getPasswordData: js.UndefOr[Boolean] = js.native
  val getUserData: js.UndefOr[Boolean] = js.native
  /**
    * The Id of the dedicated host the instance will be assigned to.
    */
  val hostId: String = js.native
  /**
    * The name of the instance profile associated with the Instance.
    */
  val iamInstanceProfile: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val instanceId: js.UndefOr[String] = js.native
  /**
    * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
    */
  val instanceState: String = js.native
  val instanceTags: StringDictionary[js.Any] = js.native
  /**
    * The type of the Instance.
    */
  val instanceType: String = js.native
  /**
    * The key name of the Instance.
    */
  val keyName: String = js.native
  /**
    * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
    */
  val monitoring: Boolean = js.native
  /**
    * The ID of the network interface that was created with the Instance.
    */
  val networkInterfaceId: String = js.native
  /**
    * Base-64 encoded encrypted password data for the instance.
    * Useful for getting the administrator password for instances running Microsoft Windows.
    * This attribute is only exported if `getPasswordData` is true.
    * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val passwordData: String = js.native
  /**
    * The placement group of the Instance.
    */
  val placementGroup: String = js.native
  /**
    * The private DNS name assigned to the Instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC.
    */
  val privateDns: String = js.native
  /**
    * The private IP address assigned to the Instance.
    */
  val privateIp: String = js.native
  /**
    * The public DNS name assigned to the Instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC.
    */
  val publicDns: String = js.native
  /**
    * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an [`aws.ec2.Eip`](https://www.terraform.io/docs/providers/aws/r/eip.html) with your instance, you should refer to the EIP's address directly and not use `publicIp`, as this field will change after the EIP is attached.
    */
  val publicIp: String = js.native
  /**
    * The root block device mappings of the Instance
    */
  val rootBlockDevices: js.Array[GetInstanceRootBlockDevice] = js.native
  /**
    * The associated security groups.
    */
  val securityGroups: js.Array[String] = js.native
  /**
    * Whether the network interface performs source/destination checking (Boolean).
    */
  val sourceDestCheck: Boolean = js.native
  /**
    * The VPC subnet ID.
    */
  val subnetId: String = js.native
  /**
    * A mapping of tags assigned to the Instance.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The tenancy of the instance: `dedicated`, `default`, `host`.
    */
  val tenancy: String = js.native
  /**
    * SHA-1 hash of User Data supplied to the Instance.
    */
  val userData: String = js.native
  /**
    * Base64 encoded contents of User Data supplied to the Instance. Valid UTF-8 contents can be decoded with the [`base64decode` function](https://www.terraform.io/docs/configuration/functions/base64decode.html). This attribute is only exported if `getUserData` is true.
    */
  val userDataBase64: String = js.native
  /**
    * The associated security groups in a non-default VPC.
    */
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetInstanceResult {
  @scala.inline
  def apply(
    ami: String,
    arn: String,
    associatePublicIpAddress: Boolean,
    availabilityZone: String,
    creditSpecifications: js.Array[GetInstanceCreditSpecification],
    disableApiTermination: Boolean,
    ebsBlockDevices: js.Array[GetInstanceEbsBlockDevice],
    ebsOptimized: Boolean,
    ephemeralBlockDevices: js.Array[GetInstanceEphemeralBlockDevice],
    hostId: String,
    iamInstanceProfile: String,
    id: String,
    instanceState: String,
    instanceTags: StringDictionary[js.Any],
    instanceType: String,
    keyName: String,
    monitoring: Boolean,
    networkInterfaceId: String,
    passwordData: String,
    placementGroup: String,
    privateDns: String,
    privateIp: String,
    publicDns: String,
    publicIp: String,
    rootBlockDevices: js.Array[GetInstanceRootBlockDevice],
    securityGroups: js.Array[String],
    sourceDestCheck: Boolean,
    subnetId: String,
    tags: StringDictionary[js.Any],
    tenancy: String,
    userData: String,
    userDataBase64: String,
    vpcSecurityGroupIds: js.Array[String]
  ): GetInstanceResult = {
    val __obj = js.Dynamic.literal(ami = ami.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associatePublicIpAddress = associatePublicIpAddress.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsBlockDevices = ebsBlockDevices.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], ephemeralBlockDevices = ephemeralBlockDevices.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], iamInstanceProfile = iamInstanceProfile.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceState = instanceState.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], passwordData = passwordData.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], privateDns = privateDns.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicDns = publicDns.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], rootBlockDevices = rootBlockDevices.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceDestCheck = sourceDestCheck.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], tenancy = tenancy.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], userDataBase64 = userDataBase64.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceResult]
  }
  @scala.inline
  implicit class GetInstanceResultOps[Self <: GetInstanceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmi(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ami")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatePublicIpAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatePublicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditSpecifications(value: js.Array[GetInstanceCreditSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creditSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableApiTermination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApiTermination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: js.Array[GetInstanceEbsBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEbsOptimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsOptimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEphemeralBlockDevices(value: js.Array[GetInstanceEphemeralBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamInstanceProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamInstanceProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicDns(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootBlockDevices(value: js.Array[GetInstanceRootBlockDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDestCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDestCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTenancy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenancy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserDataBase64(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDataBase64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetInstanceFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPasswordData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPasswordData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPasswordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPasswordData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUserData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserData")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
  }
  
}

