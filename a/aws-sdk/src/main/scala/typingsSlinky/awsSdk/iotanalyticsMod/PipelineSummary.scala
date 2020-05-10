package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineSummary extends js.Object {
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * When the pipeline was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.native
}

object PipelineSummary {
  @scala.inline
  def apply(): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineSummary]
  }
  @scala.inline
  implicit class PipelineSummaryOps[Self <: PipelineSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPipelineName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPipelineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pipelineName")(js.undefined)
        ret
    }
    @scala.inline
    def withReprocessingSummaries(value: ReprocessingSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprocessingSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReprocessingSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reprocessingSummaries")(js.undefined)
        ret
    }
  }
  
}

