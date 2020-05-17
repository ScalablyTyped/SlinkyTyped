package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.codepipelineCloudwatchStageMod.CodePipelineStageState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stage extends js.Object {
  var `execution-id`: String = js.native
  var pipeline: String = js.native
  var stage: String = js.native
  var state: CodePipelineStageState = js.native
  var version: Double = js.native
}

object Stage {
  @scala.inline
  def apply(
    `execution-id`: String,
    pipeline: String,
    stage: String,
    state: CodePipelineStageState,
    version: Double
  ): Stage = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("execution-id")(`execution-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withExecution-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPipeline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: CodePipelineStageState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

