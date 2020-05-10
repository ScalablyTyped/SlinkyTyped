package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridToolbarItemClickEventArgs extends ProcessingModeEventArgs {
  val item: BootstrapMenuItem = js.native
  val toolbarIndex: Double = js.native
  val toolbarName: String = js.native
  var usePostBack: Boolean = js.native
}

object GridToolbarItemClickEventArgs {
  @scala.inline
  def apply(
    item: BootstrapMenuItem,
    processOnServer: Boolean,
    sender: Control,
    toolbarIndex: Double,
    toolbarName: String,
    usePostBack: Boolean
  ): GridToolbarItemClickEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], toolbarIndex = toolbarIndex.asInstanceOf[js.Any], toolbarName = toolbarName.asInstanceOf[js.Any], usePostBack = usePostBack.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridToolbarItemClickEventArgs]
  }
  @scala.inline
  implicit class GridToolbarItemClickEventArgsOps[Self <: GridToolbarItemClickEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: BootstrapMenuItem): Self = {
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

