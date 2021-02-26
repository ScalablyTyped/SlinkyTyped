package typingsSlinky.iitc.hooksMod.global

import typingsSlinky.iitc.iitctypesMod.IITC.Field
import typingsSlinky.iitc.iitctypesMod.IITC.FieldData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventFieldRemoved extends StObject {
  
  var data: FieldData = js.native
  
  var field: Field = js.native
}
object EventFieldRemoved {
  
  @scala.inline
  def apply(data: FieldData, field: Field): EventFieldRemoved = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFieldRemoved]
  }
  
  @scala.inline
  implicit class EventFieldRemovedMutableBuilder[Self <: EventFieldRemoved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: FieldData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
