package typingsSlinky.apolloDashServerDashExpress

import typingsSlinky.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloDashServerDashExpress.distExpressApolloMod.ExpressGraphQLOptionsFunction
import typingsSlinky.express.expressMod.Handler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express/dist/connectApollo", JSImport.Namespace)
@js.native
object distConnectApolloMod extends js.Object {
  val graphqlConnect: js.Function1[
    /* options */ (GraphQLServerOptions[Record[String, js.Any], js.Any]) | ExpressGraphQLOptionsFunction, 
    Handler
  ] = js.native
}

