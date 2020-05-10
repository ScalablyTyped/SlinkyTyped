package typingsSlinky.pulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The ARN of the Lightsail instance (matches `id`).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: js.UndefOr[Input[String]] = js.native
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: js.UndefOr[Input[String]] = js.native
  val cpuCount: js.UndefOr[Input[Double]] = js.native
  /**
    * The timestamp when the instance was created.
    * * `availabilityZone`
    * * `blueprintId`
    * * `bundleId`
    * * `keyPairName`
    * * `userData`
    */
  val createdAt: js.UndefOr[Input[String]] = js.native
  val ipv6Address: js.UndefOr[Input[String]] = js.native
  val isStaticIp: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
    */
  val keyPairName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val privateIpAddress: js.UndefOr[Input[String]] = js.native
  val publicIpAddress: js.UndefOr[Input[String]] = js.native
  val ramSize: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[Input[String]] = js.native
  val username: js.UndefOr[Input[String]] = js.native
}

object InstanceState {
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  @scala.inline
  implicit class InstanceStateOps[Self <: InstanceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
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
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withBlueprintId(value: Input[String]): Self = {
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
    def withBundleId(value: Input[String]): Self = {
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
    def withCpuCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpuCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpuCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: Input[String]): Self = {
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
    def withIpv6Address(value: Input[String]): Self = {
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
    def withIsStaticIp(value: Input[Boolean]): Self = {
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
    def withKeyPairName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPairName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPairName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withPrivateIpAddress(value: Input[String]): Self = {
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
    def withPublicIpAddress(value: Input[String]): Self = {
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
    def withRamSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withUserData(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Input[String]): Self = {
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

