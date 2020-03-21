package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phoneInputMod {
  type StateReducer = js.Function3[
    /* type */ typingsSlinky.baseui.phoneInputMod.StateChange, 
    /* nextState */ typingsSlinky.baseui.phoneInputMod.State, 
    /* currentState */ typingsSlinky.baseui.phoneInputMod.State, 
    typingsSlinky.baseui.phoneInputMod.State
  ]
}
