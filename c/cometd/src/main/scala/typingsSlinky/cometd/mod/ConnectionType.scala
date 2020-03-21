package typingsSlinky.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cometd.cometdStrings.`long-polling`
  - typingsSlinky.cometd.cometdStrings.`callback-polling`
  - typingsSlinky.cometd.cometdStrings.iframe
  - typingsSlinky.cometd.cometdStrings.flash
*/
trait ConnectionType extends js.Object

object ConnectionType {
  @scala.inline
  def `callback-polling`: typingsSlinky.cometd.cometdStrings.`callback-polling` = this.cast("callback-polling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def flash: typingsSlinky.cometd.cometdStrings.flash = this.cast("flash")
  @scala.inline
  def iframe: typingsSlinky.cometd.cometdStrings.iframe = this.cast("iframe")
  @scala.inline
  def `long-polling`: typingsSlinky.cometd.cometdStrings.`long-polling` = this.cast("long-polling")
}

