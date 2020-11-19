package typingsSlinky.nes.mod.hapiAugmentingMod

import typingsSlinky.nes.mod.ServerBroadcastOptions
import typingsSlinky.nes.mod.ServerEachSocketOptions
import typingsSlinky.nes.mod.ServerPublishOptions
import typingsSlinky.nes.mod.ServerSubscriptionOptions
import typingsSlinky.nes.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends js.Object {
  
  def broadcast(message: js.Any): Unit = js.native
  def broadcast(message: js.Any, options: ServerBroadcastOptions): Unit = js.native
  
  def eachSocket(each: js.Function1[/* socket */ Socket, Unit]): Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ Socket, Unit], options: ServerEachSocketOptions): Unit = js.native
  
  def publish(path: String, message: js.Any): Unit = js.native
  def publish(path: String, message: js.Any, options: ServerPublishOptions): Unit = js.native
  
  def subscription(path: String): Unit = js.native
  def subscription(path: String, options: ServerSubscriptionOptions): Unit = js.native
}
