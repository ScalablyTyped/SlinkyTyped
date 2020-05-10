package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSampledRequestsResponse extends js.Object {
  /**
    * The total number of requests from which GetSampledRequests got a sample of MaxItems requests. If PopulationSize is less than MaxItems, the sample includes every request that your AWS resource received during the specified time range.
    */
  var PopulationSize: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.PopulationSize] = js.native
  /**
    * A complex type that contains detailed information about each of the requests in the sample.
    */
  var SampledRequests: js.UndefOr[SampledHTTPRequests] = js.native
  /**
    * Usually, TimeWindow is the time range that you specified in the GetSampledRequests request. However, if your AWS resource received more than 5,000 requests during the time range that you specified in the request, GetSampledRequests returns the time range for the first 5,000 requests.
    */
  var TimeWindow: js.UndefOr[typingsSlinky.awsSdk.wafregionalMod.TimeWindow] = js.native
}

object GetSampledRequestsResponse {
  @scala.inline
  def apply(): GetSampledRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSampledRequestsResponse]
  }
  @scala.inline
  implicit class GetSampledRequestsResponseOps[Self <: GetSampledRequestsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopulationSize(value: PopulationSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulationSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulationSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulationSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSampledRequests(value: SampledHTTPRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampledRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampledRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampledRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeWindow(value: TimeWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeWindow")(js.undefined)
        ret
    }
  }
  
}

