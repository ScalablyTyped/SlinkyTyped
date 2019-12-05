package typingsSlinky.reduxDashBootstrap

import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import typingsSlinky.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfaces.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-bootstrap/dts/containers/root", JSImport.Namespace)
@js.native
object dtsContainersRootMod extends js.Object {
  def default(store: Store[_, AnyAction], history: History[LocationState], routes: Element): Element = js.native
  def default(
    store: Store[_, AnyAction],
    history: History[LocationState],
    routes: Element,
    routerProps: RouterProps
  ): Element = js.native
}

