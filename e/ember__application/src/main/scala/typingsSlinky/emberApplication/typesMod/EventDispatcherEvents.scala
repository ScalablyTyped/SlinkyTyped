package typingsSlinky.emberApplication.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDispatcherEvents
  extends /* event */ StringDictionary[js.UndefOr[String | Null]] {
  var change: js.UndefOr[String | Null] = js.native
  var click: js.UndefOr[String | Null] = js.native
  var contextmenu: js.UndefOr[String | Null] = js.native
  var dblclick: js.UndefOr[String | Null] = js.native
  var drag: js.UndefOr[String | Null] = js.native
  var dragend: js.UndefOr[String | Null] = js.native
  var dragenter: js.UndefOr[String | Null] = js.native
  var dragleave: js.UndefOr[String | Null] = js.native
  var dragover: js.UndefOr[String | Null] = js.native
  var dragstart: js.UndefOr[String | Null] = js.native
  var drop: js.UndefOr[String | Null] = js.native
  var focusin: js.UndefOr[String | Null] = js.native
  var focusout: js.UndefOr[String | Null] = js.native
  var input: js.UndefOr[String | Null] = js.native
  var keydown: js.UndefOr[String | Null] = js.native
  var keypress: js.UndefOr[String | Null] = js.native
  var keyup: js.UndefOr[String | Null] = js.native
  var mousedown: js.UndefOr[String | Null] = js.native
  var mouseenter: js.UndefOr[String | Null] = js.native
  var mouseleave: js.UndefOr[String | Null] = js.native
  var mousemove: js.UndefOr[String | Null] = js.native
  var mouseup: js.UndefOr[String | Null] = js.native
  var submit: js.UndefOr[String | Null] = js.native
  var touchcancel: js.UndefOr[String | Null] = js.native
  var touchend: js.UndefOr[String | Null] = js.native
  var touchmove: js.UndefOr[String | Null] = js.native
  var touchstart: js.UndefOr[String | Null] = js.native
}

object EventDispatcherEvents {
  @scala.inline
  def apply(): EventDispatcherEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDispatcherEvents]
  }
  @scala.inline
  implicit class EventDispatcherEventsOps[Self <: EventDispatcherEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(null)
        ret
    }
    @scala.inline
    def withClick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withClickNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(null)
        ret
    }
    @scala.inline
    def withContextmenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withContextmenuNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(null)
        ret
    }
    @scala.inline
    def withDblclick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclickNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(null)
        ret
    }
    @scala.inline
    def withDrag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(null)
        ret
    }
    @scala.inline
    def withDragend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(js.undefined)
        ret
    }
    @scala.inline
    def withDragendNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragend")(null)
        ret
    }
    @scala.inline
    def withDragenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withDragenterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragenter")(null)
        ret
    }
    @scala.inline
    def withDragleave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withDragleaveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragleave")(null)
        ret
    }
    @scala.inline
    def withDragover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(js.undefined)
        ret
    }
    @scala.inline
    def withDragoverNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragover")(null)
        ret
    }
    @scala.inline
    def withDragstart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragstartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragstart")(null)
        ret
    }
    @scala.inline
    def withDrop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withDropNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(null)
        ret
    }
    @scala.inline
    def withFocusin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusin")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusin")(null)
        ret
    }
    @scala.inline
    def withFocusout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusout")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusout")(null)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(null)
        ret
    }
    @scala.inline
    def withKeydown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(null)
        ret
    }
    @scala.inline
    def withKeypress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(js.undefined)
        ret
    }
    @scala.inline
    def withKeypressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(null)
        ret
    }
    @scala.inline
    def withKeyup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(null)
        ret
    }
    @scala.inline
    def withMousedown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withMousedownNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousedown")(null)
        ret
    }
    @scala.inline
    def withMouseenter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseenterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseenter")(null)
        ret
    }
    @scala.inline
    def withMouseleave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseleaveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseleave")(null)
        ret
    }
    @scala.inline
    def withMousemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withMousemoveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousemove")(null)
        ret
    }
    @scala.inline
    def withMouseup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseupNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseup")(null)
        ret
    }
    @scala.inline
    def withSubmit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(null)
        ret
    }
    @scala.inline
    def withTouchcancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchcancelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchcancel")(null)
        ret
    }
    @scala.inline
    def withTouchend(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchendNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchend")(null)
        ret
    }
    @scala.inline
    def withTouchmove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchmoveNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchmove")(null)
        ret
    }
    @scala.inline
    def withTouchstart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchstartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchstart")(null)
        ret
    }
  }
  
}

