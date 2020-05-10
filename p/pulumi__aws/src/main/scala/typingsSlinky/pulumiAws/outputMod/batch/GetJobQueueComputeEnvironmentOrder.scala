package typingsSlinky.pulumiAws.outputMod.batch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobQueueComputeEnvironmentOrder extends js.Object {
  var computeEnvironment: String = js.native
  var order: Double = js.native
}

object GetJobQueueComputeEnvironmentOrder {
  @scala.inline
  def apply(computeEnvironment: String, order: Double): GetJobQueueComputeEnvironmentOrder = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobQueueComputeEnvironmentOrder]
  }
  @scala.inline
  implicit class GetJobQueueComputeEnvironmentOrderOps[Self <: GetJobQueueComputeEnvironmentOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputeEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

