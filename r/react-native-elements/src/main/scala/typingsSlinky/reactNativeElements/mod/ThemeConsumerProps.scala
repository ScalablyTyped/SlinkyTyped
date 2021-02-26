package typingsSlinky.reactNativeElements.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeConsumerProps[T] extends StObject {
  
  def children(props: ThemeProps[T]): ReactElement = js.native
}
object ThemeConsumerProps {
  
  @scala.inline
  def apply[T](children: ThemeProps[T] => ReactElement): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
  
  @scala.inline
  implicit class ThemeConsumerPropsMutableBuilder[Self <: ThemeConsumerProps[_], T] (val x: Self with ThemeConsumerProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ThemeProps[T] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
