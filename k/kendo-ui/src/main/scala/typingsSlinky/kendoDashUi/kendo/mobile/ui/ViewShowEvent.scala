package typingsSlinky.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewShowEvent
  extends typingsSlinky.kendoDashUi.kendo.mobile.ui.ViewEvent {
  var view: js.UndefOr[typingsSlinky.kendoDashUi.kendo.mobile.ui.View] = js.undefined
}

object ViewShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typingsSlinky.kendoDashUi.kendo.mobile.ui.View,
    view: typingsSlinky.kendoDashUi.kendo.mobile.ui.View = null
  ): ViewShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewShowEvent]
  }
}

