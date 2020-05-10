package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContent.AnonAlt
import typingsSlinky.gapiClientContent.AnonCountry
import typingsSlinky.gapiClientContent.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: AnonAlt): Request_[DatafeedstatusesCustomBatchResponse] = js.native
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonCountry): Request_[DatafeedStatus] = js.native
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonMaxResults): Request_[DatafeedstatusesListResponse] = js.native
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: AnonAlt => Request_[DatafeedstatusesCustomBatchResponse],
    get: AnonCountry => Request_[DatafeedStatus],
    list: AnonMaxResults => Request_[DatafeedstatusesListResponse]
  ): DatafeedstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DatafeedstatusesResource]
  }
  @scala.inline
  implicit class DatafeedstatusesResourceOps[Self <: DatafeedstatusesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustombatch(value: AnonAlt => Request_[DatafeedstatusesCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonCountry => Request_[DatafeedStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonMaxResults => Request_[DatafeedstatusesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

