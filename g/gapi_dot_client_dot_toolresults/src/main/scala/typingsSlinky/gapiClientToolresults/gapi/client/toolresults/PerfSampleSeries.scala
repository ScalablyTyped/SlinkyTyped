package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfSampleSeries extends js.Object {
  
  /** Basic series represented by a line chart */
  var basicPerfSampleSeries: js.UndefOr[BasicPerfSampleSeries] = js.native
  
  /** A tool results execution ID. */
  var executionId: js.UndefOr[String] = js.native
  
  /** A tool results history ID. */
  var historyId: js.UndefOr[String] = js.native
  
  /** The cloud project */
  var projectId: js.UndefOr[String] = js.native
  
  /** A sample series id */
  var sampleSeriesId: js.UndefOr[String] = js.native
  
  /** A tool results step ID. */
  var stepId: js.UndefOr[String] = js.native
}
object PerfSampleSeries {
  
  @scala.inline
  def apply(): PerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfSampleSeries]
  }
  
  @scala.inline
  implicit class PerfSampleSeriesOps[Self <: PerfSampleSeries] (val x: Self) extends AnyVal {
    
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
    def setBasicPerfSampleSeries(value: BasicPerfSampleSeries): Self = this.set("basicPerfSampleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicPerfSampleSeries: Self = this.set("basicPerfSampleSeries", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setSampleSeriesId(value: String): Self = this.set("sampleSeriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleSeriesId: Self = this.set("sampleSeriesId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
  }
}
