package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS
  - typingsSlinky.awsSdk.awsSdkStrings.SSE_S3
  - typingsSlinky.awsSdk.awsSdkStrings.NO_ENCRYPTION
  - java.lang.String
*/
trait S3ObjectEncryptionType extends js.Object

object S3ObjectEncryptionType {
  @scala.inline
  def SSE_KMS: typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS = "SSE_KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSE_KMS]
  @scala.inline
  def SSE_S3: typingsSlinky.awsSdk.awsSdkStrings.SSE_S3 = "SSE_S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SSE_S3]
  @scala.inline
  def NO_ENCRYPTION: typingsSlinky.awsSdk.awsSdkStrings.NO_ENCRYPTION = "NO_ENCRYPTION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NO_ENCRYPTION]
  @scala.inline
  implicit def apply(value: String): S3ObjectEncryptionType = value.asInstanceOf[S3ObjectEncryptionType]
}

