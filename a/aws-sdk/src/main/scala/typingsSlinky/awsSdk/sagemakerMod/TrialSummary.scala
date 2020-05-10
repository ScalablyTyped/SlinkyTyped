package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialSummary extends js.Object {
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * When the trial was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialArn] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
  var TrialSource: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.TrialSource] = js.native
}

object TrialSummary {
  @scala.inline
  def apply(): TrialSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialSummary]
  }
  @scala.inline
  implicit class TrialSummaryOps[Self <: TrialSummary] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withTrialSource(value: TrialSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrialSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrialSource")(js.undefined)
        ret
    }
  }
  
}

