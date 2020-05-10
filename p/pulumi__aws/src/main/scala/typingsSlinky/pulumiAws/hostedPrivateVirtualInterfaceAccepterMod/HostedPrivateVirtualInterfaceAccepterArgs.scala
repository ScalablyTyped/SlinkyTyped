package typingsSlinky.pulumiAws.hostedPrivateVirtualInterfaceAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedPrivateVirtualInterfaceAccepterArgs extends js.Object {
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: Input[String] = js.native
  /**
    * The ID of the virtual private gateway to which to connect the virtual interface.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object HostedPrivateVirtualInterfaceAccepterArgs {
  @scala.inline
  def apply(virtualInterfaceId: Input[String]): HostedPrivateVirtualInterfaceAccepterArgs = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPrivateVirtualInterfaceAccepterArgs]
  }
  @scala.inline
  implicit class HostedPrivateVirtualInterfaceAccepterArgsOps[Self <: HostedPrivateVirtualInterfaceAccepterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDxGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDxGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dxGatewayId")(js.undefined)
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
    def withVpnGatewayId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpnGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnGatewayId")(js.undefined)
        ret
    }
  }
  
}

