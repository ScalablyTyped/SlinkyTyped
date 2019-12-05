package typingsSlinky.reduxDashAuthDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashAuthDashWrapperMod {
  import slinky.core.ReactComponentClass

  type AuthWrapperDecorator[Props] = js.Function1[/* component */ ReactComponentClass[Props], ReactComponentClass[Props]]
  type StateSelector[State, OwnProps, R] = js.Function2[/* state */ State, /* props */ OwnProps, R]
}
