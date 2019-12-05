package typingsSlinky.graphqlDashPlaygroundDashMiddlewareDashExpress

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.graphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.MiddlewareOptions
import typingsSlinky.graphqlDashPlaygroundDashMiddlewareDashExpress.graphqlDashPlaygroundDashMiddlewareDashExpressMod.ExpressPlaygroundMiddleware
import typingsSlinky.graphqlDashPlaygroundDashMiddlewareDashExpress.graphqlDashPlaygroundDashMiddlewareDashExpressMod.Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-playground-middleware-express", JSImport.Namespace)
@js.native
object graphqlDashPlaygroundDashMiddlewareDashExpressMod extends js.Object {
  val default: Register = js.native
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
}

