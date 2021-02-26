package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusInfo extends StObject {
  
  /**
    * Time when Asterisk was last reloaded.
    */
  var last_reload_time: js.Date = js.native
  
  /**
    * Time when Asterisk was started.
    */
  var startup_time: js.Date = js.native
}
object StatusInfo {
  
  @scala.inline
  def apply(last_reload_time: js.Date, startup_time: js.Date): StatusInfo = {
    val __obj = js.Dynamic.literal(last_reload_time = last_reload_time.asInstanceOf[js.Any], startup_time = startup_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusInfo]
  }
  
  @scala.inline
  implicit class StatusInfoMutableBuilder[Self <: StatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_reload_time(value: js.Date): Self = StObject.set(x, "last_reload_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartup_time(value: js.Date): Self = StObject.set(x, "startup_time", value.asInstanceOf[js.Any])
  }
}
