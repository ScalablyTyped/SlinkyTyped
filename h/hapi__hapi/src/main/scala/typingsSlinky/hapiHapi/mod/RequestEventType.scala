package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapiHapi.hapiHapiStrings.peek
  - typingsSlinky.hapiHapi.hapiHapiStrings.finish
  - typingsSlinky.hapiHapi.hapiHapiStrings.disconnect
*/
trait RequestEventType extends js.Object

object RequestEventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disconnect: typingsSlinky.hapiHapi.hapiHapiStrings.disconnect = this.cast("disconnect")
  @scala.inline
  def finish: typingsSlinky.hapiHapi.hapiHapiStrings.finish = this.cast("finish")
  @scala.inline
  def peek: typingsSlinky.hapiHapi.hapiHapiStrings.peek = this.cast("peek")
}

