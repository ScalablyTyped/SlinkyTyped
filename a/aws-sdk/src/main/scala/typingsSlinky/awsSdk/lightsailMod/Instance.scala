package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * An array of objects representing the add-ons enabled on the instance.
    */
  var addOns: js.UndefOr[AddOnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the instance (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/244ad76f-8aad-4741-809f-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The blueprint ID (e.g., os_amlinux_2016_03).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var blueprintName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The bundle for the instance (e.g., micro_1_0).
    */
  var bundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the instance was created (e.g., 1479734909.17).
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The size of the vCPU and the amount of RAM for the instance.
    */
  var hardware: js.UndefOr[InstanceHardware] = js.native
  /**
    * The IPv6 address of the instance.
    */
  var ipv6Address: js.UndefOr[IpV6Address] = js.native
  /**
    * A Boolean value indicating whether this instance has a static IP assigned to it.
    */
  var isStaticIp: js.UndefOr[Boolean] = js.native
  /**
    * The region name and Availability Zone where the instance is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name the user gave the instance (e.g., Amazon_Linux-1GB-Ohio-1).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * Information about the public ports and monthly data transfer rates for the instance.
    */
  var networking: js.UndefOr[InstanceNetworking] = js.native
  /**
    * The private IP address of the instance.
    */
  var privateIpAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The public IP address of the instance.
    */
  var publicIpAddress: js.UndefOr[IpAddress] = js.native
  /**
    * The type of resource (usually Instance).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The name of the SSH key being used to connect to the instance (e.g., LightsailDefaultKeyPair).
    */
  var sshKeyName: js.UndefOr[ResourceName] = js.native
  /**
    * The status code and the state (e.g., running) for the instance.
    */
  var state: js.UndefOr[InstanceState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The user name for connecting to the instance (e.g., ec2-user).
    */
  var username: js.UndefOr[NonEmptyString] = js.native
}

object Instance {
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOns(value: AddOnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOns")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueprintId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintId")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueprintName(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueprintName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintName")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withHardware(value: InstanceHardware): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Address(value: IpV6Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Address")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStaticIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStaticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStaticIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStaticIp")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworking(value: InstanceNetworking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networking")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIpAddress(value: IpAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSshKeyName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSshKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sshKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: InstanceState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
  }
  
}

