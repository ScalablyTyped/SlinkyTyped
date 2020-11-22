package typingsSlinky.getUri.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.getUri.httpMod.HttpOrHttpsModule
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestListener
import typingsSlinky.node.httpsMod.Agent
import typingsSlinky.node.httpsMod.RequestOptions
import typingsSlinky.node.httpsMod.Server
import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhttps extends HttpOrHttpsModule {
  
  var Agent: Instantiable0[typingsSlinky.node.httpsMod.Agent] = js.native
  
  var Server: Instantiable0[typingsSlinky.node.httpsMod.Server] = js.native
  
  def createServer(): Server = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): Server = js.native
  def createServer(requestListener: RequestListener): Server = js.native
  
  def get(options: String): ClientRequest = js.native
  def get(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: RequestOptions): ClientRequest = js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: URL_): ClientRequest = js.native
  def get(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: String, options: RequestOptions): ClientRequest = js.native
  def get(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: URL_, options: RequestOptions): ClientRequest = js.native
  def get(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  var globalAgent: Agent = js.native
  
  def request(options: String): ClientRequest = js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: RequestOptions): ClientRequest = js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: URL_): ClientRequest = js.native
  def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: String, options: RequestOptions): ClientRequest = js.native
  def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: URL_, options: RequestOptions): ClientRequest = js.native
  def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}
