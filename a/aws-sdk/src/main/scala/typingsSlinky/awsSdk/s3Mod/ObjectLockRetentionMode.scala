package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE
  - typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE
  - java.lang.String
*/
trait ObjectLockRetentionMode extends js.Object

object ObjectLockRetentionMode {
  @scala.inline
  def GOVERNANCE: typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE = "GOVERNANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GOVERNANCE]
  @scala.inline
  def COMPLIANCE: typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE = "COMPLIANCE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COMPLIANCE]
  @scala.inline
  implicit def apply(value: String): ObjectLockRetentionMode = value.asInstanceOf[ObjectLockRetentionMode]
}

