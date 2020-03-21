package typingsSlinky.nodeRsa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeRsa.nodeRsaStrings.ripemd160
  - typingsSlinky.nodeRsa.nodeRsaStrings.md4
  - typingsSlinky.nodeRsa.nodeRsaStrings.md5
  - typingsSlinky.nodeRsa.nodeRsaStrings.sha1
  - typingsSlinky.nodeRsa.nodeRsaStrings.sha224
  - typingsSlinky.nodeRsa.nodeRsaStrings.sha256
  - typingsSlinky.nodeRsa.nodeRsaStrings.sha384
  - typingsSlinky.nodeRsa.nodeRsaStrings.sha512
*/
trait HashingAlgorithm extends js.Object

object HashingAlgorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md4: typingsSlinky.nodeRsa.nodeRsaStrings.md4 = this.cast("md4")
  @scala.inline
  def md5: typingsSlinky.nodeRsa.nodeRsaStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typingsSlinky.nodeRsa.nodeRsaStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def sha1: typingsSlinky.nodeRsa.nodeRsaStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsSlinky.nodeRsa.nodeRsaStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsSlinky.nodeRsa.nodeRsaStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsSlinky.nodeRsa.nodeRsaStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsSlinky.nodeRsa.nodeRsaStrings.sha512 = this.cast("sha512")
}

