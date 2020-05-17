package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait DomainStatus extends js.Object

object DomainStatus {
  @scala.inline
  def PENDING_VALIDATION: typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION = "PENDING_VALIDATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING_VALIDATION]
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): DomainStatus = value.asInstanceOf[DomainStatus]
}

