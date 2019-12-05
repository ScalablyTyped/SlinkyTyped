package typingsSlinky.dva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dvaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.dva.Anon_History
  import typingsSlinky.dva.Anon_Type
  import typingsSlinky.react.reactMod._Global_.JSX.Element
  import typingsSlinky.redux.reduxMod.Action
  import typingsSlinky.redux.reduxMod.AnyAction
  import typingsSlinky.redux.reduxMod.MiddlewareAPI
  import typingsSlinky.redux.reduxMod.Reducer
  import typingsSlinky.redux.reduxMod.ReducersMapObject

  type DvaOption = Hooks with Anon_History
  type Effect = js.Function2[/* action */ AnyAction, /* effects */ EffectsCommandMap, Unit]
  type EffectWithType = js.Tuple2[Effect, Anon_Type]
  type EffectsMapObject = StringDictionary[Effect | EffectWithType]
  type ReducerEnhancer = js.Function1[/* reducer */ Reducer[js.Any, AnyAction], Unit]
  type ReducersMapObjectWithEnhancer = js.Tuple2[ReducersMapObject[js.Any, Action[js.Any]], ReducerEnhancer]
  type Router = js.Function1[/* api */ js.UndefOr[RouterAPI], Element | js.Object]
  type Subscription = js.Function2[/* api */ SubscriptionAPI, /* done */ js.Function, Unit]
  type SubscriptionsMapObject = StringDictionary[Subscription]
  type onActionFunc = js.Function1[/* api */ MiddlewareAPI[js.Any, js.Any], Unit]
}
