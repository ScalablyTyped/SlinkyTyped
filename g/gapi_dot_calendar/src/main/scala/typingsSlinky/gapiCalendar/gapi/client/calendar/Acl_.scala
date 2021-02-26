package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.anon.Type
import typingsSlinky.gapiCalendar.gapiCalendarStrings.calendarNumbersignaclRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acl_ extends StObject {
  
  var etag: typingsSlinky.gapiCalendar.gapi.client.calendar.etag = js.native
  
  var id: String = js.native
  
  var kind: calendarNumbersignaclRule = js.native
  
  var role: AccessRole = js.native
  
  var scope: Type = js.native
}
object Acl_ {
  
  @scala.inline
  def apply(etag: etag, id: String, kind: calendarNumbersignaclRule, role: AccessRole, scope: Type): Acl_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl_]
  }
  
  @scala.inline
  implicit class Acl_MutableBuilder[Self <: Acl_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: calendarNumbersignaclRule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: AccessRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: Type): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
