package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectionChanged event.
  */
@js.native
trait ASPxClientFileManagerSelectionChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the full name of the file currently being processed.
    */
  var fullName: String = js.native
  
  /**
    * Gets whether the item has been selected.
    */
  var isSelected: Boolean = js.native
  
  /**
    * Gets the file manager item object related to the event.
    */
  var item: ASPxClientFileManagerItem = js.native
  
  /**
    * Gets the name of the currently processed file.
    */
  var name: String = js.native
}
object ASPxClientFileManagerSelectionChangedEventArgs {
  
  @scala.inline
  def apply(fullName: String, isSelected: Boolean, item: ASPxClientFileManagerItem, name: String): ASPxClientFileManagerSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerSelectionChangedEventArgsMutableBuilder[Self <: ASPxClientFileManagerSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientFileManagerItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
