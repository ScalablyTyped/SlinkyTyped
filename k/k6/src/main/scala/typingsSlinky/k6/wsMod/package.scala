package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wsMod {
  
  type CloseEventHandler = js.Function1[/* code */ scala.Double, scala.Unit]
  
  type ErrorEventHandler = js.Function1[/* error */ typingsSlinky.k6.wsMod.WebSocketError, scala.Unit]
  
  type EventHandler[ET /* <: typingsSlinky.k6.wsMod.EventType */] = typingsSlinky.k6.wsMod.PongEventHandler | typingsSlinky.k6.wsMod.PingEventHandler | typingsSlinky.k6.wsMod.OpenEventHandler | typingsSlinky.k6.wsMod.MessageEventHandler | typingsSlinky.k6.wsMod.ErrorEventHandler | typingsSlinky.k6.wsMod.CloseEventHandler
  
  type Executor = js.Function1[/* socket */ typingsSlinky.k6.wsMod.Socket, scala.Unit]
  
  type MessageEventHandler = js.Function1[/* message */ java.lang.String, scala.Unit]
  
  type OpenEventHandler = js.Function0[scala.Unit]
  
  type PingEventHandler = js.Function0[scala.Unit]
  
  type PongEventHandler = js.Function0[scala.Unit]
  
  type TimerHandler = js.Function0[scala.Unit]
}
