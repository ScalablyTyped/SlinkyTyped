package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForecastsResponse extends js.Object {
  /**
    * An array of objects that summarize each forecast's properties.
    */
  var Forecasts: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Forecasts] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListForecastsResponse {
  @scala.inline
  def apply(): ListForecastsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForecastsResponse]
  }
  @scala.inline
  implicit class ListForecastsResponseOps[Self <: ListForecastsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForecasts(value: Forecasts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forecasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecasts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Forecasts")(js.undefined)
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
  }
  
}

