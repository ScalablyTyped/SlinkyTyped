package typingsSlinky.atReachRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReachRouterMod {
  import org.scalajs.dom.raw.HTMLAnchorElement
  import slinky.core.TagMod
  import typingsSlinky.atReachRouter.Anon_Default
  import typingsSlinky.atReachRouter.Anon_State
  import typingsSlinky.atReachRouter.atReachRouterStrings.href
  import typingsSlinky.history.historyMod.LocationState
  import typingsSlinky.react.reactMod.AnchorHTMLAttributes
  import typingsSlinky.react.reactMod.DetailedHTMLProps
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type AnchorProps = Omit[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    href
  ]
  type HistoryListener = js.Function1[/* parameter */ HistoryListenerParameter, Unit]
  type HistoryLocation = WindowLocation with Anon_State
  type HistoryUnsubscribe = js.Function0[Unit]
  type LocationProviderRenderFn = js.Function1[/* context */ LocationContext, TagMod[Any]]
  type MatchRenderFn[TParams] = js.Function1[/* props */ MatchRenderProps[TParams], TagMod[Any]]
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type RouteComponentProps[TParams] = Partial[TParams] with Anon_Default
  type WindowLocation = org.scalajs.dom.raw.Location with typingsSlinky.history.historyMod.Location[LocationState]
}
