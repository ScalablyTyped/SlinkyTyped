package typingsSlinky.reactBigCalendar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateHeader extends js.Object {
  var dateHeader: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var event: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var header: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
}

object AnonDateHeader {
  @scala.inline
  def apply(
    dateHeader: ReactComponentClass[js.Object] | ReactElement = null,
    event: ReactComponentClass[js.Object] | ReactElement = null,
    header: ReactComponentClass[js.Object] | ReactElement = null
  ): AnonDateHeader = {
    val __obj = js.Dynamic.literal()
    if (dateHeader != null) __obj.updateDynamic("dateHeader")(dateHeader.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateHeader]
  }
}

