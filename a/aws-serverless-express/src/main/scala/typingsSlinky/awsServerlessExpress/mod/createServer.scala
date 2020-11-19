package typingsSlinky.awsServerlessExpress.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-serverless-express", "createServer")
@js.native
object createServer extends js.Object {
  
  def apply(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): Server = js.native
  def apply(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.UndefOr[scala.Nothing],
    binaryMimeTypes: js.Array[String]
  ): Server = js.native
  def apply(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[_]
  ): Server = js.native
  def apply(
    requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit],
    serverListenCallback: js.Function0[_],
    binaryMimeTypes: js.Array[String]
  ): Server = js.native
}
