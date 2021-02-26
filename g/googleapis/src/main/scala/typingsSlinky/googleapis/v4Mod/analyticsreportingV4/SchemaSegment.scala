package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The segment definition, if the report needs to be segmented. A Segment is a
  * subset of the Analytics data. For example, of the entire set of users, one
  * Segment might be users from a particular country or city.
  */
@js.native
trait SchemaSegment extends StObject {
  
  /**
    * A dynamic segment definition in the request.
    */
  var dynamicSegment: js.UndefOr[SchemaDynamicSegment] = js.native
  
  /**
    * The segment ID of a built-in or custom segment, for example `gaid::-3`.
    */
  var segmentId: js.UndefOr[String] = js.native
}
object SchemaSegment {
  
  @scala.inline
  def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  @scala.inline
  implicit class SchemaSegmentMutableBuilder[Self <: SchemaSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicSegment(value: SchemaDynamicSegment): Self = StObject.set(x, "dynamicSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSegmentUndefined: Self = StObject.set(x, "dynamicSegment", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
