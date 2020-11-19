package typingsSlinky.reduxAuthWrapper.redirectMod

import typingsSlinky.history.mod.LocationDescriptorObject
import typingsSlinky.history.mod.LocationState
import typingsSlinky.redux.mod.AnyAction
import typingsSlinky.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
