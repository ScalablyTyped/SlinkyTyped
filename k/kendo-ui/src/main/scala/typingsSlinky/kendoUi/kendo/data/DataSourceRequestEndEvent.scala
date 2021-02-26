package typingsSlinky.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRequestEndEvent extends DataSourceEvent {
  
  var response: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object DataSourceRequestEndEvent {
  
  @scala.inline
  def apply(): DataSourceRequestEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRequestEndEvent]
  }
  
  @scala.inline
  implicit class DataSourceRequestEndEventMutableBuilder[Self <: DataSourceRequestEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
