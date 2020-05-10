package typingsSlinky.gapiClientCloudmonitoring.gapi.client.cloudmonitoring

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudmonitoring.AnonAlt
import typingsSlinky.gapiClientCloudmonitoring.AnonCount
import typingsSlinky.gapiClientCloudmonitoring.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDescriptorsResource extends js.Object {
  /** Create a new metric. */
  def create(request: AnonAlt): Request_[MetricDescriptor] = js.native
  /** Delete an existing metric. */
  def delete(request: AnonFields): Request_[DeleteMetricDescriptorResponse] = js.native
  /**
    * List metric descriptors that match the query. If the query is not set, then all of the metric descriptors will be returned. Large responses will be
    * paginated, use the nextPageToken returned in the response to request subsequent pages of results by setting the pageToken query parameter to the value
    * of the nextPageToken.
    */
  def list(request: AnonCount): Request_[ListMetricDescriptorsResponse] = js.native
}

object MetricDescriptorsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[MetricDescriptor],
    delete: AnonFields => Request_[DeleteMetricDescriptorResponse],
    list: AnonCount => Request_[ListMetricDescriptorsResponse]
  ): MetricDescriptorsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MetricDescriptorsResource]
  }
  @scala.inline
  implicit class MetricDescriptorsResourceOps[Self <: MetricDescriptorsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonAlt => Request_[MetricDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonFields => Request_[DeleteMetricDescriptorResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCount => Request_[ListMetricDescriptorsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

