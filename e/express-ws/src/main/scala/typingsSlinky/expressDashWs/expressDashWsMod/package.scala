package typingsSlinky.expressDashWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWsMod {
  import typingsSlinky.express.expressMod.NextFunction
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams

  type Application = typingsSlinky.express.expressMod.Application with WithWebsocketMethod
  type Router = typingsSlinky.express.expressMod.Router with WithWebsocketMethod
  type WebsocketMethod[T] = js.Function2[/* route */ PathParams, /* repeated */ WebsocketRequestHandler, T]
  type WebsocketRequestHandler = js.Function3[
    /* ws */ typingsSlinky.ws.wsMod.^, 
    /* req */ Request[ParamsDictionary], 
    /* next */ NextFunction, 
    Unit
  ]
}
