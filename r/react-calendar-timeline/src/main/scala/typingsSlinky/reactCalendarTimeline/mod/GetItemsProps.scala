package typingsSlinky.reactCalendarTimeline.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<react-calendar-timeline.react-calendar-timeline.ItemRendererGetItemPropsReturnType, 'key' | 'ref'>> */
@js.native
trait GetItemsProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var onContextMenu: js.UndefOr[ReactEventHandler[Element]] = js.native
  
  var onDoubleClick: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object GetItemsProps {
  
  @scala.inline
  def apply(): GetItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemsProps]
  }
  
  @scala.inline
  implicit class GetItemsPropsOps[Self <: GetItemsProps] (val x: Self) extends AnyVal {
    
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
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticEvent[Event, Element] => scala.Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[Element] => scala.Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => scala.Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => scala.Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => scala.Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => scala.Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
