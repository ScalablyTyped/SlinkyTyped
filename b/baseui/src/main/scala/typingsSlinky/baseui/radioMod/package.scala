package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object radioMod {
  
  type StateReducer = js.Function4[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsSlinky.baseui.radioMod.State, 
    /* currentState */ typingsSlinky.baseui.radioMod.State, 
    /* event */ slinky.core.SyntheticEvent[org.scalajs.dom.raw.Event, org.scalajs.dom.raw.HTMLInputElement], 
    typingsSlinky.baseui.radioMod.State
  ]
}
