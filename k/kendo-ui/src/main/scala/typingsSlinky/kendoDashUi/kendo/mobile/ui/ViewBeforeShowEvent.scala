package typingsSlinky.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewBeforeShowEvent
  extends typingsSlinky.kendoDashUi.kendo.mobile.ui.ViewEvent {
  var view: js.UndefOr[typingsSlinky.kendoDashUi.kendo.mobile.ui.View] = js.undefined
}

object ViewBeforeShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typingsSlinky.kendoDashUi.kendo.mobile.ui.View,
    view: typingsSlinky.kendoDashUi.kendo.mobile.ui.View = null
  ): ViewBeforeShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBeforeShowEvent]
  }
}

