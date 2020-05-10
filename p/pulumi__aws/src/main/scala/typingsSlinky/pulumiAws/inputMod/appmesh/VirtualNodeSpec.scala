package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpec extends js.Object {
  /**
    * The backends to which the virtual node is expected to send outbound traffic.
    */
  var backends: js.UndefOr[Input[js.Array[Input[VirtualNodeSpecBackend]]]] = js.native
  /**
    * The listeners from which the virtual node is expected to receive inbound traffic.
    */
  var listener: js.UndefOr[Input[VirtualNodeSpecListener]] = js.native
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Input[VirtualNodeSpecLogging]] = js.native
  /**
    * The service discovery information for the virtual node.
    */
  var serviceDiscovery: js.UndefOr[Input[VirtualNodeSpecServiceDiscovery]] = js.native
}

object VirtualNodeSpec {
  @scala.inline
  def apply(): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpec]
  }
  @scala.inline
  implicit class VirtualNodeSpecOps[Self <: VirtualNodeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackends(value: Input[js.Array[Input[VirtualNodeSpecBackend]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backends")(js.undefined)
        ret
    }
    @scala.inline
    def withListener(value: Input[VirtualNodeSpecListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Input[VirtualNodeSpecLogging]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceDiscovery(value: Input[VirtualNodeSpecServiceDiscovery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDiscovery")(js.undefined)
        ret
    }
  }
  
}

