package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeViewNodeProcessingModeEventArgs extends ProcessingModeEventArgs {
  val node: BootstrapTreeViewNode = js.native
}

object TreeViewNodeProcessingModeEventArgs {
  @scala.inline
  def apply(node: BootstrapTreeViewNode, processOnServer: Boolean, sender: Control): TreeViewNodeProcessingModeEventArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewNodeProcessingModeEventArgs]
  }
  @scala.inline
  implicit class TreeViewNodeProcessingModeEventArgsOps[Self <: TreeViewNodeProcessingModeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: BootstrapTreeViewNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

