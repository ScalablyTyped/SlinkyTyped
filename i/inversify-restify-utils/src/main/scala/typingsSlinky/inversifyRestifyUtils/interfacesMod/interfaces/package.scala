package typingsSlinky.inversifyRestifyUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typingsSlinky.restify.mod.Server, scala.Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any] | typingsSlinky.restify.mod.RequestHandler
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
    - typingsSlinky.inversifyRestifyUtils.anon.Path
    - typingsSlinky.inversifyRestifyUtils.anon.optionsObjectpathStrOrReg
  */
  type RouteOptions = typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces._RouteOptions | typingsSlinky.inversifyRestifyUtils.interfacesMod.interfaces.StrOrRegex
  type StrOrRegex = java.lang.String | js.RegExp
}
