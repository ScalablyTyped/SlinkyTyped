package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The report event request.
  */
@js.native
trait SchemaCreateClientEventRequest extends StObject {
  
  /**
    * Required.  Events issued when end user interacts with customer&#39;s
    * application that uses Cloud Talent Solution.
    */
  var clientEvent: js.UndefOr[SchemaClientEvent] = js.native
}
object SchemaCreateClientEventRequest {
  
  @scala.inline
  def apply(): SchemaCreateClientEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClientEventRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateClientEventRequestMutableBuilder[Self <: SchemaCreateClientEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientEvent(value: SchemaClientEvent): Self = StObject.set(x, "clientEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientEventUndefined: Self = StObject.set(x, "clientEvent", js.undefined)
  }
}
