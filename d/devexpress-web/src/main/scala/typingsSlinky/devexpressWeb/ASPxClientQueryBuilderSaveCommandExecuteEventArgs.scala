package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientQueryBuilder.SaveCommandExecute event.
  */
@js.native
trait ASPxClientQueryBuilderSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean = js.native
}
object ASPxClientQueryBuilderSaveCommandExecuteEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): ASPxClientQueryBuilderSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientQueryBuilderSaveCommandExecuteEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientQueryBuilderSaveCommandExecuteEventArgsMutableBuilder[Self <: ASPxClientQueryBuilderSaveCommandExecuteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
