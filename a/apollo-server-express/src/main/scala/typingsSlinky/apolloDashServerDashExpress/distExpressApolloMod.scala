package typingsSlinky.apolloDashServerDashExpress

import typingsSlinky.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typingsSlinky.express.expressMod.Handler
import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/expressApollo", JSImport.Namespace)
@js.native
object distExpressApolloMod extends js.Object {
  def graphqlExpress(options: GraphQLServerOptions[Record[String, _], _]): Handler = js.native
  def graphqlExpress(options: ExpressGraphQLOptionsFunction): Handler = js.native
  type ExpressGraphQLOptionsFunction = js.Function2[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    ValueOrPromise[GraphQLServerOptions[Record[String, js.Any], js.Any]]
  ]
}

