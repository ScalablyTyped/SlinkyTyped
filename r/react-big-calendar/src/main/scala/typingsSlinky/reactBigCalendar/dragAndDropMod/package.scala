package typingsSlinky.reactBigCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dragAndDropMod {
  type DragAndDropCalendar[TEvent /* <: js.Object */, TResource /* <: js.Object */] = slinky.core.ReactComponentClass[
    (typingsSlinky.reactBigCalendar.mod.CalendarProps[TEvent, TResource]) with typingsSlinky.reactBigCalendar.dragAndDropMod.withDragAndDropProps[TEvent]
  ]
}
