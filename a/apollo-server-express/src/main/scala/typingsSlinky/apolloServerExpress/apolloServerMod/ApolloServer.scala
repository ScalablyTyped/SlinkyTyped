package typingsSlinky.apolloServerExpress.apolloServerMod

import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerCore.mod.ApolloServerBase
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.express.mod.Router
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express/dist/ApolloServer", "ApolloServer")
@js.native
class ApolloServer protected () extends ApolloServerBase {
  def this(config: ApolloServerExpressConfig) = this()
  
  def applyMiddleware(hasAppRest: ServerRegistration): Unit = js.native
  
  def createGraphQLServerOptions(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): js.Promise[GraphQLServerOptions[Record[String, _], _]] = js.native
  
  def getMiddleware(): Router = js.native
  def getMiddleware(hasPathCorsBodyParserConfigDisableHealthCheckOnHealthCheck: GetMiddlewareOptions): Router = js.native
}
