package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootComponentProps extends js.Object {
  var history: History[LocationState]
  var routes: ReactElement
  var store: Store[_, AnyAction]
}

object RootComponentProps {
  @scala.inline
  def apply(history: History[LocationState], routes: ReactElement, store: Store[_, AnyAction]): RootComponentProps = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RootComponentProps]
  }
}

