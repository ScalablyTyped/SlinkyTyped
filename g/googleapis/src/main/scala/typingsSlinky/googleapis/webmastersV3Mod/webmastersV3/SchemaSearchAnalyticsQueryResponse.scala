package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of rows, one per result, grouped by key. Metrics in each row are
  * aggregated for all data grouped by that key either by page or property, as
  * specified by the aggregation type parameter.
  */
@js.native
trait SchemaSearchAnalyticsQueryResponse extends js.Object {
  /**
    * How the results were aggregated.
    */
  var responseAggregationType: js.UndefOr[String] = js.native
  /**
    * A list of rows grouped by the key values in the order given in the query.
    */
  var rows: js.UndefOr[js.Array[SchemaApiDataRow]] = js.native
}

object SchemaSearchAnalyticsQueryResponse {
  @scala.inline
  def apply(): SchemaSearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAnalyticsQueryResponse]
  }
  @scala.inline
  implicit class SchemaSearchAnalyticsQueryResponseOps[Self <: SchemaSearchAnalyticsQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseAggregationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAggregationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseAggregationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAggregationType")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[SchemaApiDataRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
  }
  
}

