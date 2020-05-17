package typingsSlinky.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.RSA
  - typingsSlinky.awsSdk.awsSdkStrings.ECDSA
  - java.lang.String
*/
trait EncryptionAlgorithm extends js.Object

object EncryptionAlgorithm {
  @scala.inline
  def RSA: typingsSlinky.awsSdk.awsSdkStrings.RSA = "RSA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RSA]
  @scala.inline
  def ECDSA: typingsSlinky.awsSdk.awsSdkStrings.ECDSA = "ECDSA".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ECDSA]
  @scala.inline
  implicit def apply(value: java.lang.String): EncryptionAlgorithm = value.asInstanceOf[EncryptionAlgorithm]
}

