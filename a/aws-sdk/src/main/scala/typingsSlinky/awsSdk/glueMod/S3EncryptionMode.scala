package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
  - typingsSlinky.awsSdk.awsSdkStrings.`SSE-S3`
  - java.lang.String
*/
trait S3EncryptionMode extends js.Object

object S3EncryptionMode {
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  def `SSE-KMS`: typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS` = "SSE-KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`]
  @scala.inline
  def `SSE-S3`: typingsSlinky.awsSdk.awsSdkStrings.`SSE-S3` = "SSE-S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`SSE-S3`]
  @scala.inline
  implicit def apply(value: String): S3EncryptionMode = value.asInstanceOf[S3EncryptionMode]
}

