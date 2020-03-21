package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsSlinky.baseui.radioMod.State, 
    /* currentState */ typingsSlinky.baseui.radioMod.State, 
    /* event */ slinky.core.SyntheticEvent[typingsSlinky.std.Event_, org.scalajs.dom.raw.HTMLInputElement], 
    typingsSlinky.baseui.radioMod.State
  ]
}
