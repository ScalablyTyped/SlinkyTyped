package typingsSlinky.mitm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = typingsSlinky.mitm.mod.SocketConnectCallback | typingsSlinky.mitm.mod.SocketConnectionCallback | typingsSlinky.mitm.mod.HttpCallback
  
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
