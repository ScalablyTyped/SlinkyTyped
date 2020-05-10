package typingsSlinky.pulumiAws.globalacceleratorListenerMod

import typingsSlinky.pulumiAws.inputMod.globalaccelerator.ListenerPortRange
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  val acceleratorArn: Input[String] = js.native
  /**
    * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
    */
  val clientAffinity: js.UndefOr[Input[String]] = js.native
  /**
    * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
    */
  val portRanges: Input[js.Array[Input[ListenerPortRange]]] = js.native
  /**
    * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
    */
  val protocol: Input[String] = js.native
}

object ListenerArgs {
  @scala.inline
  def apply(
    acceleratorArn: Input[String],
    portRanges: Input[js.Array[Input[ListenerPortRange]]],
    protocol: Input[String]
  ): ListenerArgs = {
    val __obj = js.Dynamic.literal(acceleratorArn = acceleratorArn.asInstanceOf[js.Any], portRanges = portRanges.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerArgs]
  }
  @scala.inline
  implicit class ListenerArgsOps[Self <: ListenerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortRanges(value: Input[js.Array[Input[ListenerPortRange]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientAffinity(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAffinity")(js.undefined)
        ret
    }
  }
  
}

