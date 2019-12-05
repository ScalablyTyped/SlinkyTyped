package typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.MouseEventHandler
import typingsSlinky.react.reactMod.ReactEventHandler
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.react.reactMod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRendererGetItemPropsReturnType extends js.Object {
  var className: String
  var key: Double
  var onContextMenu: ReactEventHandler[Element]
  var onDoubleClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var ref: Ref[_]
  var style: CSSProperties
}

object ItemRendererGetItemPropsReturnType {
  @scala.inline
  def apply(
    className: String,
    key: Double,
    onContextMenu: SyntheticEvent[Event, Element] => scala.Unit,
    onDoubleClick: SyntheticMouseEvent[Element] => scala.Unit,
    onMouseDown: SyntheticMouseEvent[Element] => scala.Unit,
    onMouseUp: SyntheticMouseEvent[Element] => scala.Unit,
    onTouchEnd: SyntheticTouchEvent[Element] => scala.Unit,
    onTouchStart: SyntheticTouchEvent[Element] => scala.Unit,
    style: CSSProperties,
    ref: Ref[_] = null
  ): ItemRendererGetItemPropsReturnType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
}

