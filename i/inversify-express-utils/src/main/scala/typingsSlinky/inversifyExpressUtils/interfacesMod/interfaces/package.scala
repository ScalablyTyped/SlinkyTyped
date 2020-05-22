package typingsSlinky.inversifyExpressUtils.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type ConfigFunction = js.Function1[/* app */ typingsSlinky.express.mod.Application_, scala.Unit]
  type ControllerParameterMetadata = org.scalablytyped.runtime.StringDictionary[
    js.Array[typingsSlinky.inversifyExpressUtils.interfacesMod.interfaces.ParameterMetadata]
  ]
  type HandlerDecorator = js.Function3[/* target */ js.Any, /* key */ java.lang.String, /* value */ js.Any, scala.Unit]
  type Middleware = typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any] | (typingsSlinky.express.mod.RequestHandler[
    typingsSlinky.expressServeStaticCore.mod.ParamsDictionary, 
    js.Any, 
    js.Any, 
    typingsSlinky.expressServeStaticCore.mod.Query
  ])
}
