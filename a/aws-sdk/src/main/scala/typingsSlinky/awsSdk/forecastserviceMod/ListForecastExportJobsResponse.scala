package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListForecastExportJobsResponse extends js.Object {
  /**
    * An array of objects that summarize each export job's properties.
    */
  var ForecastExportJobs: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.ForecastExportJobs] = js.native
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.NextToken] = js.native
}

object ListForecastExportJobsResponse {
  @scala.inline
  def apply(): ListForecastExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListForecastExportJobsResponse]
  }
  @scala.inline
  implicit class ListForecastExportJobsResponseOps[Self <: ListForecastExportJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForecastExportJobs(value: ForecastExportJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForecastExportJobs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForecastExportJobs")(js.undefined)
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

