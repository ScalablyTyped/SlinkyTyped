package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element[T] extends StObject {
  
  var component: js.UndefOr[T] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
}
object Element {
  
  @scala.inline
  def apply[T](): Element[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element[T]]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element[_], T] (val x: Self with Element[T]) extends AnyVal {
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
  }
}
