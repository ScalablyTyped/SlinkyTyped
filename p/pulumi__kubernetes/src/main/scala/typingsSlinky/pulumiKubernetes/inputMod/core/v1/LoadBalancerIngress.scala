package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
  */
@js.native
trait LoadBalancerIngress extends js.Object {
  
  /**
    * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
    */
  var hostname: js.UndefOr[Input[String]] = js.native
  
  /**
    * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
    */
  var ip: js.UndefOr[Input[String]] = js.native
}
object LoadBalancerIngress {
  
  @scala.inline
  def apply(): LoadBalancerIngress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerIngress]
  }
  
  @scala.inline
  implicit class LoadBalancerIngressOps[Self <: LoadBalancerIngress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostname(value: Input[String]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIp(value: Input[String]): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
  }
}
