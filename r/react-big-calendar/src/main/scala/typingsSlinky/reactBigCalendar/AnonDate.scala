package typingsSlinky.reactBigCalendar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var event: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var time: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(
    date: ReactComponentClass[js.Object] | ReactElement = null,
    event: ReactComponentClass[js.Object] | ReactElement = null,
    time: ReactComponentClass[js.Object] | ReactElement = null
  ): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

