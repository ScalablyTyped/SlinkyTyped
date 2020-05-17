package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.awsColonkms
  - typingsSlinky.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
trait EncryptionType extends js.Object

object EncryptionType {
  @scala.inline
  def awsColonkms: typingsSlinky.awsSdk.awsSdkStrings.awsColonkms = "aws:kms".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.awsColonkms]
  @scala.inline
  def AES256: typingsSlinky.awsSdk.awsSdkStrings.AES256 = "AES256".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES256]
  @scala.inline
  implicit def apply(value: String): EncryptionType = value.asInstanceOf[EncryptionType]
}

