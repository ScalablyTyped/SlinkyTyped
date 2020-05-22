package typingsSlinky.epilogue.mod

import typingsSlinky.epilogue.anon.Model
import typingsSlinky.epilogue.anon.Plural
import typingsSlinky.express.mod.Express
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "Resource")
@js.native
class Resource_ protected () extends js.Object {
  def this(options: ResourceOptions) = this()
  var actions: js.Array[String] = js.native
  @JSName("app")
  var app_Original: Express = js.native
  var associationOptions: ResourceAssociationOptions = js.native
  var attributes: js.Array[String] = js.native
  var controllers: Controllers = js.native
  var endpoints: Plural = js.native
  var excludeAttributes: js.Array[String] = js.native
  var include: js.Array[Model | String] = js.native
  var model: js.Any = js.native
  var pagination: Boolean = js.native
  var readOnlyAttributes: js.Array[String] = js.native
  var reloadInstances: Boolean = js.native
  var search: ResourceSearchOption = js.native
  var sequelize: Sequelize = js.native
  var sort: ResourceSortOption = js.native
  var updateMethod: String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

