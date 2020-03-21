package typingsSlinky.followRedirects

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.followRedirects.mod.FollowOptions
import typingsSlinky.followRedirects.mod.FollowResponse
import typingsSlinky.followRedirects.mod.RedirectableRequest
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("follow-redirects/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  @js.native
  class Agent ()
    extends typingsSlinky.node.httpMod.Agent
  
  @js.native
  class ClientRequest protected ()
    extends typingsSlinky.node.httpMod.ClientRequest {
    def this(url: String) = this()
  }
  
  @js.native
  class IncomingMessage protected ()
    extends typingsSlinky.node.httpMod.IncomingMessage {
    def this(socket: Socket) = this()
  }
  
  @js.native
  class OutgoingMessage ()
    extends typingsSlinky.node.httpMod.OutgoingMessage
  
  @js.native
  class Server ()
    extends typingsSlinky.node.httpMod.Server
  
  @js.native
  class ServerResponse protected ()
    extends typingsSlinky.node.httpMod.ServerResponse {
    def this(req: typingsSlinky.node.httpMod.IncomingMessage) = this()
  }
  
  var METHODS: js.Array[String] = js.native
  var STATUS_CODES: StringDictionary[js.UndefOr[String]] with NumberDictionary[js.UndefOr[String]] = js.native
  @JSName("createServer")
  var createServer_Original: js.Function0[typingsSlinky.node.httpMod.Server] = js.native
  var globalAgent: typingsSlinky.node.httpMod.Agent = js.native
  var maxHeaderSize: Double = js.native
  def createServer(): typingsSlinky.node.httpMod.Server = js.native
  def get(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def get(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def get(options: String): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def get(
    options: String,
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def request(options: RequestOptions with FollowOptions[RequestOptions]): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def request(
    options: RequestOptions with FollowOptions[RequestOptions],
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def request(options: String): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  def request(
    options: String,
    callback: js.Function1[/* res */ typingsSlinky.node.httpMod.IncomingMessage with FollowResponse, Unit]
  ): RedirectableRequest[
    typingsSlinky.node.httpMod.ClientRequest, 
    typingsSlinky.node.httpMod.IncomingMessage
  ] = js.native
  @js.native
  object Agent
    extends TopLevel[Instantiable0[typingsSlinky.node.httpMod.Agent]]
  
  @js.native
  object ClientRequest
    extends TopLevel[Instantiable1[/* url */ String, typingsSlinky.node.httpMod.ClientRequest]]
  
  @js.native
  object IncomingMessage
    extends TopLevel[Instantiable1[/* socket */ Socket, typingsSlinky.node.httpMod.IncomingMessage]]
  
  @js.native
  object OutgoingMessage
    extends TopLevel[Instantiable0[typingsSlinky.node.httpMod.OutgoingMessage]]
  
  @js.native
  object Server
    extends TopLevel[Instantiable0[typingsSlinky.node.httpMod.Server]]
  
  @js.native
  object ServerResponse
    extends TopLevel[
          Instantiable1[
            /* req */ typingsSlinky.node.httpMod.IncomingMessage, 
            typingsSlinky.node.httpMod.ServerResponse
          ]
        ]
  
}

