package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object paginationMod {
  type StateReducer = js.Function3[
    typingsSlinky.baseui.baseuiStrings.change_, 
    /* changes */ typingsSlinky.baseui.paginationMod.State, 
    /* currentState */ typingsSlinky.baseui.paginationMod.State, 
    typingsSlinky.baseui.paginationMod.State
  ]
}
