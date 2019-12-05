package typingsSlinky.opticsDashAgent.opticsDashAgentMod

import typingsSlinky.express.expressMod.Request
import typingsSlinky.express.expressMod.Response
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.graphql.graphqlMod.GraphQLSchema
import typingsSlinky.hapi.hapiMod.Server
import typingsSlinky.koa.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", "Agent")
@js.native
class Agent protected () extends js.Object {
  def this(options: Options) = this()
  def configureAgent(options: Options): Agent = js.native
  def context(req: Request[ParamsDictionary]): js.Any = js.native
  def instrumentHapiServer(server: Server): Unit = js.native
  def instrumentSchema(schema: GraphQLSchema): Unit = js.native
  def koaMiddleware(): js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Unit] = js.native
  def middleware(): js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
}

