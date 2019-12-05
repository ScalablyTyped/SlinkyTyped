package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkboxMod {
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.HTMLInputElement
  import slinky.core.SyntheticEvent

  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ CheckboxState, 
    /* currentState */ CheckboxState, 
    /* event */ SyntheticEvent[Event, HTMLInputElement], 
    CheckboxState
  ]
}
