package typingsSlinky.reactAdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAdal.reactAdalStrings.LOGIN
  - typingsSlinky.reactAdal.reactAdalStrings.RENEW_TOKEN
  - typingsSlinky.reactAdal.reactAdalStrings.UNKNOWN
*/
trait RequestType extends js.Object

object RequestType {
  @scala.inline
  def LOGIN: typingsSlinky.reactAdal.reactAdalStrings.LOGIN = this.cast("LOGIN")
  @scala.inline
  def RENEW_TOKEN: typingsSlinky.reactAdal.reactAdalStrings.RENEW_TOKEN = this.cast("RENEW_TOKEN")
  @scala.inline
  def UNKNOWN: typingsSlinky.reactAdal.reactAdalStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

