package typingsSlinky.node.httpMod

import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
@JSImport("http", "ServerResponse")
@js.native
class ServerResponse protected () extends OutgoingMessage {
  def this(req: IncomingMessage) = this()
  
  def assignSocket(socket: Socket): Unit = js.native
  
  def detachSocket(socket: Socket): Unit = js.native
  
  var statusCode: Double = js.native
  
  var statusMessage: String = js.native
  
  // https://github.com/nodejs/node/blob/master/test/parallel/test-http-write-callbacks.js#L53
  // no args in writeContinue callback
  def writeContinue(): Unit = js.native
  def writeContinue(callback: js.Function0[Unit]): Unit = js.native
  
  def writeHead(statusCode: Double): this.type = js.native
  def writeHead(statusCode: Double, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
  def writeHead(statusCode: Double, headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: js.Array[OutgoingHttpHeader]): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: js.UndefOr[scala.Nothing], headers: OutgoingHttpHeaders): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: String): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: String, headers: js.Array[OutgoingHttpHeader]): this.type = js.native
  def writeHead(statusCode: Double, reasonPhrase: String, headers: OutgoingHttpHeaders): this.type = js.native
  
  def writeProcessing(): Unit = js.native
}
