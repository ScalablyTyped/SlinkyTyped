package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
  - typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
trait CloudWatchEncryptionMode extends js.Object

object CloudWatchEncryptionMode {
  @scala.inline
  def DISABLED: typingsSlinky.awsSdk.awsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DISABLED]
  @scala.inline
  def `SSE-KMS`: typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS` = "SSE-KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.`SSE-KMS`]
  @scala.inline
  implicit def apply(value: String): CloudWatchEncryptionMode = value.asInstanceOf[CloudWatchEncryptionMode]
}

