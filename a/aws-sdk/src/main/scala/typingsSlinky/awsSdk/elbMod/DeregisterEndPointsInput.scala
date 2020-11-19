package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterEndPointsInput extends js.Object {
  
  /**
    * The IDs of the instances.
    */
  var Instances: typingsSlinky.awsSdk.elbMod.Instances = js.native
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}
object DeregisterEndPointsInput {
  
  @scala.inline
  def apply(Instances: Instances, LoadBalancerName: AccessPointName): DeregisterEndPointsInput = {
    val __obj = js.Dynamic.literal(Instances = Instances.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEndPointsInput]
  }
  
  @scala.inline
  implicit class DeregisterEndPointsInputOps[Self <: DeregisterEndPointsInput] (val x: Self) extends AnyVal {
    
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
    def setInstancesVarargs(value: Instance*): Self = this.set("Instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: Instances): Self = this.set("Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
