package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApprovalResultInput extends js.Object {
  /**
    * The name of the action for which approval is requested.
    */
  var actionName: ActionName = js.native
  /**
    * The name of the pipeline that contains the action. 
    */
  var pipelineName: PipelineName = js.native
  /**
    * Represents information about the result of the approval request.
    */
  var result: ApprovalResult = js.native
  /**
    * The name of the stage that contains the action.
    */
  var stageName: StageName = js.native
  /**
    * The system-generated token used to identify a unique approval request. The token for each open approval request can be obtained using the GetPipelineState action. It is used to validate that the approval request corresponding to this token is still valid.
    */
  var token: ApprovalToken = js.native
}

object PutApprovalResultInput {
  @scala.inline
  def apply(
    actionName: ActionName,
    pipelineName: PipelineName,
    result: ApprovalResult,
    stageName: StageName,
    token: ApprovalToken
  ): PutApprovalResultInput = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutApprovalResultInput]
  }
  @scala.inline
  implicit class PutApprovalResultInputOps[Self <: PutApprovalResultInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionName(value: ActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: ApprovalResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: StageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: ApprovalToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

