package typingsSlinky.mirrorx.mod

import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedRouterProps[State] extends StObject {
  
  var history: js.UndefOr[History[LocationState]] = js.native
  
  var store: js.UndefOr[js.Any] = js.native
}
object ConnectedRouterProps {
  
  @scala.inline
  def apply[State](): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
  
  @scala.inline
  implicit class ConnectedRouterPropsMutableBuilder[Self <: ConnectedRouterProps[_], State] (val x: Self with ConnectedRouterProps[State]) extends AnyVal {
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
