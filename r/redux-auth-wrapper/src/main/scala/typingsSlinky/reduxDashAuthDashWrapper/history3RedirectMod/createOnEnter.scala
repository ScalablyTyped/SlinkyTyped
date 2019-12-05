package typingsSlinky.reduxDashAuthDashWrapper.history3RedirectMod

import typingsSlinky.history.historyMod.LocationDescriptorObject
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.redux.reduxMod.AnyAction
import typingsSlinky.redux.reduxMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", "createOnEnter")
@js.native
object createOnEnter extends js.Object {
  def apply[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[_, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[/* location */ LocationDescriptorObject[LocationState], Unit], 
    Unit
  ] = js.native
}

