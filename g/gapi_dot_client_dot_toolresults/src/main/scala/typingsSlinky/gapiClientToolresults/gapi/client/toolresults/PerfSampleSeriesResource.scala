package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientToolresults.anon.Fields
import typingsSlinky.gapiClientToolresults.anon.Filter
import typingsSlinky.gapiClientToolresults.anon.HistoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfSampleSeriesResource extends js.Object {
  var samples: SamplesResource
  /**
    * Creates a PerfSampleSeries.
    *
    * May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step
    * does not exist
    */
  def create(request: Fields): Request[PerfSampleSeries]
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: HistoryId): Request[PerfSampleSeries]
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: Filter): Request[ListPerfSampleSeriesResponse]
}

object PerfSampleSeriesResource {
  @scala.inline
  def apply(
    create: Fields => Request[PerfSampleSeries],
    get: HistoryId => Request[PerfSampleSeries],
    list: Filter => Request[ListPerfSampleSeriesResponse],
    samples: SamplesResource
  ): PerfSampleSeriesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), samples = samples.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfSampleSeriesResource]
  }
}

