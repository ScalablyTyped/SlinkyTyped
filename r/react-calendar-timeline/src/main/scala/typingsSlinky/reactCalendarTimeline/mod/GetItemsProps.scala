package typingsSlinky.reactCalendarTimeline.mod

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<react-calendar-timeline.react-calendar-timeline.ItemRendererGetItemPropsReturnType, 'key' | 'ref'>> */
trait GetItemsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onContextMenu: js.UndefOr[ReactEventHandler[Element]] = js.undefined
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetItemsProps {
  @scala.inline
  def apply(
    className: String = null,
    onContextMenu: SyntheticEvent[Event_, Element] => scala.Unit = null,
    onDoubleClick: SyntheticMouseEvent[Element] => scala.Unit = null,
    onMouseDown: SyntheticMouseEvent[Element] => scala.Unit = null,
    onMouseUp: SyntheticMouseEvent[Element] => scala.Unit = null,
    onTouchEnd: SyntheticTouchEvent[Element] => scala.Unit = null,
    onTouchStart: SyntheticTouchEvent[Element] => scala.Unit = null,
    style: CSSProperties = null
  ): GetItemsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemsProps]
  }
}

