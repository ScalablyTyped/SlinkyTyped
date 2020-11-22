package typingsSlinky.apimocker.mod

import typingsSlinky.express.mod.Application_
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiMocker extends js.Object {
  
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def express(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
  def express(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def express(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
  def express(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  @JSName("express")
  var express_Original: Application_ = js.native
  
  def loadConfigFile(): Unit = js.native
  
  var middlewares: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  def setConfigFile(file: String): ApiMocker = js.native
  
  /**
    * Set the route for express, in case it was not set yet
    */
  def setRoute(options: js.Any): Unit = js.native
  
  def setRoutes(webServices: js.Any): Unit = js.native
  
  /**
    * Start a new instance of API Mocker
    */
  def start(serverPort: String): ApiMocker = js.native
  def start(serverPort: String, callback: js.Function0[Unit]): ApiMocker = js.native
  def start(serverPort: Double): ApiMocker = js.native
  def start(serverPort: Double, callback: js.Function0[Unit]): ApiMocker = js.native
  
  /**
    * Stop the referenced instance of API Mocker
    */
  def stop(): ApiMocker = js.native
  def stop(callback: js.Function0[Unit]): ApiMocker = js.native
}
