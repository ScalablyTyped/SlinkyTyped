package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceStatus represents the current status of a service.
  */
@js.native
trait ServiceStatus extends js.Object {
  /**
    * LoadBalancer contains the current status of the load-balancer, if one is present.
    */
  val loadBalancer: LoadBalancerStatus = js.native
}

object ServiceStatus {
  @scala.inline
  def apply(loadBalancer: LoadBalancerStatus): ServiceStatus = {
    val __obj = js.Dynamic.literal(loadBalancer = loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  @scala.inline
  implicit class ServiceStatusOps[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancer(value: LoadBalancerStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

