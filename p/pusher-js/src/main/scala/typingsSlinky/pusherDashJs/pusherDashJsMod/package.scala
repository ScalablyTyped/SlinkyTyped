package typingsSlinky.pusherDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pusherDashJsMod {
  import typingsSlinky.pusherDashJs.Anon_AuthInfo

  type Authorizer = js.Function2[/* channel */ Channel, /* options */ Config, Anon_AuthInfo]
  type EventCallback = js.Function2[/* context */ js.Any, /* data */ js.Any, Unit]
}
