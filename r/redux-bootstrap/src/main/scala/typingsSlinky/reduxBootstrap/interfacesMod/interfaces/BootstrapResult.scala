package typingsSlinky.reduxBootstrap.interfacesMod.interfaces

import slinky.core.facade.ReactElement
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapResult extends js.Object {
  var history: History[LocationState]
  var output: js.Any
  var root: ReactElement
  var store: Store[_, AnyAction]
}

object BootstrapResult {
  @scala.inline
  def apply(history: History[LocationState], output: js.Any, root: ReactElement, store: Store[_, AnyAction]): BootstrapResult = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapResult]
  }
}

