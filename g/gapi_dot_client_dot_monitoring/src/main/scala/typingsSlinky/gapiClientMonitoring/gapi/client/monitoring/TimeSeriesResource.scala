package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientMonitoring.anon.Accesstoken
import typingsSlinky.gapiClientMonitoring.anon.AggregationalignmentPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeSeriesResource extends js.Object {
  /**
    * Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be
    * written, a corresponding failure message is included in the error response.
    */
  def create(request: Accesstoken): Request[js.Object] = js.native
  /** Lists time series that match a filter. This method does not require a Stackdriver account. */
  def list(request: AggregationalignmentPeriod): Request[ListTimeSeriesResponse] = js.native
}

object TimeSeriesResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[js.Object],
    list: AggregationalignmentPeriod => Request[ListTimeSeriesResponse]
  ): TimeSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TimeSeriesResource]
  }
  @scala.inline
  implicit class TimeSeriesResourceOps[Self <: TimeSeriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Accesstoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AggregationalignmentPeriod => Request[ListTimeSeriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

