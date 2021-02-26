package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventArgs extends StObject {
  
  val sender: Control = js.native
}
object EventArgs {
  
  @scala.inline
  def apply(sender: Control): EventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
  
  @scala.inline
  implicit class EventArgsMutableBuilder[Self <: EventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSender(value: Control): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
