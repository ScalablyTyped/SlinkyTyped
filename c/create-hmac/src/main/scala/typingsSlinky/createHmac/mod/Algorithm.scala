package typingsSlinky.createHmac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.createHmac.createHmacStrings.rmd160
  - typingsSlinky.createHmac.createHmacStrings.ripemd160
  - typingsSlinky.createHmac.createHmacStrings.md5
  - typingsSlinky.createHmac.createHmacStrings.sha
  - typingsSlinky.createHmac.createHmacStrings.sha1
  - typingsSlinky.createHmac.createHmacStrings.sha224
  - typingsSlinky.createHmac.createHmacStrings.sha256
  - typingsSlinky.createHmac.createHmacStrings.sha384
  - typingsSlinky.createHmac.createHmacStrings.sha512
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typingsSlinky.createHmac.createHmacStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typingsSlinky.createHmac.createHmacStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def rmd160: typingsSlinky.createHmac.createHmacStrings.rmd160 = this.cast("rmd160")
  @scala.inline
  def sha: typingsSlinky.createHmac.createHmacStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typingsSlinky.createHmac.createHmacStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsSlinky.createHmac.createHmacStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsSlinky.createHmac.createHmacStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsSlinky.createHmac.createHmacStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsSlinky.createHmac.createHmacStrings.sha512 = this.cast("sha512")
}

