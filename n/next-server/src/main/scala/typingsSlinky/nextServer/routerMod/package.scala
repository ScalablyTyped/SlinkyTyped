package typingsSlinky.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type BeforePopStateCallback = js.Function1[/* state */ js.Any, scala.Boolean]
  type Subscription = js.Function2[
    /* data */ typingsSlinky.nextServer.routerMod.RouteInfo, 
    /* App */ js.UndefOr[slinky.core.ReactComponentClass[js.Object]], 
    scala.Unit
  ]
}
