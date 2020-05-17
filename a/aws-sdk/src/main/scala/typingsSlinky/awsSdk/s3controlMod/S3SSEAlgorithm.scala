package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.AES256
  - typingsSlinky.awsSdk.awsSdkStrings.KMS
  - java.lang.String
*/
trait S3SSEAlgorithm extends js.Object

object S3SSEAlgorithm {
  @scala.inline
  def AES256: typingsSlinky.awsSdk.awsSdkStrings.AES256 = "AES256".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.AES256]
  @scala.inline
  def KMS: typingsSlinky.awsSdk.awsSdkStrings.KMS = "KMS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.KMS]
  @scala.inline
  implicit def apply(value: String): S3SSEAlgorithm = value.asInstanceOf[S3SSEAlgorithm]
}

