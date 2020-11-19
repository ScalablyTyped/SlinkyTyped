package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientToolresults.anon.Fields
import typingsSlinky.gapiClientToolresults.anon.Filter
import typingsSlinky.gapiClientToolresults.anon.HistoryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfSampleSeriesResource extends js.Object {
  
  /**
    * Creates a PerfSampleSeries.
    *
    * May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step
    * does not exist
    */
  def create(request: Fields): Request[PerfSampleSeries] = js.native
  
  /**
    * Gets a PerfSampleSeries.
    *
    * May return any of the following error code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    */
  def get(request: HistoryId): Request[PerfSampleSeries] = js.native
  
  /**
    * Lists PerfSampleSeries for a given Step.
    *
    * The request provides an optional filter which specifies one or more PerfMetricsType to include in the result; if none returns all. The resulting
    * PerfSampleSeries are sorted by ids.
    *
    * May return any of the following canonical error codes: - NOT_FOUND - The containing Step does not exist
    */
  def list(request: Filter): Request[ListPerfSampleSeriesResponse] = js.native
  
  var samples: SamplesResource = js.native
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
  
  @scala.inline
  implicit class PerfSampleSeriesResourceOps[Self <: PerfSampleSeriesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: Fields => Request[PerfSampleSeries]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: HistoryId => Request[PerfSampleSeries]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Filter => Request[ListPerfSampleSeriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSamples(value: SamplesResource): Self = this.set("samples", value.asInstanceOf[js.Any])
  }
}
