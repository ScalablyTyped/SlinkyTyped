package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientGridViewContextMenuItemClickEventArgsOps[Self <: ASPxClientGridViewContextMenuItemClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: ASPxClientMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePostBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePostBack")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

