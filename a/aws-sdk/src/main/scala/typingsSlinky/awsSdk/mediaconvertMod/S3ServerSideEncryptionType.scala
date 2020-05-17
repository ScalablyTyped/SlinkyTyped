package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SERVER_SIDE_ENCRYPTION_S3
  - typingsSlinky.awsSdk.awsSdkStrings.SERVER_SIDE_ENCRYPTION_KMS
  - java.lang.String
*/
trait S3ServerSideEncryptionType extends js.Object

object S3ServerSideEncryptionType {
  @scala.inline
  def SERVER_SIDE_ENCRYPTION_S3: typingsSlinky.awsSdk.awsSdkStrings.SERVER_SIDE_ENCRYPTION_S3 = "SERVER_SIDE_ENCRYPTION_S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SERVER_SIDE_ENCRYPTION_S3]
  @scala.inline
  def SERVER_SIDE_ENCRYPTION_KMS: typingsSlinky.awsSdk.awsSdkStrings.SERVER_SIDE_ENCRYPTION_KMS = "SERVER_SIDE_ENCRYPTION_KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SERVER_SIDE_ENCRYPTION_KMS]
  @scala.inline
  implicit def apply(value: String): S3ServerSideEncryptionType = value.asInstanceOf[S3ServerSideEncryptionType]
}

