package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientToolresults.AnonFields
import typingsSlinky.gapiClientToolresults.AnonFilter
import typingsSlinky.gapiClientToolresults.AnonHistoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerfSampleSeriesResource extends js.Object {
  var samples: SamplesResource = js.native
  /**
    * Creates a PerfSampleSeries.
    *
    * May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step
    * does not exist
    */
  def create(request: AnonFields): Request_[PerfSampleSeries] = js.native
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: AnonHistoryId): Request_[PerfSampleSeries] = js.native
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: AnonFilter): Request_[ListPerfSampleSeriesResponse] = js.native
}

object PerfSampleSeriesResource {
  @scala.inline
  def apply(
    create: AnonFields => Request_[PerfSampleSeries],
    get: AnonHistoryId => Request_[PerfSampleSeries],
    list: AnonFilter => Request_[ListPerfSampleSeriesResponse],
    samples: SamplesResource
  ): PerfSampleSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfSampleSeriesResource]
  }
  @scala.inline
  implicit class PerfSampleSeriesResourceOps[Self <: PerfSampleSeriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: AnonFields => Request_[PerfSampleSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonHistoryId => Request_[PerfSampleSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[ListPerfSampleSeriesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSamples(value: SamplesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samples")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

