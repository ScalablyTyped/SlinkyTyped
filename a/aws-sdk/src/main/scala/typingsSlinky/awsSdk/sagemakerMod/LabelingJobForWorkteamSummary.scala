package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobForWorkteamSummary extends js.Object {
  /**
    * The date and time that the labeling job was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * A unique identifier for a labeling job. You can use this to refer to a specific labeling job.
    */
  var JobReferenceCode: typingsSlinky.awsSdk.sagemakerMod.JobReferenceCode = js.native
  /**
    * Provides information about the progress of a labeling job.
    */
  var LabelCounters: js.UndefOr[LabelCountersForWorkteam] = js.native
  /**
    * The name of the labeling job that the work team is assigned to.
    */
  var LabelingJobName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.LabelingJobName] = js.native
  /**
    * The configured number of workers per data object.
    */
  var NumberOfHumanWorkersPerDataObject: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NumberOfHumanWorkersPerDataObject] = js.native
  /**
    * 
    */
  var WorkRequesterAccountId: AccountId = js.native
}

object LabelingJobForWorkteamSummary {
  @scala.inline
  def apply(CreationTime: js.Date, JobReferenceCode: JobReferenceCode, WorkRequesterAccountId: AccountId): LabelingJobForWorkteamSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], JobReferenceCode = JobReferenceCode.asInstanceOf[js.Any], WorkRequesterAccountId = WorkRequesterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobForWorkteamSummary]
  }
  @scala.inline
  implicit class LabelingJobForWorkteamSummaryOps[Self <: LabelingJobForWorkteamSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJobReferenceCode(value: JobReferenceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobReferenceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkRequesterAccountId(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkRequesterAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelCounters(value: LabelCountersForWorkteam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelCounters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCounters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelCounters")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelingJobName(value: LabelingJobName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelingJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelingJobName")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfHumanWorkersPerDataObject(value: NumberOfHumanWorkersPerDataObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfHumanWorkersPerDataObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfHumanWorkersPerDataObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfHumanWorkersPerDataObject")(js.undefined)
        ret
    }
  }
  
}

