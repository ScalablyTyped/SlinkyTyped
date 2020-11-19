package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrFiltersForSegment extends js.Object {
  
  /** List of segment filters to be combined with a `OR` operator. */
  var segmentFilterClauses: js.UndefOr[js.Array[SegmentFilterClause]] = js.native
}
object OrFiltersForSegment {
  
  @scala.inline
  def apply(): OrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrFiltersForSegment]
  }
  
  @scala.inline
  implicit class OrFiltersForSegmentOps[Self <: OrFiltersForSegment] (val x: Self) extends AnyVal {
    
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
    def setSegmentFilterClausesVarargs(value: SegmentFilterClause*): Self = this.set("segmentFilterClauses", js.Array(value :_*))
    
    @scala.inline
    def setSegmentFilterClauses(value: js.Array[SegmentFilterClause]): Self = this.set("segmentFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentFilterClauses: Self = this.set("segmentFilterClauses", js.undefined)
  }
}
