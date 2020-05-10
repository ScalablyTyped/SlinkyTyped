package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutActionRevisionInput extends js.Object {
  /**
    * The name of the action that processes the revision.
    */
  var actionName: ActionName = js.native
  /**
    * Represents information about the version (or revision) of an action.
    */
  var actionRevision: ActionRevision = js.native
  /**
    * The name of the pipeline that starts processing the revision to the source.
    */
  var pipelineName: PipelineName = js.native
  /**
    * The name of the stage that contains the action that acts on the revision.
    */
  var stageName: StageName = js.native
}

object PutActionRevisionInput {
  @scala.inline
  def apply(
    actionName: ActionName,
    actionRevision: ActionRevision,
    pipelineName: PipelineName,
    stageName: StageName
  ): PutActionRevisionInput = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionRevision = actionRevision.asInstanceOf[js.Any], pipelineName = pipelineName.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutActionRevisionInput]
  }
  @scala.inline
  implicit class PutActionRevisionInputOps[Self <: PutActionRevisionInput] (val x: Self) extends AnyVal {
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
    def withActionRevision(value: ActionRevision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionRevision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: StageName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

