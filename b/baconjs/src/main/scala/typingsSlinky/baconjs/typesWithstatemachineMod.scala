package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.default
import typingsSlinky.baconjs.typesTransformMod.Transformer
import typingsSlinky.baconjs.typesWithstatemachineMod.StateF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/withstatemachine", JSImport.Namespace)
@js.native
object typesWithstatemachineMod extends js.Object {
  def default[In, State, Out](
    initState: State,
    f: StateF[In, State, Out],
    src: typingsSlinky.baconjs.typesObservableMod.default[In]
  ): typingsSlinky.baconjs.typesObservableMod.default[Out] = js.native
  def withStateMachine[In, State, Out](initState: State, f: StateF[In, State, Out], src: default[In]): default[Out] = js.native
  def withStateMachineT[In, State, Out](initState: State, f: StateF[In, State, Out]): Transformer[In, Out] = js.native
  type StateF[In, State, Out] = js.Function2[
    /* state */ State, 
    /* event */ typingsSlinky.baconjs.typesEventMod.default[In], 
    js.Tuple2[State, js.Array[typingsSlinky.baconjs.typesEventMod.default[Out]]]
  ]
}

