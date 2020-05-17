package typingsSlinky.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectMod {
  type ChangeAction = js.Function0[js.Any]
  type StateReducer = js.Function3[
    /* stateType */ java.lang.String, 
    /* nextState */ typingsSlinky.baseui.selectMod.State, 
    /* currentState */ typingsSlinky.baseui.selectMod.State, 
    typingsSlinky.baseui.selectMod.State
  ]
  type Value = js.Array[typingsSlinky.baseui.selectMod.Option]
  type filterOptions = js.Function4[
    /* options */ typingsSlinky.baseui.selectMod.Value, 
    /* filterValue */ java.lang.String, 
    /* excludeOptions */ js.UndefOr[typingsSlinky.baseui.selectMod.Value], 
    /* newProps */ js.UndefOr[typingsSlinky.baseui.anon.FilterOption], 
    typingsSlinky.baseui.selectMod.Value
  ]
}
