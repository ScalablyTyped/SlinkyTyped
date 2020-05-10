package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferRun extends js.Object {
  /** Output only. Data source id. */
  var dataSourceId: js.UndefOr[String] = js.native
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[String] = js.native
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.native
  /**
    * Output only. Time when transfer run ended.
    * Parameter ignored by server for input requests.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The resource name of the transfer run.
    * Transfer run names have the form
    * `projects/{project_id}/locations/{location}/transferConfigs/{config_id}/runs/{run_id}`.
    * The name is ignored when creating a transfer run.
    */
  var name: js.UndefOr[String] = js.native
  /** Data transfer specific parameters. */
  var params: js.UndefOr[Record[String, _]] = js.native
  /**
    * For batch transfer runs, specifies the date and time that
    * data should be ingested.
    */
  var runTime: js.UndefOr[String] = js.native
  /**
    * Output only. Describes the schedule of this transfer run if it was
    * created as part of a regular schedule. For batch transfer runs that are
    * scheduled manually, this is empty.
    * NOTE: the system might choose to delay the schedule depending on the
    * current load, so `schedule_time` doesn't always matches this.
    */
  var schedule: js.UndefOr[String] = js.native
  /** Minimum time after which a transfer run can be started. */
  var scheduleTime: js.UndefOr[String] = js.native
  /**
    * Output only. Time when transfer run was started.
    * Parameter ignored by server for input requests.
    */
  var startTime: js.UndefOr[String] = js.native
  /** Output only. Data transfer run state. Ignored for input requests. */
  var state: js.UndefOr[String] = js.native
  /** Output only. Last time the data transfer run state was updated. */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. Unique ID of the user on whose behalf transfer is done.
    * Applicable only to data sources that do not support service accounts.
    * When set to 0, the data source service account credentials are used.
    */
  var userId: js.UndefOr[String] = js.native
}

object TransferRun {
  @scala.inline
  def apply(): TransferRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferRun]
  }
  @scala.inline
  implicit class TransferRunOps[Self <: TransferRun] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationDatasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationDatasetId")(js.undefined)
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
    def withParams(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withRunTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduleTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduleTime")(js.undefined)
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
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

