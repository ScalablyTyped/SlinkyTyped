package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxTreeList.ToolbarItemClick event.
  */
@js.native
trait ASPxClientTreeListToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem = js.native
  
  /**
    * Gets the toolbar index related to the event.
    */
  var toolbarIndex: Double = js.native
  
  /**
    * Gets the toolbar name.
    */
  var toolbarName: String = js.native
  
  /**
    * Specifies whether a postback or a callback is used to finally process the event on the server side.
    */
  var usePostBack: Boolean = js.native
}
object ASPxClientTreeListToolbarItemClickEventArgs {
  
  @scala.inline
  def apply(
    item: ASPxClientMenuItem,
    processOnServer: Boolean,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): ASPxClientTreeListToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListToolbarItemClickEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListToolbarItemClickEventArgsOps[Self <: ASPxClientTreeListToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: ASPxClientMenuItem): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarIndex(value: Double): Self = this.set("toolbarIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarName(value: String): Self = this.set("toolbarName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePostBack(value: Boolean): Self = this.set("usePostBack", value.asInstanceOf[js.Any])
  }
}
