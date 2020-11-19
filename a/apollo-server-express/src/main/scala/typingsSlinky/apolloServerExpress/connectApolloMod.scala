package typingsSlinky.apolloServerExpress

import typingsSlinky.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typingsSlinky.apolloServerExpress.expressApolloMod.ExpressGraphQLOptionsFunction
import typingsSlinky.express.mod.Handler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server-express/dist/connectApollo", JSImport.Namespace)
@js.native
object connectApolloMod extends js.Object {
  
  val graphqlConnect: js.Function1[
    /* options */ (GraphQLServerOptions[Record[String, js.Any], js.Any]) | ExpressGraphQLOptionsFunction, 
    Handler
  ] = js.native
}
