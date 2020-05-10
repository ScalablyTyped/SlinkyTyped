package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var loadBalancer: js.UndefOr[Input[LoadBalancerStatus]] = js.native
}

object ServiceStatus {
  @scala.inline
  def apply(): ServiceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceStatus]
  }
  @scala.inline
  implicit class ServiceStatusOps[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadBalancer(value: Input[LoadBalancerStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancer")(js.undefined)
        ret
    }
  }
  
}

