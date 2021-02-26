package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events which concern manipulations on tabs.
  */
@js.native
trait ASPxClientTabControlTabEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the tab object related to the event.
    */
  var tab: ASPxClientTab = js.native
}
object ASPxClientTabControlTabEventArgs {
  
  @scala.inline
  def apply(tab: ASPxClientTab): ASPxClientTabControlTabEventArgs = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTabControlTabEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTabControlTabEventArgsMutableBuilder[Self <: ASPxClientTabControlTabEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: ASPxClientTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
