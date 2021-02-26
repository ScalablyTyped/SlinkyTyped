package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client events  concerned with column processing, and that allow the event's processing to be passed to the server side.
  */
@js.native
trait ASPxClientGridViewColumnProcessingModeEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets a grid column related to the event.
    */
  var column: ASPxClientGridViewColumn = js.native
}
object ASPxClientGridViewColumnProcessingModeEventArgs {
  
  @scala.inline
  def apply(column: ASPxClientGridViewColumn, processOnServer: Boolean): ASPxClientGridViewColumnProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumnProcessingModeEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewColumnProcessingModeEventArgsMutableBuilder[Self <: ASPxClientGridViewColumnProcessingModeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ASPxClientGridViewColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
