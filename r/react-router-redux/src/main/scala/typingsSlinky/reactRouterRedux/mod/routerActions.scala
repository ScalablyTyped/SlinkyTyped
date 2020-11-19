package typingsSlinky.reactRouterRedux.mod

import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-redux", "routerActions")
@js.native
object routerActions extends js.Object {
  
  var go: js.Function1[/* n */ Double, RouterAction] = js.native
  
  var goBack: js.Function0[RouterAction] = js.native
  
  var goForward: js.Function0[RouterAction] = js.native
  
  var push: js.Function2[
    /* location */ LocationDescriptor[LocationState], 
    /* state */ js.UndefOr[LocationState], 
    RouterAction
  ] = js.native
  
  var replace: js.Function2[
    /* location */ LocationDescriptor[LocationState], 
    /* state */ js.UndefOr[LocationState], 
    RouterAction
  ] = js.native
}
