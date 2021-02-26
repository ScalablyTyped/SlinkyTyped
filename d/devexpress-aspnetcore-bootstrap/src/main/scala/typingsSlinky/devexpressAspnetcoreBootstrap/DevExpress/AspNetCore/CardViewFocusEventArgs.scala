package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardViewFocusEventArgs extends ProcessingModeEventArgs {
  
  val isChangedOnServer: Boolean = js.native
}
object CardViewFocusEventArgs {
  
  @scala.inline
  def apply(isChangedOnServer: Boolean, processOnServer: Boolean, sender: Control): CardViewFocusEventArgs = {
    val __obj = js.Dynamic.literal(isChangedOnServer = isChangedOnServer.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewFocusEventArgs]
  }
  
  @scala.inline
  implicit class CardViewFocusEventArgsMutableBuilder[Self <: CardViewFocusEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChangedOnServer(value: Boolean): Self = StObject.set(x, "isChangedOnServer", value.asInstanceOf[js.Any])
  }
}
