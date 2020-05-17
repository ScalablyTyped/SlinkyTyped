package typingsSlinky.mitm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HttpCallback = js.Function2[
    /* request */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* response */ typingsSlinky.node.httpMod.ServerResponse, 
    scala.Unit
  ]
  type SocketConnectCallback = js.Function2[
    /* socket */ typingsSlinky.mitm.mod.BypassableSocket, 
    /* opts */ typingsSlinky.mitm.mod.SocketOptions, 
    scala.Unit
  ]
  type SocketConnectionCallback = js.Function2[
    /* socket */ typingsSlinky.node.netMod.Socket, 
    /* opts */ typingsSlinky.mitm.mod.SocketOptions, 
    scala.Unit
  ]
}
