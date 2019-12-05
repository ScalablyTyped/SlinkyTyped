package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dndDashListMod {
  import typingsSlinky.baseui.Anon_ChildrenInitialState
  import typingsSlinky.baseui.baseuiStrings.change_

  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  type StatefulComponentContainerProps = StatefulListProps with Anon_ChildrenInitialState
}
