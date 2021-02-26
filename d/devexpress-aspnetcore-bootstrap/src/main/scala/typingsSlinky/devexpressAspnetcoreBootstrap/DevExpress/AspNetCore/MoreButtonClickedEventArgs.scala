package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoreButtonClickedEventArgs extends ProcessingModeEventArgs {
  
  var handled: Boolean = js.native
  
  val interval: BootstrapTimeInterval = js.native
  
  val resource: String = js.native
  
  val targetDateTime: js.Date = js.native
}
object MoreButtonClickedEventArgs {
  
  @scala.inline
  def apply(
    handled: Boolean,
    interval: BootstrapTimeInterval,
    processOnServer: Boolean,
    resource: String,
    sender: Control,
    targetDateTime: js.Date
  ): MoreButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], targetDateTime = targetDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreButtonClickedEventArgs]
  }
  
  @scala.inline
  implicit class MoreButtonClickedEventArgsMutableBuilder[Self <: MoreButtonClickedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: BootstrapTimeInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetDateTime(value: js.Date): Self = StObject.set(x, "targetDateTime", value.asInstanceOf[js.Any])
  }
}
