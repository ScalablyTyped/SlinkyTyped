package typingsSlinky.awsSdk.forecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryForecastRequest extends js.Object {
  /**
    * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss (ISO 8601 format). For example, 2015-01-01T20:00:00. 
    */
  var EndDate: js.UndefOr[DateTime] = js.native
  /**
    * The filtering criteria to apply when retrieving the forecast. For example, to get the forecast for client_21 in the electricity usage dataset, specify the following:  {"item_id" : "client_21"}  To get the full forecast, use the CreateForecastExportJob operation.
    */
  var Filters: typingsSlinky.awsSdk.forecastqueryserviceMod.Filters = js.native
  /**
    * The Amazon Resource Name (ARN) of the forecast to query.
    */
  var ForecastArn: Arn = js.native
  /**
    * If the result of the previous request was truncated, the response includes a NextToken. To retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.forecastqueryserviceMod.NextToken] = js.native
  /**
    * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss (ISO 8601 format). For example, 2015-01-01T08:00:00.
    */
  var StartDate: js.UndefOr[DateTime] = js.native
}

object QueryForecastRequest {
  @scala.inline
  def apply(Filters: Filters, ForecastArn: Arn): QueryForecastRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryForecastRequest]
  }
  @scala.inline
  implicit class QueryForecastRequestOps[Self <: QueryForecastRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForecastArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
  }
  
}

