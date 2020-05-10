package typingsSlinky.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /** Indicates the type of authorization. */
  var authorizationType: js.UndefOr[String] = js.native
  /**
    * Data source client id which should be used to receive refresh token.
    * When not supplied, no offline credentials are populated for data transfer.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * Specifies whether the data source supports automatic data refresh for the
    * past few days, and how it's supported.
    * For some data sources, data might not be complete until a few days later,
    * so it's useful to refresh data automatically.
    */
  var dataRefreshType: js.UndefOr[String] = js.native
  /** Data source id. */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * Default data refresh window on days.
    * Only meaningful when `data_refresh_type` = `SLIDING_WINDOW`.
    */
  var defaultDataRefreshWindowDays: js.UndefOr[Double] = js.native
  /**
    * Default data transfer schedule.
    * Examples of valid schedules include:
    * `1st,3rd monday of month 15:30`,
    * `every wed,fri of jan,jun 13:15`, and
    * `first sunday of quarter 00:00`.
    */
  var defaultSchedule: js.UndefOr[String] = js.native
  /** User friendly data source description string. */
  var description: js.UndefOr[String] = js.native
  /** User friendly data source name. */
  var displayName: js.UndefOr[String] = js.native
  /** Url for the help document for this data source. */
  var helpUrl: js.UndefOr[String] = js.native
  /**
    * Disables backfilling and manual run scheduling
    * for the data source.
    */
  var manualRunsDisabled: js.UndefOr[Boolean] = js.native
  /** The minimum interval between two consecutive scheduled runs. */
  var minimumScheduleInterval: js.UndefOr[String] = js.native
  /** Data source resource name. */
  var name: js.UndefOr[String] = js.native
  /** Data source parameters. */
  var parameters: js.UndefOr[js.Array[DataSourceParameter]] = js.native
  /**
    * Api auth scopes for which refresh token needs to be obtained. Only valid
    * when `client_id` is specified. Ignored otherwise. These are scopes needed
    * by a data source to prepare data and ingest them into BigQuery,
    * e.g., https://www.googleapis.com/auth/bigquery
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies whether the data source supports a user defined schedule, or
    * operates on the default schedule.
    * When set to `true`, user can override default schedule.
    */
  var supportsCustomSchedule: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the data source supports multiple transfers
    * to different BigQuery targets.
    */
  var supportsMultipleTransfers: js.UndefOr[Boolean] = js.native
  /**
    * Transfer type. Currently supports only batch transfers,
    * which are transfers that use the BigQuery batch APIs (load or
    * query) to ingest the data.
    */
  var transferType: js.UndefOr[String] = js.native
  /**
    * The number of seconds to wait for an update from the data source
    * before BigQuery marks the transfer as failed.
    */
  var updateDeadlineSeconds: js.UndefOr[Double] = js.native
}

object DataSource {
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorizationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationType")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withDataRefreshType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRefreshType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRefreshType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRefreshType")(js.undefined)
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
    def withDefaultDataRefreshWindowDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataRefreshWindowDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDataRefreshWindowDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDataRefreshWindowDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSchedule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSchedule")(js.undefined)
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
    def withHelpUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withManualRunsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRunsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualRunsDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRunsDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumScheduleInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScheduleInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumScheduleInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumScheduleInterval")(js.undefined)
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
    def withParameters(value: js.Array[DataSourceParameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsCustomSchedule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCustomSchedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsCustomSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsCustomSchedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsMultipleTransfers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMultipleTransfers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsMultipleTransfers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsMultipleTransfers")(js.undefined)
        ret
    }
    @scala.inline
    def withTransferType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transferType")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateDeadlineSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeadlineSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateDeadlineSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeadlineSeconds")(js.undefined)
        ret
    }
  }
  
}

