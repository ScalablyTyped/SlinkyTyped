package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object radioMod {
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.HTMLInputElement
  import slinky.core.SyntheticEvent

  type StateReducer = js.Function4[
    /* stateType */ String, 
    /* nextState */ State, 
    /* currentState */ State, 
    /* event */ SyntheticEvent[Event, HTMLInputElement], 
    State
  ]
}
