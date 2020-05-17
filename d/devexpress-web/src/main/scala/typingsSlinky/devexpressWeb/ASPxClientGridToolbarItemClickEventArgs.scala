package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridBase.ToolbarItemClick event.
  */
@js.native
trait ASPxClientGridToolbarItemClickEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets the clicked menu item
    */
  var item: ASPxClientMenuItem = js.native
  /**
    * Gets the toolbar index.
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

object ASPxClientGridToolbarItemClickEventArgs {
  @scala.inline
  def apply(
    item: ASPxClientMenuItem,
    processOnServer: Boolean,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): ASPxClientGridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridToolbarItemClickEventArgs]
  }
  @scala.inline
  implicit class ASPxClientGridToolbarItemClickEventArgsOps[Self <: ASPxClientGridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: ASPxClientMenuItem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbarName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarName")(value.asInstanceOf[js.Any])
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

