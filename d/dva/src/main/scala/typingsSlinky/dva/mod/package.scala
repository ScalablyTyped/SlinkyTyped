package typingsSlinky.dva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Effect = js.Function2[
    /* action */ typingsSlinky.redux.mod.AnyAction, 
    /* effects */ typingsSlinky.dva.mod.EffectsCommandMap, 
    scala.Unit
  ]
  type EffectWithType = js.Tuple2[typingsSlinky.dva.mod.Effect, typingsSlinky.dva.anon.Type]
  type EffectsMapObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dva.mod.Effect | typingsSlinky.dva.mod.EffectWithType]
  type ReducerEnhancer = js.Function1[
    /* reducer */ typingsSlinky.redux.mod.Reducer[js.Any, typingsSlinky.redux.mod.AnyAction], 
    scala.Unit
  ]
  type ReducersMapObjectWithEnhancer = js.Tuple2[
    typingsSlinky.redux.mod.ReducersMapObject[js.Any, typingsSlinky.redux.mod.Action[js.Any]], 
    typingsSlinky.dva.mod.ReducerEnhancer
  ]
  type Router = js.Function1[
    /* api */ js.UndefOr[typingsSlinky.dva.mod.RouterAPI], 
    slinky.core.facade.ReactElement | js.Object
  ]
  type Subscription = js.Function2[/* api */ typingsSlinky.dva.mod.SubscriptionAPI, /* done */ js.Function, scala.Unit]
  type SubscriptionsMapObject = org.scalablytyped.runtime.StringDictionary[typingsSlinky.dva.mod.Subscription]
  type onActionFunc = js.Function1[/* api */ typingsSlinky.redux.mod.MiddlewareAPI[js.Any, js.Any], scala.Unit]
}
