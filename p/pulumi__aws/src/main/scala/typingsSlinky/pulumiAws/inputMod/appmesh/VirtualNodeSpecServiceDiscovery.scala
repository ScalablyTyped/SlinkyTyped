package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecServiceDiscovery extends js.Object {
  /**
    * Specifies any AWS Cloud Map information for the virtual node.
    */
  var awsCloudMap: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap]] = js.native
  /**
    * Specifies the DNS service name for the virtual node.
    */
  var dns: js.UndefOr[Input[VirtualNodeSpecServiceDiscoveryDns]] = js.native
}

object VirtualNodeSpecServiceDiscovery {
  @scala.inline
  def apply(): VirtualNodeSpecServiceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscovery]
  }
  @scala.inline
  implicit class VirtualNodeSpecServiceDiscoveryOps[Self <: VirtualNodeSpecServiceDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsCloudMap(value: Input[VirtualNodeSpecServiceDiscoveryAwsCloudMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsCloudMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsCloudMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsCloudMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDns(value: Input[VirtualNodeSpecServiceDiscoveryDns]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dns")(js.undefined)
        ret
    }
  }
  
}

