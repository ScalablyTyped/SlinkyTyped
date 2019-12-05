package typingsSlinky.reactDashDndDashTouchDashBackend.libInterfacesMod

import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.contextmenu
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.keydown
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.mousedown
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.mousemove
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.mouseup
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.touchend
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.touchmove
import typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventName extends js.Object {
  var contextmenu: js.UndefOr[
    typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.contextmenu
  ] = js.undefined
  var end: js.UndefOr[mouseup | touchend] = js.undefined
  var keydown: js.UndefOr[
    typingsSlinky.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendStrings.keydown
  ] = js.undefined
  var move: js.UndefOr[mousemove | touchmove] = js.undefined
  var start: js.UndefOr[mousedown | touchstart] = js.undefined
}

object EventName {
  @scala.inline
  def apply(
    contextmenu: contextmenu = null,
    end: mouseup | touchend = null,
    keydown: keydown = null,
    move: mousemove | touchmove = null,
    start: mousedown | touchstart = null
  ): EventName = {
    val __obj = js.Dynamic.literal()
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (keydown != null) __obj.updateDynamic("keydown")(keydown.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
}

