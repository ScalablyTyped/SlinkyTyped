package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionOutput extends js.Object {
  /**
    * Execution result information listed in the output details for an action execution.
    */
  var executionResult: js.UndefOr[ActionExecutionResult] = js.native
  /**
    * Details of output artifacts of the action that correspond to the action execution.
    */
  var outputArtifacts: js.UndefOr[ArtifactDetailList] = js.native
  /**
    * The outputVariables field shows the key-value pairs that were output as part of that execution.
    */
  var outputVariables: js.UndefOr[OutputVariablesMap] = js.native
}

object ActionExecutionOutput {
  @scala.inline
  def apply(): ActionExecutionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionOutput]
  }
  @scala.inline
  implicit class ActionExecutionOutputOps[Self <: ActionExecutionOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionResult(value: ActionExecutionResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionResult")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputArtifacts(value: ArtifactDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputArtifacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputArtifacts")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputVariables(value: OutputVariablesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputVariables")(js.undefined)
        ret
    }
  }
  
}

