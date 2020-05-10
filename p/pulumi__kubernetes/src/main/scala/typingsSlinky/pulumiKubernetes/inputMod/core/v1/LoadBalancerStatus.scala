package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LoadBalancerStatus represents the status of a load-balancer.
  */
@js.native
trait LoadBalancerStatus extends js.Object {
  /**
    * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the
    * service should be sent to these ingress points.
    */
  var ingress: js.UndefOr[Input[js.Array[Input[LoadBalancerIngress]]]] = js.native
}

object LoadBalancerStatus {
  @scala.inline
  def apply(): LoadBalancerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerStatus]
  }
  @scala.inline
  implicit class LoadBalancerStatusOps[Self <: LoadBalancerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIngress(value: Input[js.Array[Input[LoadBalancerIngress]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingress")(js.undefined)
        ret
    }
  }
  
}

