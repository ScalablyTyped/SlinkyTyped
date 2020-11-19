package typingsSlinky.gapiAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataQuery extends js.Object {
  
  var `30daysAgo`: js.UndefOr[String] = js.native
  
  var dimensions: js.UndefOr[String] = js.native
  
  var `end-date`: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[String] = js.native
  
  var ids: js.UndefOr[String] = js.native
  
  var `include-empty-rows`: js.UndefOr[String] = js.native
  
  var `max-results`: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[String] = js.native
  
  var samplingLevel: js.UndefOr[String] = js.native
  
  var segment: js.UndefOr[String] = js.native
  
  var sort: js.UndefOr[String] = js.native
  
  var `start-date`: js.UndefOr[String] = js.native
  
  var `start-index`: js.UndefOr[String] = js.native
  
  var yesterday: js.UndefOr[String] = js.native
}
object DataQuery {
  
  @scala.inline
  def apply(): DataQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQuery]
  }
  
  @scala.inline
  implicit class DataQueryOps[Self <: DataQuery] (val x: Self) extends AnyVal {
    
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
    def set30daysAgo(value: String): Self = this.set("30daysAgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete30daysAgo: Self = this.set("30daysAgo", js.undefined)
    
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEnd-date`: Self = this.set("end-date", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def `setInclude-empty-rows`(value: String): Self = this.set("include-empty-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteInclude-empty-rows`: Self = this.set("include-empty-rows", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: String): Self = this.set("max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: String): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setSamplingLevel(value: String): Self = this.set("samplingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingLevel: Self = this.set("samplingLevel", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStart-date`: Self = this.set("start-date", js.undefined)
    
    @scala.inline
    def `setStart-index`(value: String): Self = this.set("start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStart-index`: Self = this.set("start-index", js.undefined)
    
    @scala.inline
    def setYesterday(value: String): Self = this.set("yesterday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYesterday: Self = this.set("yesterday", js.undefined)
  }
}
