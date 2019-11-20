package typingsSlinky.reactDashBigDashCalendar

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
  var header: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
}

object Anon_Event {
  @scala.inline
  def apply(
    event: ReactComponentClass[js.Object] | Element = null,
    header: ReactComponentClass[js.Object] | Element = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Event]
  }
}

