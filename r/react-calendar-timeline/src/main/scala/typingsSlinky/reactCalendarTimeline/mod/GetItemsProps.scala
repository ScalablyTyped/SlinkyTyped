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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<react-calendar-timeline.react-calendar-timeline.ItemRendererGetItemPropsReturnType, 'key' | 'ref'>> */
@js.native
trait GetItemsProps extends StObject {
  
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
  implicit class GetItemsPropsMutableBuilder[Self <: GetItemsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticEvent[Event, Element] => scala.Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[Element] => scala.Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => scala.Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
