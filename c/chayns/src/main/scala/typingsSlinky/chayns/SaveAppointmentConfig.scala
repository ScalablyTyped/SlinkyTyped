package typingsSlinky.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media Functions
  * Miscellaneous
  * chayns
  * interfaces
  */
// chayns.saveAppointment()
@js.native
trait SaveAppointmentConfig extends StObject {
  
  var description: String = js.native
  
  var end: js.Date = js.native
  
  var location: String = js.native
  
  var name: String = js.native
  
  var start: js.Date = js.native
}
object SaveAppointmentConfig {
  
  @scala.inline
  def apply(description: String, end: js.Date, location: String, name: String, start: js.Date): SaveAppointmentConfig = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveAppointmentConfig]
  }
  
  @scala.inline
  implicit class SaveAppointmentConfigMutableBuilder[Self <: SaveAppointmentConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
