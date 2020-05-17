package typingsSlinky.gapiClientContent.gapi.client.content

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContent.anon.Alt
import typingsSlinky.gapiClientContent.anon.Country
import typingsSlinky.gapiClientContent.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: Alt): Request[DatafeedstatusesCustomBatchResponse] = js.native
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Country): Request[DatafeedStatus] = js.native
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: MaxResults): Request[DatafeedstatusesListResponse] = js.native
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: Alt => Request[DatafeedstatusesCustomBatchResponse],
    get: Country => Request[DatafeedStatus],
    list: MaxResults => Request[DatafeedstatusesListResponse]
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
    def withCustombatch(value: Alt => Request[DatafeedstatusesCustomBatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custombatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Country => Request[DatafeedStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: MaxResults => Request[DatafeedstatusesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

