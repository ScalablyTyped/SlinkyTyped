package typingsSlinky.pulumiAws.eipAssociationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EipAssociationState extends js.Object {
  /**
    * The allocation ID. This is required for EC2-VPC.
    */
  val allocationId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to allow an Elastic IP to
    * be re-associated. Defaults to `true` in VPC.
    */
  val allowReassociation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the instance. This is required for
    * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
    * network interface ID, but not both. The operation fails if you specify an
    * instance ID unless exactly one network interface is attached.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the network interface. If the
    * instance has more than one network interface, you must specify a network
    * interface ID.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The primary or secondary private IP address
    * to associate with the Elastic IP address. If no private IP address is
    * specified, the Elastic IP address is associated with the primary private IP
    * address.
    */
  val privateIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The Elastic IP address. This is required for EC2-Classic.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
}

object EipAssociationState {
  @scala.inline
  def apply(): EipAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EipAssociationState]
  }
  @scala.inline
  implicit class EipAssociationStateOps[Self <: EipAssociationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReassociation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReassociation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReassociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReassociation")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: Input[String]): Self = {
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
    @scala.inline
    def withNetworkInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(js.undefined)
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
    def withPublicIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(js.undefined)
        ret
    }
  }
  
}

