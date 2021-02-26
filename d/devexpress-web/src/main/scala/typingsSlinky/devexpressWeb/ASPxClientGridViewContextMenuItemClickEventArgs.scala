package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.ContextMenuItemClick event.
  */
@js.native
trait ASPxClientGridViewContextMenuItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Returns the processed element index.
    */
  var elementIndex: Double = js.native
  
  /**
    * Specifies whether default context menu item click is handled manually, so no default processing is required.
    */
  var handled: Boolean = js.native
  
  /**
    * Gets the clicked context menu item.
    */
  var item: ASPxClientMenuItem = js.native
  
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String = js.native
  
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean = js.native
}
object ASPxClientGridViewContextMenuItemClickEventArgs {
  
  @scala.inline
  def apply(
    elementIndex: Double,
    handled: Boolean,
    item: ASPxClientMenuItem,
    objectType: String,
    processOnServer: Boolean,
    usePostBack: Boolean
  ): ASPxClientGridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientGridViewContextMenuItemClickEventArgsMutableBuilder[Self <: ASPxClientGridViewContextMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementIndex(value: Double): Self = StObject.set(x, "elementIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePostBack(value: Boolean): Self = StObject.set(x, "usePostBack", value.asInstanceOf[js.Any])
  }
}
