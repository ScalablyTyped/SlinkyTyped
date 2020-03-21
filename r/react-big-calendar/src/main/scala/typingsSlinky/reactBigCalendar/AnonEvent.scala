package typingsSlinky.reactBigCalendar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var header: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
}

object AnonEvent {
  @scala.inline
  def apply(
    event: ReactComponentClass[js.Object] | ReactElement = null,
    header: ReactComponentClass[js.Object] | ReactElement = null
  ): AnonEvent = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

