package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsListWorkflowRunArtifactsResponse extends js.Object {
  var artifacts: js.Array[ActionsListWorkflowRunArtifactsResponseArtifactsItem] = js.native
  var total_count: Double = js.native
}

object ActionsListWorkflowRunArtifactsResponse {
  @scala.inline
  def apply(artifacts: js.Array[ActionsListWorkflowRunArtifactsResponseArtifactsItem], total_count: Double): ActionsListWorkflowRunArtifactsResponse = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsResponse]
  }
  @scala.inline
  implicit class ActionsListWorkflowRunArtifactsResponseOps[Self <: ActionsListWorkflowRunArtifactsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts(value: js.Array[ActionsListWorkflowRunArtifactsResponseArtifactsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

