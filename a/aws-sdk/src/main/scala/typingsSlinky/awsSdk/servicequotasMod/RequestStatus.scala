package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.PENDING
  - typingsSlinky.awsSdk.awsSdkStrings.CASE_OPENED
  - typingsSlinky.awsSdk.awsSdkStrings.APPROVED
  - typingsSlinky.awsSdk.awsSdkStrings.DENIED
  - typingsSlinky.awsSdk.awsSdkStrings.CASE_CLOSED
  - java.lang.String
*/
trait RequestStatus extends js.Object

object RequestStatus {
  @scala.inline
  def PENDING: typingsSlinky.awsSdk.awsSdkStrings.PENDING = "PENDING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PENDING]
  @scala.inline
  def CASE_OPENED: typingsSlinky.awsSdk.awsSdkStrings.CASE_OPENED = "CASE_OPENED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CASE_OPENED]
  @scala.inline
  def APPROVED: typingsSlinky.awsSdk.awsSdkStrings.APPROVED = "APPROVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.APPROVED]
  @scala.inline
  def DENIED: typingsSlinky.awsSdk.awsSdkStrings.DENIED = "DENIED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DENIED]
  @scala.inline
  def CASE_CLOSED: typingsSlinky.awsSdk.awsSdkStrings.CASE_CLOSED = "CASE_CLOSED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CASE_CLOSED]
  @scala.inline
  implicit def apply(value: String): RequestStatus = value.asInstanceOf[RequestStatus]
}

