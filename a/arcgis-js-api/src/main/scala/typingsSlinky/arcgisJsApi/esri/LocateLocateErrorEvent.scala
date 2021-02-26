package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocateLocateErrorEvent extends StObject {
  
  var error: Error = js.native
}
object LocateLocateErrorEvent {
  
  @scala.inline
  def apply(error: Error): LocateLocateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateLocateErrorEvent]
  }
  
  @scala.inline
  implicit class LocateLocateErrorEventMutableBuilder[Self <: LocateLocateErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
