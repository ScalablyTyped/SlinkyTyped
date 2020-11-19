package typingsSlinky.protooClient.mod

import typingsSlinky.protooClient.protooClientStrings.close
import typingsSlinky.protooClient.protooClientStrings.disconnected
import typingsSlinky.protooClient.protooClientStrings.failed
import typingsSlinky.protooClient.protooClientStrings.notification
import typingsSlinky.protooClient.protooClientStrings.open
import typingsSlinky.protooClient.protooClientStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protoo-client", "Peer")
@js.native
class Peer protected () extends js.Object {
  def this(transport: WebSocketTransport) = this()
  
  def close(): Unit = js.native
  
  val closed: Boolean = js.native
  
  val connected: Boolean = js.native
  
  var data: js.Any = js.native
  
  def notify(method: String): js.Promise[_] = js.native
  def notify(method: String, data: js.Any): js.Promise[_] = js.native
  
  @JSName("on")
  def on_close(evt: close, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_disconnected(evt: disconnected, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_failed(evt: failed, handler: js.Function1[/* currentAttempt */ Double, _]): Unit = js.native
  @JSName("on")
  def on_notification(evt: notification, handler: js.Function1[/* notif */ ProtooNotification, _]): Unit = js.native
  @JSName("on")
  def on_open(evt: open, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_request(
    evt: request,
    handler: js.Function3[
      /* request */ ProtooRequest, 
      /* accept */ js.Function1[/* data */ js.UndefOr[ProtooResponse], Unit], 
      /* reject */ js.Function2[
        /* error */ js.UndefOr[js.Error | Double], 
        /* errorReason */ js.UndefOr[String], 
        Unit
      ], 
      _
    ]
  ): Unit = js.native
  
  def request(method: String): js.Promise[_] = js.native
  def request(method: String, data: js.Any): js.Promise[_] = js.native
}
