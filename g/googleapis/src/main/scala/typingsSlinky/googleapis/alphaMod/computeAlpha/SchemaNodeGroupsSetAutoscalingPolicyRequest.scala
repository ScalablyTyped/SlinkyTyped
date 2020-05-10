package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsSetAutoscalingPolicyRequest extends js.Object {
  var autoscalingPolicy: js.UndefOr[SchemaNodeGroupAutoscalingPolicy] = js.native
}

object SchemaNodeGroupsSetAutoscalingPolicyRequest {
  @scala.inline
  def apply(): SchemaNodeGroupsSetAutoscalingPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsSetAutoscalingPolicyRequest]
  }
  @scala.inline
  implicit class SchemaNodeGroupsSetAutoscalingPolicyRequestOps[Self <: SchemaNodeGroupsSetAutoscalingPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalingPolicy(value: SchemaNodeGroupAutoscalingPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalingPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalingPolicy")(js.undefined)
        ret
    }
  }
  
}

