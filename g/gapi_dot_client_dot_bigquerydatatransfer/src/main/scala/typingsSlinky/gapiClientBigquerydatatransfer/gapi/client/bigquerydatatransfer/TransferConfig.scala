package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferConfig extends js.Object {
  /**
    * The number of days to look back to automatically refresh the data.
    * For example, if `data_refresh_window_days = 10`, then every day
    * BigQuery reingests data for [today-10, today-1], rather than ingesting data
    * for just [today-1].
    * Only valid if the data source supports the feature. Set the value to  0
    * to use the default value.
    */
  var dataRefreshWindowDays: js.UndefOr[Double] = js.native
  /** Data source id. Cannot be changed once data transfer is created. */
  var dataSourceId: js.UndefOr[String] = js.native
  /** Output only. Region in which BigQuery dataset is located. */
  var datasetRegion: js.UndefOr[String] = js.native
  /** The BigQuery target dataset id. */
  var destinationDatasetId: js.UndefOr[String] = js.native
  /**
    * Is this config disabled. When set to true, no runs are scheduled
    * for a given transfer.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /** User specified display name for the data transfer. */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The resource name of the transfer config.
    * Transfer config names have the form
    * `projects/{project_id}/transferConfigs/{config_id}`.
    * Where `config_id` is usually a uuid, even though it is not
    * guaranteed or required. The name is ignored when creating a transfer
    * config.
    */
  var name: js.UndefOr[String] = js.native
  /** Output only. Next time when data transfer will run. */
  var nextRunTime: js.UndefOr[String] = js.native
  /** Data transfer specific parameters. */
  var params: js.UndefOr[Record[String, _]] = js.native
  /**
    * Data transfer schedule.
    * If the data source does not support a custom schedule, this should be
    * empty. If it is empty, the default value for the data source will be
    * used.
    * The specified times are in UTC.
    * Examples of valid format:
    * `1st,3rd monday of month 15:30`,
    * `every wed,fri of jan,jun 13:15`, and
    * `first sunday of quarter 00:00`.
    * See more explanation about the format here:
    * https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-yaml#the_schedule_format
    * NOTE: the granularity should be at least 8 hours, or less frequent.
    */
  var schedule: js.UndefOr[String] = js.native
  /** Output only. State of the most recently updated transfer run. */
  var state: js.UndefOr[String] = js.native
  /** Output only. Data transfer modification time. Ignored by server on input. */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. Unique ID of the user on whose behalf transfer is done.
    * Applicable only to data sources that do not support service accounts.
    * When set to 0, the data source service account credentials are used.
    */
  var userId: js.UndefOr[String] = js.native
}

object TransferConfig {
  @scala.inline
  def apply(): TransferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferConfig]
  }
  @scala.inline
  implicit class TransferConfigOps[Self <: TransferConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRefreshWindowDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRefreshWindowDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRefreshWindowDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRefreshWindowDays")(js.undefined)
        ret
    }
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withNextRunTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextRunTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextRunTime")(js.undefined)
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

