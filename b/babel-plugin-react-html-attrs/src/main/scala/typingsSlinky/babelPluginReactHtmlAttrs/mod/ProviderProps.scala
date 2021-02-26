package typingsSlinky.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Context via RenderProps
@js.native
trait ProviderProps[T] extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var value: T = js.native
}
object ProviderProps {
  
  @scala.inline
  def apply[T](value: T): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
  
  @scala.inline
  implicit class ProviderPropsMutableBuilder[Self <: ProviderProps[_], T] (val x: Self with ProviderProps[T]) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
