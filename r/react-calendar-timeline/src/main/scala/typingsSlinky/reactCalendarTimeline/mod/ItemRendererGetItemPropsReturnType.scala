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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemRendererGetItemPropsReturnType extends StObject {
  
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
  implicit class ItemRendererGetItemPropsReturnTypeMutableBuilder[Self <: ItemRendererGetItemPropsReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextMenu(value: SyntheticEvent[Event, Element] => scala.Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClick(value: SyntheticMouseEvent[Element] => scala.Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => scala.Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => scala.Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => scala.Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
