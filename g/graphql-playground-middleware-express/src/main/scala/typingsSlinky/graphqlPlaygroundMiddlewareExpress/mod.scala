package typingsSlinky.graphqlPlaygroundMiddlewareExpress

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.graphqlPlaygroundHtml.renderPlaygroundPageMod.MiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-playground-middleware-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: Register = js.native
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
}

