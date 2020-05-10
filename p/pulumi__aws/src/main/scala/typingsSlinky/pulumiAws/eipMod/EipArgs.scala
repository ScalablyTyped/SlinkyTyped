package typingsSlinky.pulumiAws.eipMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EipArgs extends js.Object {
  /**
    * A user specified primary or secondary private IP address to
    * associate with the Elastic IP address. If no private IP address is specified,
    * the Elastic IP address is associated with the primary private IP address.
    */
  val associateWithPrivateIp: js.UndefOr[Input[String]] = js.native
  /**
    * EC2 instance ID.
    */
  val instance: js.UndefOr[Input[String]] = js.native
  /**
    * Network interface ID to associate with.
    */
  val networkInterface: js.UndefOr[Input[String]] = js.native
  /**
    * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
    */
  val publicIpv4Pool: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Boolean if the EIP is in a VPC or not.
    */
  val vpc: js.UndefOr[Input[Boolean]] = js.native
}

object EipArgs {
  @scala.inline
  def apply(): EipArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EipArgs]
  }
  @scala.inline
  implicit class EipArgsOps[Self <: EipArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociateWithPrivateIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associateWithPrivateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociateWithPrivateIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associateWithPrivateIp")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterface(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIpv4Pool(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpv4Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpv4Pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIpv4Pool")(js.undefined)
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
    def withVpc(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpc")(js.undefined)
        ret
    }
  }
  
}

