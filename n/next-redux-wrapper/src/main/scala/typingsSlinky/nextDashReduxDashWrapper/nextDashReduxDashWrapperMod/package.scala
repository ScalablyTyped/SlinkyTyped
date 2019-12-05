package typingsSlinky.nextDashReduxDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextDashReduxDashWrapperMod {
  import typingsSlinky.redux.reduxMod.AnyAction
  import typingsSlinky.redux.reduxMod.Store

  type MakeStore = js.Function2[/* initialState */ js.Any, /* options */ MakeStoreOptions, Store[js.Any, AnyAction]]
}
