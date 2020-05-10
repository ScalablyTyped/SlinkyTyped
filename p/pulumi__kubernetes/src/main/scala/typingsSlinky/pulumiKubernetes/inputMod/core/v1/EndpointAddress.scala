package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointAddress is a tuple that describes single IP address.
  */
@js.native
trait EndpointAddress extends js.Object {
  /**
    * The Hostname of this endpoint
    */
  var hostname: js.UndefOr[Input[String]] = js.native
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or
    * link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all
    * platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  var ip: Input[String] = js.native
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a
    * node.
    */
  var nodeName: js.UndefOr[Input[String]] = js.native
  /**
    * Reference to object providing the endpoint.
    */
  var targetRef: js.UndefOr[Input[ObjectReference]] = js.native
}

object EndpointAddress {
  @scala.inline
  def apply(ip: Input[String]): EndpointAddress = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAddress]
  }
  @scala.inline
  implicit class EndpointAddressOps[Self <: EndpointAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetRef(value: Input[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(js.undefined)
        ret
    }
  }
  
}

