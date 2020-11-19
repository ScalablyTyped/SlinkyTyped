package typingsSlinky.easyXHeaders.httpMod

import typingsSlinky.easyXHeaders.NodeJS.Timer
import typingsSlinky.easyXHeaders.netMod.Socket
import typingsSlinky.easyXHeaders.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingMessage extends Readable {
  
  var headers: js.Any = js.native
  
  var httpVersion: String = js.native
  
  /**
    * Only valid for request obtained from http.Server.
    */
  var method: js.UndefOr[String] = js.native
  
  var rawHeaders: js.Array[String] = js.native
  
  var rawTrailers: js.Any = js.native
  
  def setTimeout(msecs: Double, callback: js.Function): Timer = js.native
  
  var socket: Socket = js.native
  
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[Double] = js.native
  
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  var trailers: js.Any = js.native
  
  /**
    * Only valid for request obtained from http.Server.
    */
  var url: js.UndefOr[String] = js.native
}
