package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SSE_S3
  - typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS
  - typingsSlinky.awsSdk.awsSdkStrings.CSE_KMS
  - java.lang.String
*/
trait EncryptionOption extends js.Object

object EncryptionOption {
  @scala.inline
  def SSE_S3: typingsSlinky.awsSdk.awsSdkStrings.SSE_S3 = "SSE_S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSE_S3]
  @scala.inline
  def SSE_KMS: typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS = "SSE_KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS]
  @scala.inline
  def CSE_KMS: typingsSlinky.awsSdk.awsSdkStrings.CSE_KMS = "CSE_KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CSE_KMS]
  @scala.inline
  implicit def apply(value: java.lang.String): EncryptionOption = value.asInstanceOf[EncryptionOption]
}

