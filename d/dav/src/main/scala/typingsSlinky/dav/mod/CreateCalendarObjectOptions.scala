package typingsSlinky.dav.mod

import typingsSlinky.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCalendarObjectOptions extends StObject {
  
  /**
    * rfc 5545 VCALENDAR object.
    */
  var data: String = js.native
  
  /**
    * name for the calendar ics file.
    */
  var filename: String = js.native
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}
object CreateCalendarObjectOptions {
  
  @scala.inline
  def apply(data: String, filename: String): CreateCalendarObjectOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCalendarObjectOptions]
  }
  
  @scala.inline
  implicit class CreateCalendarObjectOptionsMutableBuilder[Self <: CreateCalendarObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandbox(value: Sandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setXhr(value: Transport): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
