package typingsSlinky.mitm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mitmMod {
  import typingsSlinky.node.httpMod.IncomingMessage
  import typingsSlinky.node.httpMod.ServerResponse
  import typingsSlinky.node.netMod.Socket

  type Callback = SocketConnectCallback | SocketConnectionCallback | HttpCallback
  type HttpCallback = js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]
  type SocketConnectCallback = js.Function2[/* socket */ BypassableSocket, /* opts */ SocketOptions, Unit]
  type SocketConnectionCallback = js.Function2[/* socket */ Socket, /* opts */ SocketOptions, Unit]
}
