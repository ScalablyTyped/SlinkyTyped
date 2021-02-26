package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFloatingActionButton.ActionItemClick event.
  */
@js.native
trait ASPxClientFloatingActionButtonActionItemClickEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed action.
    */
  var actionName: String = js.native
}
object ASPxClientFloatingActionButtonActionItemClickEventArgs {
  
  @scala.inline
  def apply(actionName: String): ASPxClientFloatingActionButtonActionItemClickEventArgs = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFloatingActionButtonActionItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFloatingActionButtonActionItemClickEventArgsMutableBuilder[Self <: ASPxClientFloatingActionButtonActionItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
  }
}
