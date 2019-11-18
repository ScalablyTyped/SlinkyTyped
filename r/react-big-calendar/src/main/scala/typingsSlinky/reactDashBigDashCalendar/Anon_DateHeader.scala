package typingsSlinky.reactDashBigDashCalendar

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateHeader extends js.Object {
  var dateHeader: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var event: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
  var header: js.UndefOr[ReactComponentClass[js.Object] | ReactElement] = js.undefined
}

object Anon_DateHeader {
  @scala.inline
  def apply(
    dateHeader: ReactComponentClass[js.Object] | ReactElement = null,
    event: ReactComponentClass[js.Object] | ReactElement = null,
    header: ReactComponentClass[js.Object] | ReactElement = null
  ): Anon_DateHeader = {
    val __obj = js.Dynamic.literal()
    if (dateHeader != null) __obj.updateDynamic("dateHeader")(dateHeader.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateHeader]
  }
}

