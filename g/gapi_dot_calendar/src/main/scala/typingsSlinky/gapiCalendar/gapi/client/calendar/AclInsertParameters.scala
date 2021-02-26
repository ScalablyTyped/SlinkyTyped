package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AclInsertParameters extends StObject {
  
  var calendarId: String = js.native
  
  // Acl resource
  var role: AccessRole = js.native
  
  var scope: Value = js.native
}
object AclInsertParameters {
  
  @scala.inline
  def apply(calendarId: String, role: AccessRole, scope: Value): AclInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclInsertParameters]
  }
  
  @scala.inline
  implicit class AclInsertParametersMutableBuilder[Self <: AclInsertParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: AccessRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Value): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
