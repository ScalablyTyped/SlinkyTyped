package typingsSlinky.restIo.resourceMod

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.express.mod.Router
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.mongoose.mod.Document
import typingsSlinky.mongoose.mod.Model_
import typingsSlinky.mongoose.mod.Mongoose
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
class Resource protected () extends js.Object {
  def this(resDef: IResource) = this()
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_]): js.Any = js.native
  def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def app(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("app")
  var app_Original: Application_ = js.native
  
  var baseUrl: String = js.native
  
  def buildParentSearch(req: Request_[ParamsDictionary, _, _, Query], query: js.Any): js.Any = js.native
  
  def buildPopulateQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
  
  def buildSearchQuery(req: Request_[ParamsDictionary, _, _, Query]): js.Object = js.native
  
  def create(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def createModel(resDef: IResource): Model_[Document, js.Object] = js.native
  
  def createQuery(query: String): js.Any = js.native
  
  def createRegex(query: String): js.RegExp = js.native
  
  var db: Mongoose = js.native
  
  def del(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def errorHandler(err: js.Error, res: Response_[_]): Unit = js.native
  
  def getAll(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  def getById(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  var model: Model_[Document, js.Object] = js.native
  
  var paramId: String = js.native
  
  var parameterizedUrl: String = js.native
  
  var parentRef: String = js.native
  
  var parentResource: Resource = js.native
  
  var populate: String = js.native
  
  var resDef: IResource = js.native
  
  var router: Router = js.native
  
  def setupRecursiveRoutes(): Unit = js.native
  
  def setupRoutes(): Unit = js.native
  
  def toClassName(name: String): String = js.native
  
  def update(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
  
  var url: String = js.native
}
/* static members */
@JSImport("rest-io/lib/src/resource", "Resource")
@js.native
object Resource extends js.Object {
  
  var BASE_URL: String = js.native
}
