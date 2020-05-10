package typingsSlinky.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowOutputRequest extends js.Object {
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.native
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The IP address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.native
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.native
  /**
    * The flow that is associated with the output that you want to update.
    */
  var FlowArn: string = js.native
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  /**
    * The ARN of the output that you want to update.
    */
  var OutputArn: string = js.native
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.native
  /**
    * The protocol to use for the output.
    */
  var Protocol: js.UndefOr[typingsSlinky.awsSdk.mediaconnectMod.Protocol] = js.native
  /**
    * The remote ID for the Zixi-pull stream.
    */
  var RemoteId: js.UndefOr[string] = js.native
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.native
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.native
}

object UpdateFlowOutputRequest {
  @scala.inline
  def apply(FlowArn: string, OutputArn: string): UpdateFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowOutputRequest]
  }
  @scala.inline
  implicit class UpdateFlowOutputRequestOps[Self <: UpdateFlowOutputRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrAllowList(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrAllowList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrAllowList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrAllowList")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: UpdateEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLatency(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Protocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteId")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingLatency(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmoothingLatency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmoothingLatency")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamId")(js.undefined)
        ret
    }
  }
  
}

