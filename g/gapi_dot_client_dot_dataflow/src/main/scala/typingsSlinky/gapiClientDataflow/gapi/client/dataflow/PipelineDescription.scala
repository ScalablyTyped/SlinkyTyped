package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineDescription extends js.Object {
  /** Pipeline level display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.native
  /** Description of each stage of execution of the pipeline. */
  var executionPipelineStage: js.UndefOr[js.Array[ExecutionStageSummary]] = js.native
  /** Description of each transform in the pipeline and collections between them. */
  var originalPipelineTransform: js.UndefOr[js.Array[TransformSummary]] = js.native
}

object PipelineDescription {
  @scala.inline
  def apply(): PipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineDescription]
  }
  @scala.inline
  implicit class PipelineDescriptionOps[Self <: PipelineDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayData(value: js.Array[DisplayData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayData")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionPipelineStage(value: js.Array[ExecutionStageSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPipelineStage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionPipelineStage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionPipelineStage")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalPipelineTransform(value: js.Array[TransformSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPipelineTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPipelineTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPipelineTransform")(js.undefined)
        ret
    }
  }
  
}

