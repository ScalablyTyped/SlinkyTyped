package typingsSlinky.apolloServerExpress

import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerTypes.mod.ValueOrPromise
import typingsSlinky.express.mod.Handler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/expressApollo", JSImport.Namespace)
@js.native
object expressApolloMod extends js.Object {
  def graphqlExpress(options: GraphQLServerOptions[Record[String, _], _]): Handler = js.native
  def graphqlExpress(options: ExpressGraphQLOptionsFunction): Handler = js.native
  type ExpressGraphQLOptionsFunction = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    ValueOrPromise[GraphQLServerOptions[Record[String, js.Any], js.Any]]
  ]
}

