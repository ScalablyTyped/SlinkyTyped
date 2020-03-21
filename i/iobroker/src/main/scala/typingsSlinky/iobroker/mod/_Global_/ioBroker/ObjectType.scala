package typingsSlinky.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.iobroker.iobrokerStrings.state
  - typingsSlinky.iobroker.iobrokerStrings.channel
  - typingsSlinky.iobroker.iobrokerStrings.device
*/
trait ObjectType extends js.Object

object ObjectType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def channel: typingsSlinky.iobroker.iobrokerStrings.channel = this.cast("channel")
  @scala.inline
  def device: typingsSlinky.iobroker.iobrokerStrings.device = this.cast("device")
  @scala.inline
  def state: typingsSlinky.iobroker.iobrokerStrings.state = this.cast("state")
}

