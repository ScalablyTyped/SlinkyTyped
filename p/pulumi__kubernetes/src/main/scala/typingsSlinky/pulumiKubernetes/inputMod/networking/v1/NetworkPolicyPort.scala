package typingsSlinky.pulumiKubernetes.inputMod.networking.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyPort describes a port to allow traffic on
  */
@js.native
trait NetworkPolicyPort extends js.Object {
  /**
    * The port on the given protocol. This can either be a numerical or named port on a pod. If
    * this field is not provided, this matches all port names and numbers.
    */
  var port: js.UndefOr[Input[Double | String]] = js.native
  /**
    * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this field
    * defaults to TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.native
}

object NetworkPolicyPort {
  @scala.inline
  def apply(): NetworkPolicyPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPolicyPort]
  }
  @scala.inline
  implicit class NetworkPolicyPortOps[Self <: NetworkPolicyPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Input[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
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

