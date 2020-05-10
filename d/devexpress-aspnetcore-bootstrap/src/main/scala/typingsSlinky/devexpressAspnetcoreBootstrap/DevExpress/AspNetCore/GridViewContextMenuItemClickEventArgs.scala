package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridViewContextMenuItemClickEventArgs extends ProcessingModeEventArgs {
  val elementIndex: Double = js.native
  var handled: Boolean = js.native
  val item: BootstrapMenuItem = js.native
  val objectType: String = js.native
  var usePostBack: Boolean = js.native
}

object GridViewContextMenuItemClickEventArgs {
  @scala.inline
  def apply(
    elementIndex: Double,
    handled: Boolean,
    item: BootstrapMenuItem,
    objectType: String,
    processOnServer: Boolean,
    sender: Control,
    usePostBack: Boolean
  ): GridViewContextMenuItemClickEventArgs = {
    val __obj = js.Dynamic.literal(elementIndex = elementIndex.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewContextMenuItemClickEventArgs]
  }
  @scala.inline
  implicit class GridViewContextMenuItemClickEventArgsOps[Self <: GridViewContextMenuItemClickEventArgs] (val x: Self) extends AnyVal {
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
    def withItem(value: BootstrapMenuItem): Self = {
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

