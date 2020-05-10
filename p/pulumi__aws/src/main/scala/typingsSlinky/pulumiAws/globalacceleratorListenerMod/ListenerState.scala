package typingsSlinky.pulumiAws.globalacceleratorListenerMod

import typingsSlinky.pulumiAws.inputMod.globalaccelerator.ListenerPortRange
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  val acceleratorArn: js.UndefOr[Input[String]] = js.native
  /**
    * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
    */
  val clientAffinity: js.UndefOr[Input[String]] = js.native
  /**
    * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
    */
  val portRanges: js.UndefOr[Input[js.Array[Input[ListenerPortRange]]]] = js.native
  /**
    * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
}

object ListenerState {
  @scala.inline
  def apply(): ListenerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerState]
  }
  @scala.inline
  implicit class ListenerStateOps[Self <: ListenerState] (val x: Self) extends AnyVal {
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
    def withoutAcceleratorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleratorArn")(js.undefined)
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
    @scala.inline
    def withPortRanges(value: Input[js.Array[Input[ListenerPortRange]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
  }
  
}

