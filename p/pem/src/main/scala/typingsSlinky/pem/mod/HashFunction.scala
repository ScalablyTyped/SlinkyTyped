package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pem.pemStrings.md5
  - typingsSlinky.pem.pemStrings.sha1
  - typingsSlinky.pem.pemStrings.sha256
  - java.lang.String
*/
trait HashFunction extends js.Object

object HashFunction {
  @scala.inline
  def md5: typingsSlinky.pem.pemStrings.md5 = "md5".asInstanceOf[typingsSlinky.pem.pemStrings.md5]
  @scala.inline
  def sha1: typingsSlinky.pem.pemStrings.sha1 = "sha1".asInstanceOf[typingsSlinky.pem.pemStrings.sha1]
  @scala.inline
  def sha256: typingsSlinky.pem.pemStrings.sha256 = "sha256".asInstanceOf[typingsSlinky.pem.pemStrings.sha256]
  @scala.inline
  implicit def apply(value: String): HashFunction = value.asInstanceOf[HashFunction]
}

