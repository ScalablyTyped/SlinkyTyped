package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientToolresults.AnonHistoryId
import typingsSlinky.gapiClientToolresults.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplesResource extends js.Object {
  /**
    * Creates a batch of PerfSamples - a client can submit multiple batches of Perf Samples through repeated calls to this method in order to split up a
    * large request payload - duplicates and existing timestamp entries will be ignored. - the batch operation may partially succeed - the set of elements
    * successfully inserted is returned in the response (omits items which already existed in the database).
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing PerfSampleSeries does not exist
    */
  def batchCreate(request: AnonHistoryId): Request_[BatchCreatePerfSamplesResponse] = js.native
  /**
    * Lists the Performance Samples of a given Sample Series - The list results are sorted by timestamps ascending - The default page size is 500 samples;
    * and maximum size allowed 5000 - The response token indicates the last returned PerfSample timestamp - When the results size exceeds the page size,
    * submit a subsequent request including the page token to return the rest of the samples up to the page limit
    *
    * May return any of the following canonical error codes: - OUT_OF_RANGE - The specified request page_token is out of valid range - NOT_FOUND - The
    * containing PerfSampleSeries does not exist
    */
  def list(request: AnonKey): Request_[ListPerfSamplesResponse] = js.native
}

object SamplesResource {
  @scala.inline
  def apply(
    batchCreate: AnonHistoryId => Request_[BatchCreatePerfSamplesResponse],
    list: AnonKey => Request_[ListPerfSamplesResponse]
  ): SamplesResource = {
    val __obj = js.Dynamic.literal(batchCreate = js.Any.fromFunction1(batchCreate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SamplesResource]
  }
  @scala.inline
  implicit class SamplesResourceOps[Self <: SamplesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchCreate(value: AnonHistoryId => Request_[BatchCreatePerfSamplesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonKey => Request_[ListPerfSamplesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

