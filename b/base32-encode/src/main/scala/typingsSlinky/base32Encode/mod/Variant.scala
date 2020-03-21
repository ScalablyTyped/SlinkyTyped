package typingsSlinky.base32Encode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.base32Encode.base32EncodeStrings.RFC3548
  - typingsSlinky.base32Encode.base32EncodeStrings.RFC4648
  - typingsSlinky.base32Encode.base32EncodeStrings.`RFC4648-HEX`
  - typingsSlinky.base32Encode.base32EncodeStrings.Crockford
*/
trait Variant extends js.Object

object Variant {
  @scala.inline
  def Crockford: typingsSlinky.base32Encode.base32EncodeStrings.Crockford = this.cast("Crockford")
  @scala.inline
  def RFC3548: typingsSlinky.base32Encode.base32EncodeStrings.RFC3548 = this.cast("RFC3548")
  @scala.inline
  def RFC4648: typingsSlinky.base32Encode.base32EncodeStrings.RFC4648 = this.cast("RFC4648")
  @scala.inline
  def `RFC4648-HEX`: typingsSlinky.base32Encode.base32EncodeStrings.`RFC4648-HEX` = this.cast("RFC4648-HEX")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

