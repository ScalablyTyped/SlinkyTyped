package typingsSlinky.jackrabbit.mod.jackrabbit

import typingsSlinky.amqplib.mod.Connection
import typingsSlinky.amqplib.propertiesMod.Options.AssertExchange
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exchange extends EventEmitter {
  
  def connect(con: Connection): Exchange = js.native
  
  var name: String = js.native
  
  var options: AssertExchange = js.native
  
  def publish(message: js.Any): Exchange = js.native
  def publish(message: js.Any, options: PublishOptions): Exchange = js.native
  
  def queue(options: QueueOptions): Queue = js.native
  
  var `type`: exchangeType = js.native
}
