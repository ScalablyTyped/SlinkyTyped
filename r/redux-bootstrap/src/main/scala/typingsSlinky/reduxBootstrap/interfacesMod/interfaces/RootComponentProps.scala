package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootComponentProps extends js.Object {
  
  var history: History[LocationState] = js.native
  
  var routes: ReactElement = js.native
  
  var store: Store[_, AnyAction] = js.native
}
object RootComponentProps {
  
  @scala.inline
  def apply(history: History[LocationState], routes: ReactElement, store: Store[_, AnyAction]): RootComponentProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootComponentProps]
  }
  
  @scala.inline
  implicit class RootComponentPropsOps[Self <: RootComponentProps] (val x: Self) extends AnyVal {
    
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: ReactElement): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Store[_, AnyAction]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
}
