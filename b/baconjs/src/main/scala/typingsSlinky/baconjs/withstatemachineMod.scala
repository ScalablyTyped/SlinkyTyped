package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.transformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
@js.native
object withstatemachineMod extends js.Object {
  
  def default[In, State, Out](initState: State, f: StateF[In, State, Out], src: typingsSlinky.baconjs.observableMod.default[In]): typingsSlinky.baconjs.observableMod.default[Out] = js.native
  
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = js.native
  
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = js.native
  
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typingsSlinky.baconjs.eventMod.default[In], 
    js.Tuple2[State, js.Array[typingsSlinky.baconjs.eventMod.default[Out]]]
  ]
}
