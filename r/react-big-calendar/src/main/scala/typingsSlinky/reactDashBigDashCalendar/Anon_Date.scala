package typingsSlinky.reactDashBigDashCalendar

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
  var event: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
  var time: js.UndefOr[ReactComponentClass[js.Object] | Element] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: ReactComponentClass[js.Object] | Element = null,
    event: ReactComponentClass[js.Object] | Element = null,
    time: ReactComponentClass[js.Object] | Element = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

