package typingsSlinky.hapiNes.clientMod

import typingsSlinky.hapiNes.anon.Code
import typingsSlinky.hapiNes.clientMod.Client.ClientConnectOptions
import typingsSlinky.hapiNes.clientMod.Client.ClientOptions
import typingsSlinky.hapiNes.clientMod.Client.ClientRequestOptions
import typingsSlinky.hapiNes.clientMod.Client.Handler
import typingsSlinky.hapiNes.hapiNesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/nes/lib/client", "Client")
@js.native
class Client_ protected () extends js.Object {
  def this(url: String) = this()
  def this(url: String, options: ClientOptions) = this()
  
  def connect(): js.Promise[_] = js.native
  def connect(options: ClientConnectOptions): js.Promise[_] = js.native
  
  def disconnect(): js.Promise[_] = js.native
  
  var id: js.Any = js.native
  
  def message(message: js.Any): js.Promise[_] = js.native
  
  def onConnect(): Unit = js.native
  
  def onDisconnect(willReconnect: Boolean, log: Code): Unit = js.native
  
  def onError(err: js.Any): Unit = js.native
  
  def onUpdate(message: js.Any): Unit = js.native
  
  def overrideReconnectionAuth(auth: js.Any): Unit = js.native
  
  def reauthenticate(auth: js.Any): js.Promise[`true`] = js.native
  
    // can be `null | number` but also the "socket" value from websocket message data.
  def request(options: String): js.Promise[_] = js.native
  def request(options: ClientRequestOptions): js.Promise[_] = js.native
  
  def subscribe(path: String, handler: Handler): js.Promise[_] = js.native
  
  def subscriptions(): js.Array[String] = js.native
  
  def unsubscribe(path: String): js.Promise[_] = js.native
  def unsubscribe(path: String, handler: Handler): js.Promise[_] = js.native
}
