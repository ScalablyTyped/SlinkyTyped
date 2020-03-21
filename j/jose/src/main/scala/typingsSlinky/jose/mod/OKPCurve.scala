package typingsSlinky.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jose.joseStrings.Ed25519
  - typingsSlinky.jose.joseStrings.Ed448
  - typingsSlinky.jose.joseStrings.X25519
  - typingsSlinky.jose.joseStrings.X448
*/
trait OKPCurve extends js.Object

object OKPCurve {
  @scala.inline
  def Ed25519: typingsSlinky.jose.joseStrings.Ed25519 = this.cast("Ed25519")
  @scala.inline
  def Ed448: typingsSlinky.jose.joseStrings.Ed448 = this.cast("Ed448")
  @scala.inline
  def X25519: typingsSlinky.jose.joseStrings.X25519 = this.cast("X25519")
  @scala.inline
  def X448: typingsSlinky.jose.joseStrings.X448 = this.cast("X448")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

