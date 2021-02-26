package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.events.event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReachedRight[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var event: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.events.event] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var reachedBottom: js.UndefOr[Boolean] = js.native
  
  var reachedLeft: js.UndefOr[Boolean] = js.native
  
  var reachedRight: js.UndefOr[Boolean] = js.native
  
  var reachedTop: js.UndefOr[Boolean] = js.native
  
  var scrollOffset: js.UndefOr[js.Any] = js.native
}
object ReachedRight {
  
  @scala.inline
  def apply[T](): ReachedRight[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachedRight[T]]
  }
  
  @scala.inline
  implicit class ReachedRightMutableBuilder[Self <: ReachedRight[_], T] (val x: Self with ReachedRight[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setReachedBottom(value: Boolean): Self = StObject.set(x, "reachedBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedBottomUndefined: Self = StObject.set(x, "reachedBottom", js.undefined)
    
    @scala.inline
    def setReachedLeft(value: Boolean): Self = StObject.set(x, "reachedLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedLeftUndefined: Self = StObject.set(x, "reachedLeft", js.undefined)
    
    @scala.inline
    def setReachedRight(value: Boolean): Self = StObject.set(x, "reachedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedRightUndefined: Self = StObject.set(x, "reachedRight", js.undefined)
    
    @scala.inline
    def setReachedTop(value: Boolean): Self = StObject.set(x, "reachedTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachedTopUndefined: Self = StObject.set(x, "reachedTop", js.undefined)
    
    @scala.inline
    def setScrollOffset(value: js.Any): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
  }
}
