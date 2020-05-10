package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a configuration to make dlp api calls on a repeating basis. See
  * https://cloud.google.com/dlp/docs/concepts-job-triggers to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2JobTrigger extends js.Object {
  /**
    * The creation timestamp of a triggeredJob, output only field.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * User provided description (max 256 chars)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name (max 100 chars)
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A stream of errors encountered when the trigger was activated. Repeated
    * errors may result in the JobTrigger automatically being paused. Will
    * return the last 100 errors. Whenever the JobTrigger is modified this list
    * will be cleared. Output only field.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.native
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * The timestamp of the last time this trigger executed, output only field.
    */
  var lastRunTime: js.UndefOr[String] = js.native
  /**
    * Unique resource name for the triggeredJob, assigned by the service when
    * the triggeredJob is created, for example
    * `projects/dlp-test-project/triggeredJobs/53234423`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A status for this trigger. [required]
    */
  var status: js.UndefOr[String] = js.native
  /**
    * A list of triggers which will be OR&#39;ed together. Only one in the list
    * needs to trigger for a job to be started. The list may contain only a
    * single Schedule trigger and must have at least one object.
    */
  var triggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Trigger]] = js.native
  /**
    * The last update timestamp of a triggeredJob, output only field.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2JobTrigger {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2JobTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2JobTrigger]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2JobTriggerOps[Self <: SchemaGooglePrivacyDlpV2JobTrigger] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
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
    def withInspectJob(value: SchemaGooglePrivacyDlpV2InspectJobConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInspectJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspectJob")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRunTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRunTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRunTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRunTime")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggers(value: js.Array[SchemaGooglePrivacyDlpV2Trigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

