package typingsSlinky.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request object used to create a DoubleClick Search report.
  */
@js.native
trait SchemaReportApiColumnSpec extends js.Object {
  /**
    * Name of a DoubleClick Search column to include in the report.
    */
  var columnName: js.UndefOr[String] = js.native
  /**
    * Segments a report by a custom dimension. The report must be scoped to an
    * advertiser or lower, and the custom dimension must already be set up in
    * DoubleClick Search. The custom dimension name, which appears in
    * DoubleClick Search, is case sensitive. If used in a conversion report,
    * returns the value of the specified custom dimension for the given
    * conversion, if set. This column does not segment the conversion report.
    */
  var customDimensionName: js.UndefOr[String] = js.native
  /**
    * Name of a custom metric to include in the report. The report must be
    * scoped to an advertiser or lower, and the custom metric must already be
    * set up in DoubleClick Search. The custom metric name, which appears in
    * DoubleClick Search, is case sensitive.
    */
  var customMetricName: js.UndefOr[String] = js.native
  /**
    * Inclusive day in YYYY-MM-DD format. When provided, this overrides the
    * overall time range of the report for this column only. Must be provided
    * together with startDate.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Synchronous report only. Set to true to group by this column. Defaults to
    * false.
    */
  var groupByColumn: js.UndefOr[Boolean] = js.native
  /**
    * Text used to identify this column in the report output; defaults to
    * columnName or savedColumnName when not specified. This can be used to
    * prevent collisions between DoubleClick Search columns and saved columns
    * with the same name.
    */
  var headerText: js.UndefOr[String] = js.native
  /**
    * The platform that is used to provide data for the custom dimension.
    * Acceptable values are &quot;floodlight&quot;.
    */
  var platformSource: js.UndefOr[String] = js.native
  /**
    * Returns metrics only for a specific type of product activity. Accepted
    * values are:   - &quot;sold&quot;: returns metrics only for products that
    * were sold  - &quot;advertised&quot;: returns metrics only for products
    * that were advertised in a Shopping campaign, and that might or might not
    * have been sold
    */
  var productReportPerspective: js.UndefOr[String] = js.native
  /**
    * Name of a saved column to include in the report. The report must be
    * scoped at advertiser or lower, and this saved column must already be
    * created in the DoubleClick Search UI.
    */
  var savedColumnName: js.UndefOr[String] = js.native
  /**
    * Inclusive date in YYYY-MM-DD format. When provided, this overrides the
    * overall time range of the report for this column only. Must be provided
    * together with endDate.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaReportApiColumnSpec {
  @scala.inline
  def apply(): SchemaReportApiColumnSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportApiColumnSpec]
  }
  @scala.inline
  implicit class SchemaReportApiColumnSpecOps[Self <: SchemaReportApiColumnSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDimensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDimensionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimensionName")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMetricName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetricName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMetricName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMetricName")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformSource")(js.undefined)
        ret
    }
    @scala.inline
    def withProductReportPerspective(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productReportPerspective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductReportPerspective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productReportPerspective")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedColumnName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedColumnName")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
  }
  
}

