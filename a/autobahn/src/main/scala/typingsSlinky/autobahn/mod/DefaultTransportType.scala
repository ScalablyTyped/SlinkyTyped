package typingsSlinky.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.autobahn.autobahnStrings.websocket
  - typingsSlinky.autobahn.autobahnStrings.longpoll
  - typingsSlinky.autobahn.autobahnStrings.rawsocket
*/
trait DefaultTransportType extends js.Object

object DefaultTransportType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def longpoll: typingsSlinky.autobahn.autobahnStrings.longpoll = this.cast("longpoll")
  @scala.inline
  def rawsocket: typingsSlinky.autobahn.autobahnStrings.rawsocket = this.cast("rawsocket")
  @scala.inline
  def websocket: typingsSlinky.autobahn.autobahnStrings.websocket = this.cast("websocket")
}

