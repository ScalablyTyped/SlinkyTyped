package typingsSlinky.reactRedux.mod

import typingsSlinky.redux.mod.Action
import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatchProp[A /* <: Action[_] */] extends js.Object {
  
  var dispatch: Dispatch[A] = js.native
}
object DispatchProp {
  
  @scala.inline
  def apply[A /* <: Action[_] */](dispatch: A => A): DispatchProp[A] = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
    __obj.asInstanceOf[DispatchProp[A]]
  }
  
  @scala.inline
  implicit class DispatchPropOps[Self <: DispatchProp[_], A /* <: Action[_] */] (val x: Self with DispatchProp[A]) extends AnyVal {
    
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
    def setDispatch(value: A => A): Self = this.set("dispatch", js.Any.fromFunction1(value))
  }
}
