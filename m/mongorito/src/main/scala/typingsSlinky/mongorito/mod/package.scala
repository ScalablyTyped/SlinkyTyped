package typingsSlinky.mongorito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type ModelClass = typingsSlinky.mongorito.mod.Class[typingsSlinky.mongorito.mod.Model]
  type Plugin = js.Function1[
    /* modelClass */ typingsSlinky.mongorito.mod.ModelClass, 
    js.Function1[
      /* store */ typingsSlinky.mongorito.mod.PluginStore, 
      js.Function1[
        /* next */ typingsSlinky.mongorito.mod.PluginNext, 
        js.Function1[/* action */ typingsSlinky.mongorito.mod.Action, scala.Unit]
      ]
    ]
  ]
  type PluginNext = js.Function1[/* action */ typingsSlinky.mongorito.mod.Action, scala.Unit]
  type Reducer[S] = js.Function2[
    /* state */ S, 
    /* action */ typingsSlinky.mongorito.mod.Action, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
  ]
  type ReducerModifier = js.Function1[
    /* reducerState */ typingsSlinky.mongorito.mod.ReducerState, 
    typingsSlinky.mongorito.mod.ReducerState
  ]
  type ReducerState = typingsSlinky.mongorito.mod.DefaultReducer with (typingsSlinky.std.Map[_, typingsSlinky.mongorito.mod.Reducer[_]])
  type State = typingsSlinky.mongorito.mod.DefaultState with js.Any
}
