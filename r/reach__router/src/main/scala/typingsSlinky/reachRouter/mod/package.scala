package typingsSlinky.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HistoryListener = js.Function1[/* parameter */ typingsSlinky.reachRouter.mod.HistoryListenerParameter, scala.Unit]
  type HistoryLocation = typingsSlinky.reachRouter.mod.WindowLocation with typingsSlinky.reachRouter.AnonState
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  type LocationProviderRenderFn = js.Function1[
    /* context */ typingsSlinky.reachRouter.mod.LocationContext, 
    slinky.core.TagMod[scala.Any]
  ]
  type MatchRenderFn[TParams] = js.Function1[
    /* props */ typingsSlinky.reachRouter.mod.MatchRenderProps[TParams], 
    slinky.core.TagMod[scala.Any]
  ]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  type RouteComponentProps[TParams] = typingsSlinky.std.Partial[TParams] with typingsSlinky.reachRouter.AnonDefault
  type WindowLocation = typingsSlinky.std.Location_ with typingsSlinky.history.mod.Location[typingsSlinky.history.mod.LocationState]
}
