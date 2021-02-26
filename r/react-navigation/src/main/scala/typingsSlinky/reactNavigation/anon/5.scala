package typingsSlinky.reactNavigation.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationFocusInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5`[T, P] extends StObject {
  
  var onRef: js.UndefOr[Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]] = js.native
}
object `5` {
  
  @scala.inline
  def apply[T, P](): `5`[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[T, P]]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`[_, _], T, P] (val x: Self with (`5`[T, P])) extends AnyVal {
    
    @scala.inline
    def setOnRef(value: Ref[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(value: /* instance */ (ReactComponentClass[T with NavigationFocusInjectedProps[P]]) | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    @scala.inline
    def setOnRefRefObject(value: ReactRef[ReactComponentClass[T with NavigationFocusInjectedProps[P]]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
