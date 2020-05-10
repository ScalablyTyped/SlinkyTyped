package typingsSlinky.gapiClientLogging.gapi.client.logging

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientLogging.AnonAccesstoken
import typingsSlinky.gapiClientLogging.AnonBearertoken
import typingsSlinky.gapiClientLogging.AnonMetricName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsResource extends js.Object {
  /** Creates a logs-based metric. */
  def create(request: AnonAccesstoken): Request_[LogMetric] = js.native
  /** Deletes a logs-based metric. */
  def delete(request: AnonMetricName): Request_[js.Object] = js.native
  /** Gets a logs-based metric. */
  def get(request: AnonMetricName): Request_[LogMetric] = js.native
  /** Lists logs-based metrics. */
  def list(request: AnonBearertoken): Request_[ListLogMetricsResponse] = js.native
  /** Creates or updates a logs-based metric. */
  def update(request: AnonMetricName): Request_[LogMetric] = js.native
}

object MetricsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[LogMetric],
    delete: AnonMetricName => Request_[js.Object],
    get: AnonMetricName => Request_[LogMetric],
    list: AnonBearertoken => Request_[ListLogMetricsResponse],
    update: AnonMetricName => Request_[LogMetric]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[MetricsResource]
  }
  @scala.inline
  implicit class MetricsResourceOps[Self <: MetricsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAccesstoken => Request_[LogMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonMetricName => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonMetricName => Request_[LogMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListLogMetricsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonMetricName => Request_[LogMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

