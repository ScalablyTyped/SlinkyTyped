package typingsSlinky.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPredictorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.NextToken] = js.native
  /**
    * An array of objects that summarize each predictor's properties.
    */
  var Predictors: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.Predictors] = js.native
}

object ListPredictorsResponse {
  @scala.inline
  def apply(): ListPredictorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPredictorsResponse]
  }
  @scala.inline
  implicit class ListPredictorsResponseOps[Self <: ListPredictorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPredictors(value: Predictors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predictors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredictors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Predictors")(js.undefined)
        ret
    }
  }
  
}

