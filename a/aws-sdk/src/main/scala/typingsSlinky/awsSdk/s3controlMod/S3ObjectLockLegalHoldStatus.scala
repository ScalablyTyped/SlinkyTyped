package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.OFF
  - typingsSlinky.awsSdk.awsSdkStrings.ON
  - java.lang.String
*/
trait S3ObjectLockLegalHoldStatus extends js.Object

object S3ObjectLockLegalHoldStatus {
  @scala.inline
  def OFF: typingsSlinky.awsSdk.awsSdkStrings.OFF = "OFF".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.OFF]
  @scala.inline
  def ON: typingsSlinky.awsSdk.awsSdkStrings.ON = "ON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ON]
  @scala.inline
  implicit def apply(value: String): S3ObjectLockLegalHoldStatus = value.asInstanceOf[S3ObjectLockLegalHoldStatus]
}

