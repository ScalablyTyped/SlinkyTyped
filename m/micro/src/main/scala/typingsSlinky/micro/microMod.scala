package typingsSlinky.micro

import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("micro", JSImport.Namespace)
@js.native
object microMod extends js.Object {
  def buffer(req: IncomingMessage): js.Promise[Buffer | String] = js.native
  def buffer(req: IncomingMessage, info: Anon_Encoding): js.Promise[Buffer | String] = js.native
  def createError(code: Double, msg: String): js.Error with Anon_OriginalError = js.native
  def createError(code: Double, msg: String, orig: js.Error): js.Error with Anon_OriginalError = js.native
  def default(fn: RequestHandler): Server = js.native
  def json(req: IncomingMessage): js.Promise[js.Object] = js.native
  def json(req: IncomingMessage, info: Anon_Encoding): js.Promise[js.Object] = js.native
  def run(req: IncomingMessage, res: ServerResponse, fn: RequestHandler): js.Promise[Unit] = js.native
  def send(res: ServerResponse, code: Double): js.Promise[Unit] = js.native
  def send(res: ServerResponse, code: Double, data: js.Any): js.Promise[Unit] = js.native
  def sendError(req: IncomingMessage, res: ServerResponse, info: Anon_Message): js.Promise[Unit] = js.native
  def text(req: IncomingMessage): js.Promise[String] = js.native
  def text(req: IncomingMessage, info: Anon_Encoding): js.Promise[String] = js.native
  type RequestHandler = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, js.Any]
}

