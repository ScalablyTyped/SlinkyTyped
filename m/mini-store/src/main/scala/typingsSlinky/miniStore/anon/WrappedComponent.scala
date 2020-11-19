package typingsSlinky.miniStore.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedComponent[C /* <: ReactComponentClass[_] */] extends js.Object {
  
  var WrappedComponent: C = js.native
}
object WrappedComponent {
  
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](WrappedComponent: C): WrappedComponent[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponent[C]]
  }
  
  @scala.inline
  implicit class WrappedComponentOps[Self <: WrappedComponent[_], C /* <: ReactComponentClass[_] */] (val x: Self with WrappedComponent[C]) extends AnyVal {
    
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
    def setWrappedComponent(value: C): Self = this.set("WrappedComponent", value.asInstanceOf[js.Any])
  }
}
