package typingsSlinky.reachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HistoryListener = js.Function1[/* parameter */ typingsSlinky.reachRouter.mod.HistoryListenerParameter, scala.Unit]
  type HistoryLocation = typingsSlinky.reachRouter.mod.WindowLocation[typingsSlinky.history.mod.LocationState] with typingsSlinky.reachRouter.anon.State
  type HistoryUnsubscribe = js.Function0[scala.Unit]
  type Link[TState] = typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.react.mod.PropsWithoutRef[typingsSlinky.reachRouter.mod.LinkProps[TState]] with typingsSlinky.react.mod.RefAttributes[org.scalajs.dom.raw.HTMLAnchorElement]
  ]
  type LocationProviderRenderFn = js.Function1[
    /* context */ typingsSlinky.reachRouter.mod.LocationContext, 
    slinky.core.TagMod[scala.Any]
  ]
  type MatchRenderFn[TParams] = js.Function1[
    /* props */ typingsSlinky.reachRouter.mod.MatchRenderProps[TParams], 
    slinky.core.TagMod[scala.Any]
  ]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type RouteComponentProps[TParams] = typingsSlinky.std.Partial[TParams] with typingsSlinky.reachRouter.anon.Default
  type WindowLocation[S] = org.scalajs.dom.raw.Location with typingsSlinky.history.mod.Location[S]
}
