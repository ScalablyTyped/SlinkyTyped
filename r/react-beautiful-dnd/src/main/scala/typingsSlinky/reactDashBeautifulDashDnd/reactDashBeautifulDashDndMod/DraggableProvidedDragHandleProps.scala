package typingsSlinky.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.reactMod.DragEvent
import typingsSlinky.react.reactMod.DragEventHandler
import typingsSlinky.react.reactMod.KeyboardEventHandler
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProvidedDragHandleProps extends js.Object {
  var `aria-grabbed`: Boolean
  var `aria-roledescription`: String
  var `data-react-beautiful-dnd-drag-handle`: String
  var draggable: Boolean
  var onDragStart: DragEventHandler[_]
  var onKeyDown: KeyboardEventHandler[_]
  var onMouseDown: MouseEventHandler[_]
  var onTouchMove: TouchEventHandler[_]
  var onTouchStart: TouchEventHandler[_]
  var tabIndex: Double
}

object DraggableProvidedDragHandleProps {
  @scala.inline
  def apply(
    `aria-grabbed`: Boolean,
    `aria-roledescription`: String,
    `data-react-beautiful-dnd-drag-handle`: String,
    draggable: Boolean,
    onDragStart: DragEvent[_] => Unit,
    onKeyDown: SyntheticKeyboardEvent[_] => Unit,
    onMouseDown: SyntheticMouseEvent[_] => Unit,
    onTouchMove: SyntheticTouchEvent[_] => Unit,
    onTouchStart: SyntheticTouchEvent[_] => Unit,
    tabIndex: Double
  ): DraggableProvidedDragHandleProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction1(onDragStart), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-react-beautiful-dnd-drag-handle")(`data-react-beautiful-dnd-drag-handle`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProvidedDragHandleProps]
  }
}

