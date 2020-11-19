package typingsSlinky.reactNavigation.anon

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNavigation.mod.NavigationInjectedProps
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnRef[T /* <: ReactComponentClass[P] */, P /* <: NavigationInjectedProps[NavigationParams] */] extends js.Object {
  
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.native
}
object OnRef {
  
  @scala.inline
  def apply[T /* <: ReactComponentClass[P] */, P /* <: NavigationInjectedProps[NavigationParams] */](): OnRef[T, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnRef[T, P]]
  }
  
  @scala.inline
  implicit class OnRefOps[Self <: OnRef[_, _], T /* <: ReactComponentClass[P] */, P /* <: NavigationInjectedProps[NavigationParams] */] (val x: Self with (OnRef[T, P])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnRefRefObject(value: ReactRef[InstanceType[T]]): Self = this.set("onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefFunction1(value: /* instance */ InstanceType[T] | Null => Unit): Self = this.set("onRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRef(value: Ref[InstanceType[T]]): Self = this.set("onRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnRef: Self = this.set("onRef", js.undefined)
    
    @scala.inline
    def setOnRefNull: Self = this.set("onRef", null)
  }
}
