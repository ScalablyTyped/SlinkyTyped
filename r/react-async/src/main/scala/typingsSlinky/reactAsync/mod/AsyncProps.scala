package typingsSlinky.reactAsync.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncProps[T] extends AsyncOptions[T] {
  
  var children: js.UndefOr[AsyncChildren[T]] = js.native
}
object AsyncProps {
  
  @scala.inline
  def apply[T](): AsyncProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncProps[T]]
  }
  
  @scala.inline
  implicit class AsyncPropsMutableBuilder[Self <: AsyncProps[_], T] (val x: Self with AsyncProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: AsyncChildren[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* state */ AsyncState[T, AbstractState[T]] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
