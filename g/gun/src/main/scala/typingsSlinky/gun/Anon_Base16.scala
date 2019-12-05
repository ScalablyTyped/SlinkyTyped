package typingsSlinky.gun

import typingsSlinky.gun.gunStrings.PBKDF2
import typingsSlinky.gun.gunStrings.`SHA-256`
import typingsSlinky.gun.gunStrings.base16
import typingsSlinky.gun.gunStrings.base32
import typingsSlinky.gun.gunStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base16 extends js.Object {
  var encode: base64 | base32 | base16
  var hash: String
  /** iterations to use on subtle.deriveBits */
  var iterations: Double
  var length: js.Any
  var name: `SHA-256` | PBKDF2
  var salt: js.Any
}

object Anon_Base16 {
  @scala.inline
  def apply(
    encode: base64 | base32 | base16,
    hash: String,
    iterations: Double,
    length: js.Any,
    name: `SHA-256` | PBKDF2,
    salt: js.Any
  ): Anon_Base16 = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Base16]
  }
}

