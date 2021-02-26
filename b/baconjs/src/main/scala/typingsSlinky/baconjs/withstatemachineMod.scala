package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.default
import typingsSlinky.baconjs.transformMod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withstatemachineMod {
  
  @JSImport("baconjs/types/withstatemachine", JSImport.Default)
  @js.native
  def default[In, State, Out](initState: State, f: StateF[In, State, Out], src: typingsSlinky.baconjs.observableMod.default[In]): typingsSlinky.baconjs.observableMod.default[Out] = js.native
  
  @JSImport("baconjs/types/withstatemachine", "withStateMachine")
  @js.native
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = js.native
  
  @JSImport("baconjs/types/withstatemachine", "withStateMachineT")
  @js.native
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = js.native
  
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typingsSlinky.baconjs.eventMod.default[In], 
    js.Tuple2[State, js.Array[typingsSlinky.baconjs.eventMod.default[Out]]]
  ]
}
