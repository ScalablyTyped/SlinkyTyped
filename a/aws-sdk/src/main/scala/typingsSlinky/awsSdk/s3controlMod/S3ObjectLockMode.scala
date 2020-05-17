package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
  - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
  - java.lang.String
*/
trait S3ObjectLockMode extends js.Object

object S3ObjectLockMode {
  @scala.inline
  def COMPLIANCE: typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE = "COMPLIANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE]
  @scala.inline
  def GOVERNANCE: typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE = "GOVERNANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE]
  @scala.inline
  implicit def apply(value: String): S3ObjectLockMode = value.asInstanceOf[S3ObjectLockMode]
}

