package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStatisticsRequest extends js.Object {
  /**
    * The aggregation field name.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  /**
    * The name of the index to search. The default value is AWS_Things.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your AWS account.
    */
  var queryString: QueryString = js.native
  /**
    * The version of the query used to search.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}

object GetStatisticsRequest {
  @scala.inline
  def apply(queryString: QueryString): GetStatisticsRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatisticsRequest]
  }
  @scala.inline
  implicit class GetStatisticsRequestOps[Self <: GetStatisticsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryString(value: QueryString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregationField(value: AggregationField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationField")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexName")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryVersion(value: QueryVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVersion")(js.undefined)
        ret
    }
  }
  
}

