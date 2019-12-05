package typingsSlinky.restDashIo.libSrcResourceMod

import typingsSlinky.express.expressMod.Application
import typingsSlinky.express.expressMod.Router
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typingsSlinky.mongoose.mongooseMod.Document
import typingsSlinky.mongoose.mongooseMod.Model
import typingsSlinky.mongoose.mongooseMod.Mongoose
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(resDef: IResource) = this()
  @JSName("app")
  var app_Original: Application = js.native
  var baseUrl: String = js.native
  var db: Mongoose = js.native
  var model: Model[Document, js.Object] = js.native
  var paramId: String = js.native
  var parameterizedUrl: String = js.native
  var parentRef: String = js.native
  var parentResource: Resource = js.native
  var populate: String = js.native
  var resDef: IResource = js.native
  var router: Router = js.native
  var url: String = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def buildParentSearch(req: typingsSlinky.express.expressMod.Request[ParamsDictionary], query: js.Any): js.Any = js.native
  def buildPopulateQuery(req: typingsSlinky.express.expressMod.Request[ParamsDictionary]): js.Any = js.native
  def buildSearchQuery(req: typingsSlinky.express.expressMod.Request[ParamsDictionary]): js.Object = js.native
  def create(
    req: typingsSlinky.express.expressMod.Request[ParamsDictionary],
    res: typingsSlinky.express.expressMod.Response
  ): Unit = js.native
  def createModel(resDef: IResource): Model[Document, js.Object] = js.native
  def createQuery(query: String): js.Any = js.native
  def createRegex(query: String): js.RegExp = js.native
  def del(
    req: typingsSlinky.express.expressMod.Request[ParamsDictionary],
    res: typingsSlinky.express.expressMod.Response
  ): Unit = js.native
  def errorHandler(err: js.Error, res: typingsSlinky.express.expressMod.Response): Unit = js.native
  def getAll(
    req: typingsSlinky.express.expressMod.Request[ParamsDictionary],
    res: typingsSlinky.express.expressMod.Response
  ): Unit = js.native
  def getById(
    req: typingsSlinky.express.expressMod.Request[ParamsDictionary],
    res: typingsSlinky.express.expressMod.Response
  ): Unit = js.native
  def setupRecursiveRoutes(): Unit = js.native
  def setupRoutes(): Unit = js.native
  def toClassName(name: String): String = js.native
  def update(
    req: typingsSlinky.express.expressMod.Request[ParamsDictionary],
    res: typingsSlinky.express.expressMod.Response
  ): Unit = js.native
}

/* static members */
@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
object Resource extends js.Object {
  var BASE_URL: String = js.native
}

