package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ToolbarUpdating event.
  */
@js.native
trait ASPxClientFileManagerToolbarUpdatingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the currently active file manager area.
    */
  var activeAreaName: String = js.native
}
object ASPxClientFileManagerToolbarUpdatingEventArgs {
  
  @scala.inline
  def apply(activeAreaName: String): ASPxClientFileManagerToolbarUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(activeAreaName = activeAreaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerToolbarUpdatingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerToolbarUpdatingEventArgsMutableBuilder[Self <: ASPxClientFileManagerToolbarUpdatingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveAreaName(value: String): Self = StObject.set(x, "activeAreaName", value.asInstanceOf[js.Any])
  }
}
