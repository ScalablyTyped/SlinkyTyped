package typingsSlinky.bleno.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bleno.blenoStrings.poweredOn
  - typings.bleno.blenoStrings.poweredOff
  - typings.bleno.blenoStrings.unauthorized
  - typings.bleno.blenoStrings.unsupported
  - typings.bleno.blenoStrings.unknown
  - typings.bleno.blenoStrings.resetting
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

