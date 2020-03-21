package typingsSlinky.reactCalendarTimeline

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.reactCalendarTimeline.mod.Id
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var className: String
  var key: Id
  var onContextMenu: ReactEventHandler[Element]
  var onDoubleClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var ref: Ref[_]
  var style: CSSProperties
}

object AnonKey {
  @scala.inline
  def apply(
    className: String,
    key: Id,
    onContextMenu: SyntheticEvent[Event_, Element] => Unit,
    onDoubleClick: SyntheticMouseEvent[Element] => Unit,
    onMouseDown: SyntheticMouseEvent[Element] => Unit,
    onMouseUp: SyntheticMouseEvent[Element] => Unit,
    onTouchEnd: SyntheticTouchEvent[Element] => Unit,
    onTouchStart: SyntheticTouchEvent[Element] => Unit,
    style: CSSProperties,
    ref: Ref[_] = null
  ): AnonKey = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

