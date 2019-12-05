package typingsSlinky.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.sig
  - typings.jose.joseStrings.enc
*/
trait use extends js.Object

object use {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enc: typingsSlinky.jose.joseStrings.enc = this.cast("enc")
  @scala.inline
  def sig: typingsSlinky.jose.joseStrings.sig = this.cast("sig")
}

