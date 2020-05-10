package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of the timespan of the items to include in scanning.
  * Currently only supported when inspecting Google Cloud Storage and BigQuery.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TimespanConfig extends js.Object {
  /**
    * When the job is started by a JobTrigger we will automatically figure out
    * a valid start_time to avoid scanning files that have not been modified
    * since the last time the JobTrigger executed. This will be based on the
    * time of the execution of the last run of the JobTrigger.
    */
  var enableAutoPopulationOfTimespanConfig: js.UndefOr[Boolean] = js.native
  /**
    * Exclude files or rows newer than this value. If set to zero, no upper
    * time limit is applied.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Exclude files or rows older than this value.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Specification of the field containing the timestamp of scanned items.
    * Used for data sources like Datastore or BigQuery. If not specified for
    * BigQuery, table last modification timestamp is checked against given time
    * span. The valid data types of the timestamp field are: for BigQuery -
    * timestamp, date, datetime; for Datastore - timestamp. Datastore entity
    * will be scanned if the timestamp property does not exist or its value is
    * empty or invalid.
    */
  var timestampField: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2TimespanConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TimespanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimespanConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TimespanConfigOps[Self <: SchemaGooglePrivacyDlpV2TimespanConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableAutoPopulationOfTimespanConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoPopulationOfTimespanConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAutoPopulationOfTimespanConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAutoPopulationOfTimespanConfig")(js.undefined)
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
    def withTimestampField(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampField")(js.undefined)
        ret
    }
  }
  
}

