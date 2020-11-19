package typingsSlinky.reduxBootstrap

import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import typingsSlinky.reduxBootstrap.interfacesMod.interfaces.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
@js.native
object rootMod extends js.Object {
  
  def default(store: Store[_, AnyAction], history: History[LocationState], routes: ReactElement): ReactElement = js.native
  def default(
    store: Store[_, AnyAction],
    history: History[LocationState],
    routes: ReactElement,
    routerProps: RouterProps
  ): ReactElement = js.native
}
