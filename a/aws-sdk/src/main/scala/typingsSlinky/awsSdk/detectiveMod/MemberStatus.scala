package typingsSlinky.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.INVITED
  - typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_FAILED
  - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
trait MemberStatus extends js.Object

object MemberStatus {
  @scala.inline
  def INVITED: typingsSlinky.awsSdk.awsSdkStrings.INVITED = "INVITED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INVITED]
  @scala.inline
  def VERIFICATION_IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS = "VERIFICATION_IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS]
  @scala.inline
  def VERIFICATION_FAILED: typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_FAILED = "VERIFICATION_FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VERIFICATION_FAILED]
  @scala.inline
  def ENABLED: typingsSlinky.awsSdk.awsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ENABLED]
  @scala.inline
  implicit def apply(value: String): MemberStatus = value.asInstanceOf[MemberStatus]
}

