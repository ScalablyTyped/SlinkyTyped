package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerInstance extends js.Object {
  
  /**
    * The instance identifier.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
}
object AwsElbLoadBalancerInstance {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerInstance]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerInstanceOps[Self <: AwsElbLoadBalancerInstance] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: NonEmptyString): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
}
