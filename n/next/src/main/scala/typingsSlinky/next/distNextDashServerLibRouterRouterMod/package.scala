package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNextDashServerLibRouterRouterMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.next.nextStrings.back
  import typingsSlinky.next.nextStrings.beforePopState
  import typingsSlinky.next.nextStrings.events
  import typingsSlinky.next.nextStrings.prefetch
  import typingsSlinky.next.nextStrings.push
  import typingsSlinky.next.nextStrings.reload
  import typingsSlinky.next.nextStrings.replace
  import typingsSlinky.node.urlMod.UrlObject
  import typingsSlinky.std.Pick

  type BeforePopStateCallback = js.Function1[/* state */ js.Any, Boolean]
  type ComponentLoadCancel = js.Function0[Unit] | Null
  type NextRouter = BaseRouter with (Pick[Router, push | replace | reload | back | prefetch | beforePopState | events])
  type Subscription = js.Function2[/* data */ RouteInfo, /* App */ js.UndefOr[ReactComponentClass[js.Object]], Unit]
  type Url = UrlObject | String
}
