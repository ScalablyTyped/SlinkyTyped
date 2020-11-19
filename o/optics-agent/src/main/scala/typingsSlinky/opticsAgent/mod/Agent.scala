package typingsSlinky.opticsAgent.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.graphql.mod.GraphQLSchema
import typingsSlinky.hapi.mod.Server
import typingsSlinky.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("optics-agent", "Agent")
@js.native
class Agent protected () extends js.Object {
  def this(options: Options) = this()
  
  def configureAgent(options: Options): Agent = js.native
  
  def context(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
  
  def instrumentHapiServer(server: Server): Unit = js.native
  
  def instrumentSchema(schema: GraphQLSchema): Unit = js.native
  
  def koaMiddleware(): js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Unit] = js.native
  
  def middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* res */ Response_[_], 
    /* next */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
}
