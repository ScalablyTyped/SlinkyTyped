package typingsSlinky.iitc.hooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventRequestFinished extends StObject {
  
  var success: Boolean = js.native
}
object EventRequestFinished {
  
  @scala.inline
  def apply(success: Boolean): EventRequestFinished = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRequestFinished]
  }
  
  @scala.inline
  implicit class EventRequestFinishedMutableBuilder[Self <: EventRequestFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
