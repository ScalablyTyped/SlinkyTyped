package typingsSlinky.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibRouterRouterMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.nextDashServer.nextDashServerStrings.back
  import typingsSlinky.nextDashServer.nextDashServerStrings.beforePopState
  import typingsSlinky.nextDashServer.nextDashServerStrings.events
  import typingsSlinky.nextDashServer.nextDashServerStrings.prefetch
  import typingsSlinky.nextDashServer.nextDashServerStrings.push
  import typingsSlinky.nextDashServer.nextDashServerStrings.reload
  import typingsSlinky.nextDashServer.nextDashServerStrings.replace
  import typingsSlinky.node.urlMod.UrlObject
  import typingsSlinky.std.Pick

  type BeforePopStateCallback = js.Function1[/* state */ js.Any, Boolean]
  type ComponentLoadCancel = js.Function0[Unit] | Null
  type NextRouter = BaseRouter with (Pick[Router, push | replace | reload | back | prefetch | beforePopState | events])
  type Subscription = js.Function2[/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]], Unit]
  type Url = UrlObject | String
}
