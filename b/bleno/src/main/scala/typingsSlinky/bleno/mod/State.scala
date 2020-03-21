package typingsSlinky.bleno.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.bleno.blenoStrings.poweredOn
  - typingsSlinky.bleno.blenoStrings.poweredOff
  - typingsSlinky.bleno.blenoStrings.unauthorized
  - typingsSlinky.bleno.blenoStrings.unsupported
  - typingsSlinky.bleno.blenoStrings.unknown
  - typingsSlinky.bleno.blenoStrings.resetting
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def poweredOff: typingsSlinky.bleno.blenoStrings.poweredOff = this.cast("poweredOff")
  @scala.inline
  def poweredOn: typingsSlinky.bleno.blenoStrings.poweredOn = this.cast("poweredOn")
  @scala.inline
  def resetting: typingsSlinky.bleno.blenoStrings.resetting = this.cast("resetting")
  @scala.inline
  def unauthorized: typingsSlinky.bleno.blenoStrings.unauthorized = this.cast("unauthorized")
  @scala.inline
  def unknown: typingsSlinky.bleno.blenoStrings.unknown = this.cast("unknown")
  @scala.inline
  def unsupported: typingsSlinky.bleno.blenoStrings.unsupported = this.cast("unsupported")
}

