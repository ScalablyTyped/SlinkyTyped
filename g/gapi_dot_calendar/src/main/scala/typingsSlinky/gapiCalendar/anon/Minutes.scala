package typingsSlinky.gapiCalendar.anon

import typingsSlinky.gapiCalendar.gapi.client.calendar.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Minutes extends StObject {
  
  var method: String = js.native
  
  var minutes: integer = js.native
}
object Minutes {
  
  @scala.inline
  def apply(method: String, minutes: integer): Minutes = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minutes]
  }
  
  @scala.inline
  implicit class MinutesMutableBuilder[Self <: Minutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: integer): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
