package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentSummary extends js.Object {
  /**
    * When the experiment was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the experiment as displayed. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentArn] = js.native
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  var ExperimentSource: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ExperimentSource] = js.native
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
}

object ExperimentSummary {
  @scala.inline
  def apply(): ExperimentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentSummary]
  }
  @scala.inline
  implicit class ExperimentSummaryOps[Self <: ExperimentSummary] (val x: Self) extends AnyVal {
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
    def withExperimentArn(value: ExperimentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentArn")(js.undefined)
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
    def withExperimentSource(value: ExperimentSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimentSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExperimentSource")(js.undefined)
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
  }
  
}

