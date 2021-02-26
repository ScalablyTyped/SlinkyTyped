package typingsSlinky.reactNavigation.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationInjectedProps
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRef[T /* <: ReactComponentClass[P] */, P /* <: NavigationInjectedProps[NavigationParams] */] extends StObject {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.native
}
object OnRef {
  
  @scala.inline
  def apply[T /* <: ReactComponentClass[P] */, P /* <: NavigationInjectedProps[NavigationParams] */](): OnRef[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRef[T, P]]
  }
  
  @scala.inline
  implicit class OnRefMutableBuilder[Self <: OnRef[_, _], T /* <: ReactComponentClass[P] */, P /* <: NavigationInjectedProps[NavigationParams] */] (val x: Self with (OnRef[T, P])) extends AnyVal {
    
    @scala.inline
    def setOnRef(value: Ref[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(value: /* instance */ InstanceType[T] | Null => Unit): Self = StObject.set(x, "onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRefNull: Self = StObject.set(x, "onRef", null)
    
    @scala.inline
    def setOnRefRefObject(value: ReactRef[InstanceType[T]]): Self = StObject.set(x, "onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefUndefined: Self = StObject.set(x, "onRef", js.undefined)
  }
}
