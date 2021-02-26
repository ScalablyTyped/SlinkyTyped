package typingsSlinky.micro

import typingsSlinky.micro.anon.Encoding
import typingsSlinky.micro.anon.ErrorstatusCodenumberorig
import typingsSlinky.micro.anon.Message
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro", JSImport.Default)
  @js.native
  def default(fn: RequestHandler): Server = js.native
  
  @JSImport("micro", "buffer")
  @js.native
  def buffer(req: IncomingMessage): js.Promise[Buffer | String] = js.native
  @JSImport("micro", "buffer")
  @js.native
  def buffer(req: IncomingMessage, info: Encoding): js.Promise[Buffer | String] = js.native
  
  @JSImport("micro", "createError")
  @js.native
  def createError(code: Double, msg: String): ErrorstatusCodenumberorig = js.native
  @JSImport("micro", "createError")
  @js.native
  def createError(code: Double, msg: String, orig: js.Error): ErrorstatusCodenumberorig = js.native
  
  @JSImport("micro", "json")
  @js.native
  def json(req: IncomingMessage): js.Promise[js.Object] = js.native
  @JSImport("micro", "json")
  @js.native
  def json(req: IncomingMessage, info: Encoding): js.Promise[js.Object] = js.native
  
  @JSImport("micro", "run")
  @js.native
  def run(req: IncomingMessage, res: ServerResponse, fn: RequestHandler): js.Promise[Unit] = js.native
  
  @JSImport("micro", "send")
  @js.native
  def send(res: ServerResponse, code: Double): js.Promise[Unit] = js.native
  @JSImport("micro", "send")
  @js.native
  def send(res: ServerResponse, code: Double, data: js.Any): js.Promise[Unit] = js.native
  
  @JSImport("micro", "sendError")
  @js.native
  def sendError(req: IncomingMessage, res: ServerResponse, info: Message): js.Promise[Unit] = js.native
  
  @JSImport("micro", "text")
  @js.native
  def text(req: IncomingMessage): js.Promise[String] = js.native
  @JSImport("micro", "text")
  @js.native
  def text(req: IncomingMessage, info: Encoding): js.Promise[String] = js.native
  
  type RequestHandler = js.Function2[/* req */ IncomingMessage, /* res */ ServerResponse, js.Any]
}
