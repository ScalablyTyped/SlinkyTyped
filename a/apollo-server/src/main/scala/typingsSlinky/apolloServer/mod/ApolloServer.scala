package typingsSlinky.apolloServer.mod

import typingsSlinky.apolloServer.anon.ApolloServerExpressConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-server", "ApolloServer")
@js.native
class ApolloServer protected ()
  extends typingsSlinky.apolloServerExpress.mod.ApolloServer {
  def this(config: ApolloServerExpressConfig) = this()
  
  def applyMiddleware(): Unit = js.native
  
  var cors: js.Any = js.native
  
  var createServerInfo: js.Any = js.native
  
  var httpServer: js.Any = js.native
  
  def listen(opts: js.Any*): js.Promise[ServerInfo] = js.native
  
  var onHealthCheck: js.Any = js.native
}
