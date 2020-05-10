package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAnalytics.AnonCustomMetricId
import typingsSlinky.gapiClientAnalytics.AnonPrettyPrint
import typingsSlinky.gapiClientAnalytics.AnonQuotaUser
import typingsSlinky.gapiClientAnalytics.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMetricsResource extends js.Object {
  /** Get a custom metric to which the user has access. */
  def get(request: AnonCustomMetricId): Request_[CustomMetric] = js.native
  /** Create a new custom metric. */
  def insert(request: AnonQuotaUser): Request_[CustomMetric] = js.native
  /** Lists custom metrics to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomMetrics] = js.native
  /** Updates an existing custom metric. This method supports patch semantics. */
  def patch(request: AnonUserIp): Request_[CustomMetric] = js.native
  /** Updates an existing custom metric. */
  def update(request: AnonUserIp): Request_[CustomMetric] = js.native
}

object CustomMetricsResource {
  @scala.inline
  def apply(
    get: AnonCustomMetricId => Request_[CustomMetric],
    insert: AnonQuotaUser => Request_[CustomMetric],
    list: AnonPrettyPrint => Request_[CustomMetrics],
    patch: AnonUserIp => Request_[CustomMetric],
    update: AnonUserIp => Request_[CustomMetric]
  ): CustomMetricsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CustomMetricsResource]
  }
  @scala.inline
  implicit class CustomMetricsResourceOps[Self <: CustomMetricsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonCustomMetricId => Request_[CustomMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[CustomMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPrettyPrint => Request_[CustomMetrics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonUserIp => Request_[CustomMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonUserIp => Request_[CustomMetric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

