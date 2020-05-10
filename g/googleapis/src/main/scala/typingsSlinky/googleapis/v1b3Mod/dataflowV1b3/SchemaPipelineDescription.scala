package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A descriptive representation of submitted pipeline as well as the executed
  * form.  This data is provided by the Dataflow service for ease of
  * visualizing the pipeline and interpreting Dataflow provided metrics.
  */
@js.native
trait SchemaPipelineDescription extends js.Object {
  /**
    * Pipeline level display data.
    */
  var displayData: js.UndefOr[js.Array[SchemaDisplayData]] = js.native
  /**
    * Description of each stage of execution of the pipeline.
    */
  var executionPipelineStage: js.UndefOr[js.Array[SchemaExecutionStageSummary]] = js.native
  /**
    * Description of each transform in the pipeline and collections between
    * them.
    */
  var originalPipelineTransform: js.UndefOr[js.Array[SchemaTransformSummary]] = js.native
}

object SchemaPipelineDescription {
  @scala.inline
  def apply(): SchemaPipelineDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPipelineDescription]
  }
  @scala.inline
  implicit class SchemaPipelineDescriptionOps[Self <: SchemaPipelineDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayData(value: js.Array[SchemaDisplayData]): Self = {
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
    def withExecutionPipelineStage(value: js.Array[SchemaExecutionStageSummary]): Self = {
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
    def withOriginalPipelineTransform(value: js.Array[SchemaTransformSummary]): Self = {
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

