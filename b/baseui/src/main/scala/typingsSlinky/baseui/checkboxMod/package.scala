package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkboxMod {
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsSlinky.baseui.checkboxMod.CheckboxState, 
    /* currentState */ typingsSlinky.baseui.checkboxMod.CheckboxState, 
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, org.scalajs.dom.raw.HTMLInputElement], 
    typingsSlinky.baseui.checkboxMod.CheckboxState
  ]
}
