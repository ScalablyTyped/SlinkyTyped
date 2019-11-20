package typingsSlinky.reactDashBigDashCalendar

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateHeader extends js.Object {
  var dateHeader: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
  var event: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
  var header: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
}

object Anon_DateHeader {
  @scala.inline
  def apply(
    dateHeader: ReactComponentClass[js.Object] | Element = null,
    event: ReactComponentClass[js.Object] | Element = null,
    header: ReactComponentClass[js.Object] | Element = null
  ): Anon_DateHeader = {
    val __obj = js.Dynamic.literal()
    if (dateHeader != null) __obj.updateDynamic("dateHeader")(dateHeader.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateHeader]
  }
}

