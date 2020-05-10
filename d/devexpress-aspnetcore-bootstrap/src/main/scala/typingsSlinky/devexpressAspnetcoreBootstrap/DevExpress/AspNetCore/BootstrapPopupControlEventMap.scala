package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapPopupControlEventMap extends ControlEventMap {
  var afterResizing: PopupWindowEventArgs = js.native
  var beforeResizing: PopupWindowEventArgs = js.native
  var beginCallback: BeginCallbackEventArgs = js.native
  var callbackError: CallbackErrorEventArgs = js.native
  var closeUp: PopupWindowCloseUpEventArgs = js.native
  var closing: PopupWindowCancelEventArgs = js.native
  var endCallback: EndCallbackEventArgs = js.native
  var pinnedChanged: PopupWindowPinnedChangedEventArgs = js.native
  var popUp: PopupWindowEventArgs = js.native
  var resize: PopupWindowResizeEventArgs = js.native
  var shown: PopupWindowEventArgs = js.native
}

object BootstrapPopupControlEventMap {
  @scala.inline
  def apply(
    afterResizing: PopupWindowEventArgs,
    beforeResizing: PopupWindowEventArgs,
    beginCallback: BeginCallbackEventArgs,
    callbackError: CallbackErrorEventArgs,
    closeUp: PopupWindowCloseUpEventArgs,
    closing: PopupWindowCancelEventArgs,
    endCallback: EndCallbackEventArgs,
    init: EventArgs,
    pinnedChanged: PopupWindowPinnedChangedEventArgs,
    popUp: PopupWindowEventArgs,
    resize: PopupWindowResizeEventArgs,
    shown: PopupWindowEventArgs
  ): BootstrapPopupControlEventMap = {
    val __obj = js.Dynamic.literal(afterResizing = afterResizing.asInstanceOf[js.Any], beforeResizing = beforeResizing.asInstanceOf[js.Any], beginCallback = beginCallback.asInstanceOf[js.Any], callbackError = callbackError.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], endCallback = endCallback.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], pinnedChanged = pinnedChanged.asInstanceOf[js.Any], popUp = popUp.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapPopupControlEventMap]
  }
  @scala.inline
  implicit class BootstrapPopupControlEventMapOps[Self <: BootstrapPopupControlEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterResizing(value: PopupWindowEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterResizing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeResizing(value: PopupWindowEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeResizing")(value.asInstanceOf[js.Any])
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
    def withCloseUp(value: PopupWindowCloseUpEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosing(value: PopupWindowCancelEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCallback(value: EndCallbackEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinnedChanged(value: PopupWindowPinnedChangedEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnedChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopUp(value: PopupWindowEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: PopupWindowResizeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShown(value: PopupWindowEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

