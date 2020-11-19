package typingsSlinky.protooServer.mod

import typingsSlinky.protooServer.protooServerStrings.close
import typingsSlinky.protooServer.protooServerStrings.notification
import typingsSlinky.protooServer.protooServerStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peer extends js.Object {
  
  def close(): Unit = js.native
  
  var closed: Boolean = js.native
  
  var data: js.Any = js.native
  
  val id: String = js.native
  
  def notify(method: String): js.Promise[Unit] = js.native
  def notify(method: String, data: js.Any): js.Promise[Unit] = js.native
  
  @JSName("on")
  def on_close(eventType: close, callback: EmptyCb): Unit = js.native
  @JSName("on")
  def on_notification(eventType: notification, callback: NotificationCb): Unit = js.native
  @JSName("on")
  def on_request(eventType: request, callback: RequestCb): Unit = js.native
  
  def request(method: String): js.Promise[ProotooResponse] = js.native
  def request(method: String, data: js.Any): js.Promise[ProotooResponse] = js.native
}
