package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.emrMod.ClusterId
import typingsSlinky.awsSdk.emrMod.StepId
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/emr.DescribeStepInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
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
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStepId(value: StepId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
  }
  
}

