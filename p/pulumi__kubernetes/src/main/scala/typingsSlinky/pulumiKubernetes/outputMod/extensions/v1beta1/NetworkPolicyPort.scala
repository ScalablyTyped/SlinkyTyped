package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED 1.9 - This group version of NetworkPolicyPort is deprecated by
  * networking/v1/NetworkPolicyPort.
  */
@js.native
trait NetworkPolicyPort extends js.Object {
  /**
    * If specified, the port on the given protocol.  This can either be a numerical or named port
    * on a pod.  If this field is not provided, this matches all port names and numbers. If
    * present, only traffic on the specified protocol AND port will be matched.
    */
  val port: Double | String = js.native
  /**
    * Optional.  The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified,
    * this field defaults to TCP.
    */
  val protocol: String = js.native
}

object NetworkPolicyPort {
  @scala.inline
  def apply(port: Double | String, protocol: String): NetworkPolicyPort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyPort]
  }
  @scala.inline
  implicit class NetworkPolicyPortOps[Self <: NetworkPolicyPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

