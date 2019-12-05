package typingsSlinky.inversifyDashRestifyDashUtils.dtsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
  import typingsSlinky.inversifyDashRestifyDashUtils.Anon_Options
  import typingsSlinky.inversifyDashRestifyDashUtils.Anon_Path
  import typingsSlinky.restify.restifyMod.RequestHandler
  import typingsSlinky.restify.restifyMod.Server

  type ConfigFunction = js.Function1[/* app */ Server, Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ String, /* value */ js.Any, Unit]
  type Middleware = ServiceIdentifier[js.Any] | RequestHandler
  type RouteOptions = StrOrRegex | Anon_Path | (Anon_Options with js.Object)
  type StrOrRegex = String | js.RegExp
}
