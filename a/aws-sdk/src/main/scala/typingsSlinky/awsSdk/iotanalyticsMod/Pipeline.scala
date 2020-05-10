package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pipeline extends js.Object {
  /**
    * The activities that perform transformations on the messages.
    */
  var activities: js.UndefOr[PipelineActivities] = js.native
  /**
    * The ARN of the pipeline.
    */
  var arn: js.UndefOr[PipelineArn] = js.native
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * The last time the pipeline was updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the pipeline.
    */
  var name: js.UndefOr[PipelineName] = js.native
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.native
}

object Pipeline {
  @scala.inline
  def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  @scala.inline
  implicit class PipelineOps[Self <: Pipeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivities(value: PipelineActivities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: PipelineArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
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
    def withName(value: PipelineName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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

