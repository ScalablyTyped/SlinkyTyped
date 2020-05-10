package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTabControlEventMap extends ControlEventMap {
  var activeTabChanged: TabControlTabEventArgs = js.native
  var activeTabChanging: TabControlTabCancelEventArgs = js.native
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var tabClick: TabControlTabClickEventArgs = js.native
}

object BootstrapTabControlEventMap {
  @scala.inline
  def apply(
    activeTabChanged: TabControlTabEventArgs,
    activeTabChanging: TabControlTabCancelEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    tabClick: TabControlTabClickEventArgs
  ): BootstrapTabControlEventMap = {
    val __obj = js.Dynamic.literal(activeTabChanged = activeTabChanged.asInstanceOf[js.Any], activeTabChanging = activeTabChanging.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], tabClick = tabClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTabControlEventMap]
  }
  @scala.inline
  implicit class BootstrapTabControlEventMapOps[Self <: BootstrapTabControlEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTabChanged(value: TabControlTabEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTabChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTabChanging(value: TabControlTabCancelEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTabChanging")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabClick(value: TabControlTabClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabClick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

