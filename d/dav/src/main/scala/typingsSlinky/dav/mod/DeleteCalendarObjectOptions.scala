package typingsSlinky.dav.mod

import typingsSlinky.dav.mod.transport.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCalendarObjectOptions extends StObject {
  
  /**
    * request sandbox.
    */
  var sandbox: js.UndefOr[Sandbox] = js.native
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}
object DeleteCalendarObjectOptions {
  
  @scala.inline
  def apply(): DeleteCalendarObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCalendarObjectOptions]
  }
  
  @scala.inline
  implicit class DeleteCalendarObjectOptionsMutableBuilder[Self <: DeleteCalendarObjectOptions] (val x: Self) extends AnyVal {
    
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
