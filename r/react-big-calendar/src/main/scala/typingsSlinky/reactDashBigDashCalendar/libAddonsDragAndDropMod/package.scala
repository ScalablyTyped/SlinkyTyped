package typingsSlinky.reactDashBigDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAddonsDragAndDropMod {
  import typingsSlinky.react.reactMod.Component
  import typingsSlinky.reactDashBigDashCalendar.reactDashBigDashCalendarMod.CalendarProps

  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = Component[
    (CalendarProps[TEvent, TResource]) with withDragAndDropProps[TEvent], 
    js.Object, 
    js.Any
  ]
}
