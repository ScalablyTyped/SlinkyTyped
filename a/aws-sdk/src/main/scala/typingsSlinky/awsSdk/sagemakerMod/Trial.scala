package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trial extends js.Object {
  var CreatedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the experiment the trial is part of.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  /**
    * Who last modified the trial.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  var Source: js.UndefOr[TrialSource] = js.native
  /**
    * The list of tags that are associated with the trial. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialArn] = js.native
  /**
    * A list of the components associated with the trial. For each component, a summary of the component's properties is included.
    */
  var TrialComponentSummaries: js.UndefOr[TrialComponentSimpleSummaries] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}

object Trial {
  @scala.inline
  def apply(): Trial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trial]
  }
  @scala.inline
  implicit class TrialOps[Self <: Trial] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedBy(value: UserContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimentName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedBy(value: UserContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: TrialSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialArn(value: TrialArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialComponentSummaries(value: TrialComponentSimpleSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialComponentSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialComponentSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withTrialName(value: ExperimentEntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialName")(js.undefined)
        ret
    }
  }
  
}

