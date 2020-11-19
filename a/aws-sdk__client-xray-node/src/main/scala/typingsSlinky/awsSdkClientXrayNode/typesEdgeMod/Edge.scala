package typingsSlinky.awsSdkClientXrayNode.typesEdgeMod

import typingsSlinky.awsSdkClientXrayNode.typesAliasMod.Alias
import typingsSlinky.awsSdkClientXrayNode.typesEdgeStatisticsMod.EdgeStatistics
import typingsSlinky.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends js.Object {
  
  /**
    * <p>Aliases for the edge.</p>
    */
  var Aliases: js.UndefOr[js.Array[Alias] | js.Iterable[Alias]] = js.native
  
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  var EndTime: js.UndefOr[js.Date | String | Double] = js.native
  
  /**
    * <p>Identifier of the edge. Unique within a service map.</p>
    */
  var ReferenceId: js.UndefOr[Double] = js.native
  
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | js.Iterable[HistogramEntry]] = js.native
  
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  var StartTime: js.UndefOr[js.Date | String | Double] = js.native
  
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
}
object Edge {
  
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: Alias*): Self = this.set("Aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliasesIterable(value: js.Iterable[Alias]): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliases(value: js.Array[Alias] | js.Iterable[Alias]): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    
    @scala.inline
    def setEndTimeDate(value: js.Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date | String | Double): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setReferenceId(value: Double): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceId: Self = this.set("ReferenceId", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setResponseTimeHistogramIterable(value: js.Iterable[HistogramEntry]): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTimeHistogram(value: js.Array[HistogramEntry] | js.Iterable[HistogramEntry]): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setStartTimeDate(value: js.Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Date | String | Double): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setSummaryStatistics(value: EdgeStatistics): Self = this.set("SummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryStatistics: Self = this.set("SummaryStatistics", js.undefined)
  }
}
