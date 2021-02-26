package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of segment filters in the `OR` group are combined with the logical
  * OR operator.
  */
@js.native
trait SchemaOrFiltersForSegment extends StObject {
  
  /**
    * List of segment filters to be combined with a `OR` operator.
    */
  var segmentFilterClauses: js.UndefOr[js.Array[SchemaSegmentFilterClause]] = js.native
}
object SchemaOrFiltersForSegment {
  
  @scala.inline
  def apply(): SchemaOrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrFiltersForSegment]
  }
  
  @scala.inline
  implicit class SchemaOrFiltersForSegmentMutableBuilder[Self <: SchemaOrFiltersForSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentFilterClauses(value: js.Array[SchemaSegmentFilterClause]): Self = StObject.set(x, "segmentFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentFilterClausesUndefined: Self = StObject.set(x, "segmentFilterClauses", js.undefined)
    
    @scala.inline
    def setSegmentFilterClausesVarargs(value: SchemaSegmentFilterClause*): Self = StObject.set(x, "segmentFilterClauses", js.Array(value :_*))
  }
}
