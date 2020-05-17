package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SHA1
  - typingsSlinky.awsSdk.awsSdkStrings.SHA256
  - java.lang.String
*/
trait HashAlgorithm extends js.Object

object HashAlgorithm {
  @scala.inline
  def SHA1: typingsSlinky.awsSdk.awsSdkStrings.SHA1 = "SHA1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHA1]
  @scala.inline
  def SHA256: typingsSlinky.awsSdk.awsSdkStrings.SHA256 = "SHA256".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SHA256]
  @scala.inline
  implicit def apply(value: java.lang.String): HashAlgorithm = value.asInstanceOf[HashAlgorithm]
}

