package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object popoverMod {
  type ANIMATE_IN_TIME = typingsSlinky.baseui.baseuiNumbers.`20`
  type ANIMATE_OUT_TIME = typingsSlinky.baseui.baseuiNumbers.`0`
  type StateReducer = js.Function3[
    /* stateChangeType */ typingsSlinky.baseui.baseuiStrings.open | typingsSlinky.baseui.baseuiStrings.close, 
    /* nextState */ typingsSlinky.baseui.popoverMod.State, 
    /* currentState */ typingsSlinky.baseui.popoverMod.State, 
    typingsSlinky.baseui.popoverMod.State
  ]
}
