package typingsSlinky.reactBootstrapTableNext.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  onClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onDoubleClick :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseEnter :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onMouseLeave :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>,   onContextMenu :react-bootstrap-table-next.react-bootstrap-table-next.RowEventHandler<T>}> */
@js.native
trait RowEventHandlerProps[T] extends StObject {
  
  var onClick: js.UndefOr[RowEventHandler[T]] = js.native
  
  var onContextMenu: js.UndefOr[RowEventHandler[T]] = js.native
  
  var onDoubleClick: js.UndefOr[RowEventHandler[T]] = js.native
  
  var onMouseEnter: js.UndefOr[RowEventHandler[T]] = js.native
  
  var onMouseLeave: js.UndefOr[RowEventHandler[T]] = js.native
}
object RowEventHandlerProps {
  
  @scala.inline
  def apply[T](): RowEventHandlerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowEventHandlerProps[T]]
  }
  
  @scala.inline
  implicit class RowEventHandlerPropsMutableBuilder[Self <: RowEventHandlerProps[_], T] (val x: Self with RowEventHandlerProps[T]) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: (/* e */ SyntheticEvent[Event, Element], T, /* rowIndex */ Double) => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
  }
}
