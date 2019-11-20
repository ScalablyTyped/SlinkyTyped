package typingsSlinky.reactDashBigDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAddonsDragAndDropMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.CalendarProps

  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = ReactComponentClass[(CalendarProps[TEvent, TResource]) with withDragAndDropProps[TEvent]]
}
