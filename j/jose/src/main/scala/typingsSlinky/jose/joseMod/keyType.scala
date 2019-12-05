package typingsSlinky.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.RSA
  - typings.jose.joseStrings.EC
  - typings.jose.joseStrings.OKP
  - typings.jose.joseStrings.oct
*/
trait keyType extends js.Object

object keyType {
  @scala.inline
  def EC: typingsSlinky.jose.joseStrings.EC = this.cast("EC")
  @scala.inline
  def OKP: typingsSlinky.jose.joseStrings.OKP = this.cast("OKP")
  @scala.inline
  def RSA: typingsSlinky.jose.joseStrings.RSA = this.cast("RSA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def oct: typingsSlinky.jose.joseStrings.oct = this.cast("oct")
}

