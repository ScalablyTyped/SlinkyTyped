package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.ContextMenu event.
  */
@js.native
trait ASPxClientGridViewContextMenuEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.ContextMenu event.
    */
  var htmlEvent: js.Any = js.native
  /**
    * Identifies the grid element being right clicked by the user.
    */
  var index: Double = js.native
  /**
    * Gets the currently processed menu object.
    */
  var menu: js.Any = js.native
  /**
    * Gets which grid element has been right clicked by the user.
    */
  var objectType: String = js.native
  /**
    * Specifies whether a browser context menu should be displayed.
    */
  var showBrowserMenu: Boolean = js.native
}

object ASPxClientGridViewContextMenuEventArgs {
  @scala.inline
  def apply(htmlEvent: js.Any, index: Double, menu: js.Any, objectType: String, showBrowserMenu: Boolean): ASPxClientGridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewContextMenuEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridViewContextMenuEventArgsOps[Self <: ASPxClientGridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowBrowserMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBrowserMenu")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

