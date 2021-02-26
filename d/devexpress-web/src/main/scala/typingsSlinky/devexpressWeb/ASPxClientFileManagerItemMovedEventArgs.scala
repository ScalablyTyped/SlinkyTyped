package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemMoved event.
  */
@js.native
trait ASPxClientFileManagerItemMovedEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  
  /**
    * Gets the full name of the folder from which an item is moved.
    */
  var oldFolderFullName: String = js.native
}
object ASPxClientFileManagerItemMovedEventArgs {
  
  @scala.inline
  def apply(fullName: String, isFolder: Boolean, name: String, oldFolderFullName: String): ASPxClientFileManagerItemMovedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oldFolderFullName = oldFolderFullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemMovedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerItemMovedEventArgsMutableBuilder[Self <: ASPxClientFileManagerItemMovedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldFolderFullName(value: String): Self = StObject.set(x, "oldFolderFullName", value.asInstanceOf[js.Any])
  }
}
