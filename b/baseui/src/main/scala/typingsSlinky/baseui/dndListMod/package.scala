package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dndListMod {
  
  type StateReducer = js.Function3[
    typingsSlinky.baseui.baseuiStrings.change_, 
    /* nextState */ typingsSlinky.baseui.dndListMod.State, 
    /* currentState */ typingsSlinky.baseui.dndListMod.State, 
    typingsSlinky.baseui.dndListMod.State
  ]
}
