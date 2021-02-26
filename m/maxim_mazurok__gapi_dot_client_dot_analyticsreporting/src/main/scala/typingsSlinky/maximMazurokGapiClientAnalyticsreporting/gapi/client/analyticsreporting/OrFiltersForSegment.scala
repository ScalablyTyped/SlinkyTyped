package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrFiltersForSegment extends StObject {
  
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
  implicit class OrFiltersForSegmentMutableBuilder[Self <: OrFiltersForSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentFilterClauses(value: js.Array[SegmentFilterClause]): Self = StObject.set(x, "segmentFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentFilterClausesUndefined: Self = StObject.set(x, "segmentFilterClauses", js.undefined)
    
    @scala.inline
    def setSegmentFilterClausesVarargs(value: SegmentFilterClause*): Self = StObject.set(x, "segmentFilterClauses", js.Array(value :_*))
  }
}
