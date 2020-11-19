package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.emrMod.ClusterId
import typingsSlinky.awsSdk.emrMod.StepId
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/emr.DescribeStepInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeStepInputwaiterWa extends js.Object {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The identifier of the cluster with steps to describe.
    */
  var ClusterId: typingsSlinky.awsSdk.emrMod.ClusterId = js.native
  
  /**
    * The identifier of the step to describe.
    */
  var StepId: typingsSlinky.awsSdk.emrMod.StepId = js.native
}
object DescribeStepInputwaiterWa {
  
  @scala.inline
  def apply(ClusterId: ClusterId, StepId: StepId): DescribeStepInputwaiterWa = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], StepId = StepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStepInputwaiterWa]
  }
  
  @scala.inline
  implicit class DescribeStepInputwaiterWaOps[Self <: DescribeStepInputwaiterWa] (val x: Self) extends AnyVal {
    
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepId(value: StepId): Self = this.set("StepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
}
