package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTreeViewEventMap extends ControlEventMap {
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var checkedChanged: TreeViewNodeProcessingModeEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var expandedChanged: TreeViewNodeEventArgs = js.native
  var expandedChanging: TreeViewNodeCancelEventArgs = js.native
  var nodeClick: TreeViewNodeClickEventArgs = js.native
}

object BootstrapTreeViewEventMap {
  @scala.inline
  def apply(
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    checkedChanged: TreeViewNodeProcessingModeEventArgs,
    endCallback: EndCallbackEventArgs,
    expandedChanged: TreeViewNodeEventArgs,
    expandedChanging: TreeViewNodeCancelEventArgs,
    init: EventArgs,
    nodeClick: TreeViewNodeClickEventArgs
  ): BootstrapTreeViewEventMap = {
    val __obj = js.Dynamic.literal(beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], checkedChanged = checkedChanged.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], expandedChanged = expandedChanged.asInstanceOf[js.Any], expandedChanging = expandedChanging.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], nodeClick = nodeClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTreeViewEventMap]
  }
  @scala.inline
  implicit class BootstrapTreeViewEventMapOps[Self <: BootstrapTreeViewEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginCallback(value: BeginCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: CallbackErrorEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedChanged(value: TreeViewNodeProcessingModeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedChanged(value: TreeViewNodeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedChanging(value: TreeViewNodeCancelEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedChanging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeClick(value: TreeViewNodeClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

