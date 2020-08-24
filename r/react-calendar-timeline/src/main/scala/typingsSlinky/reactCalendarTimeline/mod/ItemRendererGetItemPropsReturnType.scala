package typingsSlinky.reactCalendarTimeline.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemRendererGetItemPropsReturnType extends js.Object {
  var className: String = js.native
  var key: Id = js.native
  var onContextMenu: ReactEventHandler[Element] = js.native
  var onDoubleClick: MouseEventHandler[Element] = js.native
  var onMouseDown: MouseEventHandler[Element] = js.native
  var onMouseUp: MouseEventHandler[Element] = js.native
  var onTouchEnd: TouchEventHandler[Element] = js.native
  var onTouchStart: TouchEventHandler[Element] = js.native
  var ref: Ref[_] = js.native
  var style: CSSProperties = js.native
}

object ItemRendererGetItemPropsReturnType {
  @scala.inline
  def apply(
    className: String,
    key: Id,
    onContextMenu: SyntheticEvent[Event, Element] => scala.Unit,
    onDoubleClick: SyntheticMouseEvent[Element] => scala.Unit,
    onMouseDown: SyntheticMouseEvent[Element] => scala.Unit,
    onMouseUp: SyntheticMouseEvent[Element] => scala.Unit,
    onTouchEnd: SyntheticTouchEvent[Element] => scala.Unit,
    onTouchStart: SyntheticTouchEvent[Element] => scala.Unit,
    style: CSSProperties
  ): ItemRendererGetItemPropsReturnType = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetItemPropsReturnType]
  }
  @scala.inline
  implicit class ItemRendererGetItemPropsReturnTypeOps[Self <: ItemRendererGetItemPropsReturnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Id): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnContextMenu(value: SyntheticEvent[Event, Element] => scala.Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[Element] => scala.Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => scala.Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => scala.Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => scala.Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => scala.Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

