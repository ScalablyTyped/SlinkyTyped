package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterEndPointsOutput extends js.Object {
  
  /**
    * The remaining instances registered with the load balancer.
    */
  var Instances: js.UndefOr[typingsSlinky.awsSdk.elbMod.Instances] = js.native
}
object DeregisterEndPointsOutput {
  
  @scala.inline
  def apply(): DeregisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterEndPointsOutput]
  }
  
  @scala.inline
  implicit class DeregisterEndPointsOutputOps[Self <: DeregisterEndPointsOutput] (val x: Self) extends AnyVal {
    
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
    def deleteInstances: Self = this.set("Instances", js.undefined)
  }
}
