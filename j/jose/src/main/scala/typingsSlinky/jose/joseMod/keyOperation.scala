package typingsSlinky.jose.joseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jose.joseStrings.sign
  - typings.jose.joseStrings.verify
  - typings.jose.joseStrings.encrypt
  - typings.jose.joseStrings.decrypt
  - typings.jose.joseStrings.wrapKey
  - typings.jose.joseStrings.unwrapKey
  - typings.jose.joseStrings.deriveKey
*/
trait keyOperation extends js.Object

object keyOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def decrypt: typingsSlinky.jose.joseStrings.decrypt = this.cast("decrypt")
  @scala.inline
  def deriveKey: typingsSlinky.jose.joseStrings.deriveKey = this.cast("deriveKey")
  @scala.inline
  def encrypt: typingsSlinky.jose.joseStrings.encrypt = this.cast("encrypt")
  @scala.inline
  def sign: typingsSlinky.jose.joseStrings.sign = this.cast("sign")
  @scala.inline
  def unwrapKey: typingsSlinky.jose.joseStrings.unwrapKey = this.cast("unwrapKey")
  @scala.inline
  def verify: typingsSlinky.jose.joseStrings.verify = this.cast("verify")
  @scala.inline
  def wrapKey: typingsSlinky.jose.joseStrings.wrapKey = this.cast("wrapKey")
}

