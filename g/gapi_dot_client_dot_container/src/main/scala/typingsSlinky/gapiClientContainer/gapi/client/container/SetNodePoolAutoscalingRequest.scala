package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNodePoolAutoscalingRequest extends js.Object {
  /** Autoscaling configuration for the node pool. */
  var autoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
}

object SetNodePoolAutoscalingRequest {
  @scala.inline
  def apply(): SetNodePoolAutoscalingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNodePoolAutoscalingRequest]
  }
  @scala.inline
  implicit class SetNodePoolAutoscalingRequestOps[Self <: SetNodePoolAutoscalingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscaling(value: NodePoolAutoscaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(js.undefined)
        ret
    }
  }
  
}

