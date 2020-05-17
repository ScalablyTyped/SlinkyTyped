package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.ContextMenu event.
  */
@js.native
trait ASPxClientTreeListContextMenuEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether to invoke the browser's context menu.
    */
  var cancel: Boolean = js.native
  /**
    * Gets a DHTML event object that relates to the processed event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Gets a value that identifies the right-clicked object.
    */
  var objectKey: js.Any = js.native
  /**
    * Identifies which tree list element has been right-clicked.
    */
  var objectType: String = js.native
}

object ASPxClientTreeListContextMenuEventArgs {
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, objectKey: js.Any, objectType: String): ASPxClientTreeListContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListContextMenuEventArgs]
  }
  @scala.inline
  implicit class ASPxClientTreeListContextMenuEventArgsOps[Self <: ASPxClientTreeListContextMenuEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

