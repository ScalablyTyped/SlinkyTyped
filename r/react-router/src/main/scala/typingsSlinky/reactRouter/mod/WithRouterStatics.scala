package typingsSlinky.reactRouter.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithRouterStatics[C /* <: ReactComponentClass[_] */] extends js.Object {
  
  var WrappedComponent: C = js.native
}
object WithRouterStatics {
  
  @scala.inline
  def apply[C /* <: ReactComponentClass[_] */](WrappedComponent: C): WithRouterStatics[C] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRouterStatics[C]]
  }
  
  @scala.inline
  implicit class WithRouterStaticsOps[Self <: WithRouterStatics[_], C /* <: ReactComponentClass[_] */] (val x: Self with WithRouterStatics[C]) extends AnyVal {
    
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
