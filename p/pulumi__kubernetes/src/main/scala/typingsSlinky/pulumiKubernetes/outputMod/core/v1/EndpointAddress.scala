package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val hostname: String = js.native
  /**
    * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or
    * link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all
    * platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
    */
  val ip: String = js.native
  /**
    * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a
    * node.
    */
  val nodeName: String = js.native
  /**
    * Reference to object providing the endpoint.
    */
  val targetRef: ObjectReference = js.native
}

object EndpointAddress {
  @scala.inline
  def apply(hostname: String, ip: String, nodeName: String, targetRef: ObjectReference): EndpointAddress = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAddress]
  }
  @scala.inline
  implicit class EndpointAddressOps[Self <: EndpointAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRef(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

