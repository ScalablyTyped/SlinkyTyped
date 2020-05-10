package typingsSlinky.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typingsSlinky.gapiClientDoubleclicksearch.AnonAdGroupId
import typingsSlinky.gapiClientDoubleclicksearch.AnonChangedAttributesSinceTimestamp
import typingsSlinky.gapiClientDoubleclicksearch.AnonColumn
import typingsSlinky.gapiClientDoubleclicksearch.AnonSortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportRequest extends js.Object {
  /**
    * The columns to include in the report. This includes both DoubleClick Search columns and saved columns. For DoubleClick Search columns, only the
    * columnName parameter is required. For saved columns only the savedColumnName parameter is required. Both columnName and savedColumnName cannot be set
    * in the same stanza.
    */
  var columns: js.UndefOr[js.Array[ReportApiColumnSpec]] = js.native
  /** Format that the report should be returned in. Currently csv or tsv is supported. */
  var downloadFormat: js.UndefOr[String] = js.native
  /** A list of filters to be applied to the report. */
  var filters: js.UndefOr[js.Array[AnonColumn]] = js.native
  /** Determines if removed entities should be included in the report. Defaults to false. Deprecated, please use includeRemovedEntities instead. */
  var includeDeletedEntities: js.UndefOr[Boolean] = js.native
  /** Determines if removed entities should be included in the report. Defaults to false. */
  var includeRemovedEntities: js.UndefOr[Boolean] = js.native
  /**
    * Asynchronous report only. The maximum number of rows per report file. A large report is split into many files based on this field. Acceptable values
    * are 1000000 to 100000000, inclusive.
    */
  var maxRowsPerFile: js.UndefOr[Double] = js.native
  /** Synchronous report only. A list of columns and directions defining sorting to be performed on the report rows. */
  var orderBy: js.UndefOr[js.Array[AnonSortOrder]] = js.native
  /**
    * The reportScope is a set of IDs that are used to determine which subset of entities will be returned in the report. The full lineage of IDs from the
    * lowest scoped level desired up through agency is required.
    */
  var reportScope: js.UndefOr[AnonAdGroupId] = js.native
  /**
    * Determines the type of rows that are returned in the report. For example, if you specify reportType: keyword, each row in the report will contain data
    * about a keyword. See the Types of Reports reference for the columns that are available for each type.
    */
  var reportType: js.UndefOr[String] = js.native
  /**
    * Synchronous report only. The maxinum number of rows to return; additional rows are dropped. Acceptable values are 0 to 10000, inclusive. Defaults to
    * 10000.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /** Synchronous report only. Zero-based index of the first row to return. Acceptable values are 0 to 50000, inclusive. Defaults to 0. */
  var startRow: js.UndefOr[Double] = js.native
  /**
    * Specifies the currency in which monetary will be returned. Possible values are: usd, agency (valid if the report is scoped to agency or lower),
    * advertiser (valid if the report is scoped to &#42; advertiser or lower), or account (valid if the report is scoped to engine account or lower).
    */
  var statisticsCurrency: js.UndefOr[String] = js.native
  /** If metrics are requested in a report, this argument will be used to restrict the metrics to a specific time range. */
  var timeRange: js.UndefOr[AnonChangedAttributesSinceTimestamp] = js.native
  /** If true, the report would only be created if all the requested stat data are sourced from a single timezone. Defaults to false. */
  var verifySingleTimeZone: js.UndefOr[Boolean] = js.native
}

object ReportRequest {
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  @scala.inline
  implicit class ReportRequestOps[Self <: ReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: js.Array[ReportApiColumnSpec]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[AnonColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDeletedEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeletedEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDeletedEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeletedEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeRemovedEntities(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRemovedEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeRemovedEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRemovedEntities")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRowsPerFile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowsPerFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRowsPerFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRowsPerFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: js.Array[AnonSortOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
        ret
    }
    @scala.inline
    def withReportScope(value: AnonAdGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportScope")(js.undefined)
        ret
    }
    @scala.inline
    def withReportType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportType")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(js.undefined)
        ret
    }
    @scala.inline
    def withStatisticsCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticsCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatisticsCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statisticsCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeRange(value: AnonChangedAttributesSinceTimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeRange")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifySingleTimeZone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifySingleTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifySingleTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifySingleTimeZone")(js.undefined)
        ret
    }
  }
  
}

