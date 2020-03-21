package typingsSlinky.createHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.createHash.createHashStrings.md5
  - typingsSlinky.createHash.createHashStrings.rmd160
  - typingsSlinky.createHash.createHashStrings.ripemd160
  - typingsSlinky.createHash.createHashStrings.sha
  - typingsSlinky.createHash.createHashStrings.sha1
  - typingsSlinky.createHash.createHashStrings.sha224
  - typingsSlinky.createHash.createHashStrings.sha256
  - typingsSlinky.createHash.createHashStrings.sha384
  - typingsSlinky.createHash.createHashStrings.sha512
*/
trait algorithm extends js.Object

object algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typingsSlinky.createHash.createHashStrings.md5 = this.cast("md5")
  @scala.inline
  def ripemd160: typingsSlinky.createHash.createHashStrings.ripemd160 = this.cast("ripemd160")
  @scala.inline
  def rmd160: typingsSlinky.createHash.createHashStrings.rmd160 = this.cast("rmd160")
  @scala.inline
  def sha: typingsSlinky.createHash.createHashStrings.sha = this.cast("sha")
  @scala.inline
  def sha1: typingsSlinky.createHash.createHashStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha224: typingsSlinky.createHash.createHashStrings.sha224 = this.cast("sha224")
  @scala.inline
  def sha256: typingsSlinky.createHash.createHashStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha384: typingsSlinky.createHash.createHashStrings.sha384 = this.cast("sha384")
  @scala.inline
  def sha512: typingsSlinky.createHash.createHashStrings.sha512 = this.cast("sha512")
}

