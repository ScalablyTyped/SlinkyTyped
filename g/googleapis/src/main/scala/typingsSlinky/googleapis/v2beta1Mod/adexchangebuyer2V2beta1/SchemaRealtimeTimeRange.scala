package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An open-ended realtime time range specified by the start timestamp. For
  * filter sets that specify a realtime time range RTB metrics continue to be
  * aggregated throughout the lifetime of the filter set.
  */
@js.native
trait SchemaRealtimeTimeRange extends StObject {
  
  /**
    * The start timestamp of the real-time RTB metrics aggregation.
    */
  var startTimestamp: js.UndefOr[String] = js.native
}
object SchemaRealtimeTimeRange {
  
  @scala.inline
  def apply(): SchemaRealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRealtimeTimeRange]
  }
  
  @scala.inline
  implicit class SchemaRealtimeTimeRangeMutableBuilder[Self <: SchemaRealtimeTimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTimestamp(value: String): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
  }
}
