package typingsSlinky.pulumiAws.trafficMirrorSessionMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorSessionArgs extends js.Object {
  /**
    * A description of the traffic mirror session.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
    */
  val networkInterfaceId: Input[String] = js.native
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
    */
  val packetLength: js.UndefOr[Input[Double]] = js.native
  /**
    * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
    */
  val sessionNumber: Input[Double] = js.native
  /**
    * ID of the traffic mirror filter to be used
    */
  val trafficMirrorFilterId: Input[String] = js.native
  /**
    * ID of the traffic mirror target to be used
    */
  val trafficMirrorTargetId: Input[String] = js.native
  /**
    * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  val virtualNetworkId: js.UndefOr[Input[Double]] = js.native
}

object TrafficMirrorSessionArgs {
  @scala.inline
  def apply(
    networkInterfaceId: Input[String],
    sessionNumber: Input[Double],
    trafficMirrorFilterId: Input[String],
    trafficMirrorTargetId: Input[String]
  ): TrafficMirrorSessionArgs = {
    val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], sessionNumber = sessionNumber.asInstanceOf[js.Any], trafficMirrorFilterId = trafficMirrorFilterId.asInstanceOf[js.Any], trafficMirrorTargetId = trafficMirrorTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorSessionArgs]
  }
  @scala.inline
  implicit class TrafficMirrorSessionArgsOps[Self <: TrafficMirrorSessionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionNumber(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficMirrorFilterId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficMirrorFilterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficMirrorTargetId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficMirrorTargetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketLength(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLength")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualNetworkId(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualNetworkId")(js.undefined)
        ret
    }
  }
  
}

