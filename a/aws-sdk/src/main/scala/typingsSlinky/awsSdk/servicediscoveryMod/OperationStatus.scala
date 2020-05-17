package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.SUCCESS
  - typingsSlinky.awsSdk.awsSdkStrings.FAIL
  - java.lang.String
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def SUBMITTED: typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUBMITTED]
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def SUCCESS: typingsSlinky.awsSdk.awsSdkStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SUCCESS]
  @scala.inline
  def FAIL: typingsSlinky.awsSdk.awsSdkStrings.FAIL = "FAIL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FAIL]
  @scala.inline
  implicit def apply(value: String): OperationStatus = value.asInstanceOf[OperationStatus]
}

