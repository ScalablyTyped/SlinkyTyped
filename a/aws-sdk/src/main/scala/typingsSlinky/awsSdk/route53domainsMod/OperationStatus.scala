package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
  - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsSlinky.awsSdk.awsSdkStrings.ERROR
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL
  - typingsSlinky.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def SUBMITTED: typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED]
  @scala.inline
  def IN_PROGRESS: typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS]
  @scala.inline
  def ERROR: typingsSlinky.awsSdk.awsSdkStrings.ERROR = "ERROR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ERROR]
  @scala.inline
  def SUCCESSFUL: typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL = "SUCCESSFUL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESSFUL]
  @scala.inline
  def FAILED: typingsSlinky.awsSdk.awsSdkStrings.FAILED = "FAILED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAILED]
  @scala.inline
  implicit def apply(value: java.lang.String): OperationStatus = value.asInstanceOf[OperationStatus]
}

