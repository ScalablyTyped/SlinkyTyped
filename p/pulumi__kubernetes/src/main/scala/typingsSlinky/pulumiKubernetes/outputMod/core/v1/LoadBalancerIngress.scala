package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended
  * for the service should be sent to an ingress point.
  */
@js.native
trait LoadBalancerIngress extends js.Object {
  /**
    * Hostname is set for load-balancer ingress points that are DNS based (typically AWS
    * load-balancers)
    */
  val hostname: String = js.native
  /**
    * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack
    * load-balancers)
    */
  val ip: String = js.native
}

object LoadBalancerIngress {
  @scala.inline
  def apply(hostname: String, ip: String): LoadBalancerIngress = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerIngress]
  }
  @scala.inline
  implicit class LoadBalancerIngressOps[Self <: LoadBalancerIngress] (val x: Self) extends AnyVal {
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
  }
  
}

