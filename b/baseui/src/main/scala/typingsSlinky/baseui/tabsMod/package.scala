package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tabsMod {
  
  type StateReducer = js.Function3[
    typingsSlinky.baseui.baseuiStrings.change_, 
    /* nextState */ typingsSlinky.baseui.tabsMod.State, 
    /* currentState */ typingsSlinky.baseui.tabsMod.State, 
    typingsSlinky.baseui.tabsMod.State
  ]
}
