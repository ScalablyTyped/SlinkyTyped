package typingsSlinky.reduxDashPromiseDashListener.reduxDashPromiseDashListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReduxPromiseListener {
  import typingsSlinky.redux.reduxMod.AnyAction

  type ActionMatcher = js.Function1[/* action */ AnyAction, Boolean]
}
