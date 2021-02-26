package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectedProps[T] extends StObject {
  
  var children: js.UndefOr[RejectedChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
}
object RejectedProps {
  
  @scala.inline
  def apply[T](): RejectedProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectedProps[T]]
  }
  
  @scala.inline
  implicit class RejectedPropsMutableBuilder[Self <: RejectedProps[_], T] (val x: Self with RejectedProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: RejectedChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction2(value: (/* error */ js.Error, /* state */ AsyncRejected[T, AbstractState[T]]) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
  }
}
