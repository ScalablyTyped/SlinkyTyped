package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paginationMod {
  import typingsSlinky.baseui.baseuiStrings.change_

  type StateReducer = js.Function3[change_, /* changes */ State, /* currentState */ State, State]
}
