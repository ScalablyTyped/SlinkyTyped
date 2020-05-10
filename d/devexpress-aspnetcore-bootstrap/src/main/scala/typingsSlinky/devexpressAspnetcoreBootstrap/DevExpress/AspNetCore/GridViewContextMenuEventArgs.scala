package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewContextMenuEventArgs extends EventArgs {
  val htmlEvent: js.Any = js.native
  val index: Double = js.native
  val menu: js.Any = js.native
  val objectType: String = js.native
  var showBrowserMenu: Boolean = js.native
}

object GridViewContextMenuEventArgs {
  @scala.inline
  def apply(
    htmlEvent: js.Any,
    index: Double,
    menu: js.Any,
    objectType: String,
    sender: Control,
    showBrowserMenu: Boolean
  ): GridViewContextMenuEventArgs = {
    val __obj = js.Dynamic.literal(htmlEvent = htmlEvent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], showBrowserMenu = showBrowserMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewContextMenuEventArgs]
  }
  @scala.inline
  implicit class GridViewContextMenuEventArgsOps[Self <: GridViewContextMenuEventArgs] (val x: Self) extends AnyVal {
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

