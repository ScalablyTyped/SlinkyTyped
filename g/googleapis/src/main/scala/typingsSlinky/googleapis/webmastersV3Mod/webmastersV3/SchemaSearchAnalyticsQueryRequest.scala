package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSearchAnalyticsQueryRequest extends js.Object {
  /**
    * [Optional; Default is &quot;auto&quot;] How data is aggregated. If
    * aggregated by property, all data for the same property is aggregated; if
    * aggregated by page, all data is aggregated by canonical URI. If you
    * filter or group by page, choose AUTO; otherwise you can aggregate either
    * by property or by page, depending on how you want your data calculated;
    * see  the help documentation to learn how data is calculated differently
    * by site versus by page.  Note: If you group or filter by page, you cannot
    * aggregate by property.  If you specify any value other than AUTO, the
    * aggregation type in the result will match the requested type, or if you
    * request an invalid type, you will get an error. The API will never change
    * your aggregation type if the requested type is invalid.
    */
  var aggregationType: js.UndefOr[String] = js.native
  /**
    * [Optional] Zero or more filters to apply to the dimension grouping
    * values; for example, &#39;query contains &quot;buy&quot;&#39; to see only
    * data where the query string contains the substring &quot;buy&quot; (not
    * case-sensitive). You can filter by a dimension without grouping by it.
    */
  var dimensionFilterGroups: js.UndefOr[js.Array[SchemaApiDimensionFilterGroup]] = js.native
  /**
    * [Optional] Zero or more dimensions to group results by. Dimensions are
    * the group-by values in the Search Analytics page. Dimensions are combined
    * to create a unique row key for each row. Results are grouped in the order
    * that you supply these dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Required] End date of the requested date range, in YYYY-MM-DD format, in
    * PST (UTC - 8:00). Must be greater than or equal to the start date. This
    * value is included in the range.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * [Optional; Default is 1000] The maximum number of rows to return. Must be
    * a number from 1 to 5,000 (inclusive).
    */
  var rowLimit: js.UndefOr[Double] = js.native
  /**
    * [Optional; Default is &quot;web&quot;] The search type to filter for.
    */
  var searchType: js.UndefOr[String] = js.native
  /**
    * [Required] Start date of the requested date range, in YYYY-MM-DD format,
    * in PST time (UTC - 8:00). Must be less than or equal to the end date.
    * This value is included in the range.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * [Optional; Default is 0] Zero-based index of the first row in the
    * response. Must be a non-negative number.
    */
  var startRow: js.UndefOr[Double] = js.native
}

object SchemaSearchAnalyticsQueryRequest {
  @scala.inline
  def apply(): SchemaSearchAnalyticsQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAnalyticsQueryRequest]
  }
  @scala.inline
  implicit class SchemaSearchAnalyticsQueryRequestOps[Self <: SchemaSearchAnalyticsQueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationType")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionFilterGroups(value: js.Array[SchemaApiDimensionFilterGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilterGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
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
    def withRowLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchType")(js.undefined)
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
  }
  
}

