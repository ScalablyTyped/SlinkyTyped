package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Combines all of the information about a DLP job.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DlpJob extends js.Object {
  /**
    * Time when the job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Time when the job finished.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * A stream of errors encountered running the job.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.native
  /**
    * Results from inspecting a data source.
    */
  var inspectDetails: js.UndefOr[SchemaGooglePrivacyDlpV2InspectDataSourceDetails] = js.native
  /**
    * If created by a job trigger, the resource name of the trigger that
    * instantiated the job.
    */
  var jobTriggerName: js.UndefOr[String] = js.native
  /**
    * The server-assigned name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Results from analyzing risk of a data source.
    */
  var riskDetails: js.UndefOr[SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails] = js.native
  /**
    * Time when the job started.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * State of a job.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The type of job.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2DlpJob {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DlpJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DlpJob]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DlpJobOps[Self <: SchemaGooglePrivacyDlpV2DlpJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[SchemaGooglePrivacyDlpV2Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withInspectDetails(value: SchemaGooglePrivacyDlpV2InspectDataSourceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withJobTriggerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTriggerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobTriggerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobTriggerName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withRiskDetails(value: SchemaGooglePrivacyDlpV2AnalyzeDataSourceRiskDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiskDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("riskDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

