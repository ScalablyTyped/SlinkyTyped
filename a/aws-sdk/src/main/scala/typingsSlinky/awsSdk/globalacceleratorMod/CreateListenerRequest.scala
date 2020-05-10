package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateListenerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  var AcceleratorArn: GenericString = js.native
  /**
    * Client affinity lets you direct all requests from a user to the same endpoint, if you have stateful applications, regardless of the port and protocol of the client request. Clienty affinity gives you control over whether to always route each client to the same specific endpoint. AWS Global Accelerator uses a consistent-flow hashing algorithm to choose the optimal endpoint for a connection. If client affinity is NONE, Global Accelerator uses the "five-tuple" (5-tuple) properties—source IP address, source port, destination IP address, destination port, and protocol—to select the hash value, and then chooses the best endpoint. However, with this setting, if someone uses different ports to connect to Global Accelerator, their connections might not be always routed to the same endpoint because the hash value changes.  If you want a given client to always be routed to the same endpoint, set client affinity to SOURCE_IP instead. When you use the SOURCE_IP setting, Global Accelerator uses the "two-tuple" (2-tuple) properties— source (client) IP address and destination IP address—to select the hash value. The default value is NONE.
    */
  var ClientAffinity: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.ClientAffinity] = js.native
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency—that is, the uniqueness—of the request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.globalacceleratorMod.IdempotencyToken = js.native
  /**
    * The list of port ranges to support for connections from clients to your accelerator.
    */
  var PortRanges: typingsSlinky.awsSdk.globalacceleratorMod.PortRanges = js.native
  /**
    * The protocol for connections from clients to your accelerator.
    */
  var Protocol: typingsSlinky.awsSdk.globalacceleratorMod.Protocol = js.native
}

object CreateListenerRequest {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString,
    IdempotencyToken: IdempotencyToken,
    PortRanges: PortRanges,
    Protocol: Protocol
  ): CreateListenerRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], PortRanges = PortRanges.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListenerRequest]
  }
  @scala.inline
  implicit class CreateListenerRequestOps[Self <: CreateListenerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleratorArn(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceleratorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortRanges(value: PortRanges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PortRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: Protocol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientAffinity(value: ClientAffinity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientAffinity")(js.undefined)
        ret
    }
  }
  
}

