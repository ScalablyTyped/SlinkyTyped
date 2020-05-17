package typingsSlinky.inversifyRestifyUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typingsSlinky.restify.mod.Server, scala.Unit]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
}
