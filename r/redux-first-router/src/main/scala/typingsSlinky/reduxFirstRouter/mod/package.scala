package typingsSlinky.reduxFirstRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfirmLeave = js.Function2[
    /* state */ js.Object, 
    /* action */ js.Object, 
    typingsSlinky.reduxFirstRouter.mod.Nullable[java.lang.String]
  ]
  type DisplayConfirmLeave = js.Function2[
    /* message */ java.lang.String, 
    /* callback */ js.Function1[/* unblock */ scala.Boolean, scala.Unit], 
    scala.Unit
  ]
  type HistoryAction = java.lang.String
  type HistoryEntries = js.Array[typingsSlinky.reduxFirstRouter.anon.Pathname]
  type Listener = js.Function2[
    /* location */ typingsSlinky.reduxFirstRouter.mod.HistoryLocation, 
    /* action */ typingsSlinky.reduxFirstRouter.mod.HistoryAction, 
    scala.Unit
  ]
  type Navigators[TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reduxFirstRouter.mod.Navigator[TState]]
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Query = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type RouteObject[TKeys, TState] = TKeys with typingsSlinky.reduxFirstRouter.anon.CapitalizedWords[TState]
  type RouteString = java.lang.String
  type RouteThunk[TState] = js.Function2[
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[js.Any], 
    /* getState */ typingsSlinky.reduxFirstRouter.mod.StateGetter[TState], 
    js.Any | js.Promise[js.Any]
  ]
  type RoutesMap[TKeys, TState] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reduxFirstRouter.mod.Route[TKeys, TState]]
  type ScrollBehavior_ = js.Object
  type ScrollUpdater = js.Function1[/* performedByUser */ scala.Boolean, scala.Unit]
  type SelectLocationState_[TKeys, TState] = js.Function1[
    /* state */ TState, 
    typingsSlinky.reduxFirstRouter.mod.LocationState[TKeys, TState]
  ]
  type SelectTitleState[TState] = js.Function1[/* state */ TState, java.lang.String]
  type StateGetter[TState] = js.Function0[TState]
}
