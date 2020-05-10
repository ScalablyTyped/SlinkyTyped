package typingsSlinky.rascal.mod

import typingsSlinky.amqplib.propertiesMod.Message
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.rascal.rascalStrings.`return`
import typingsSlinky.rascal.rascalStrings.error
import typingsSlinky.rascal.rascalStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishEventemitter extends EventEmitter {
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* messageId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_return(event: `return`, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, listener: js.Function1[/* messageId */ String, Unit]): this.type = js.native
}

