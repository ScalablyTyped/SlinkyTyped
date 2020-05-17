package typingsSlinky.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT
  - typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1
  - typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256
  - java.lang.String
*/
trait EncryptionAlgorithmSpec extends js.Object

object EncryptionAlgorithmSpec {
  @scala.inline
  def SYMMETRIC_DEFAULT: typingsSlinky.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT = "SYMMETRIC_DEFAULT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SYMMETRIC_DEFAULT]
  @scala.inline
  def RSAES_OAEP_SHA_1: typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1 = "RSAES_OAEP_SHA_1".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_1]
  @scala.inline
  def RSAES_OAEP_SHA_256: typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256 = "RSAES_OAEP_SHA_256".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RSAES_OAEP_SHA_256]
  @scala.inline
  implicit def apply(value: String): EncryptionAlgorithmSpec = value.asInstanceOf[EncryptionAlgorithmSpec]
}

