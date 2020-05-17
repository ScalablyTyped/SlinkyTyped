package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist
  - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdMalformed
  - typingsSlinky.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState
  - typingsSlinky.awsSdk.awsSdkStrings.unexpectedError
  - java.lang.String
*/
trait CancelBatchErrorCode extends js.Object

object CancelBatchErrorCode {
  @scala.inline
  def fleetRequestIdDoesNotExist: typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist = "fleetRequestIdDoesNotExist".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist]
  @scala.inline
  def fleetRequestIdMalformed: typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdMalformed = "fleetRequestIdMalformed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetRequestIdMalformed]
  @scala.inline
  def fleetRequestNotInCancellableState: typingsSlinky.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState = "fleetRequestNotInCancellableState".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState]
  @scala.inline
  def unexpectedError: typingsSlinky.awsSdk.awsSdkStrings.unexpectedError = "unexpectedError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.unexpectedError]
  @scala.inline
  implicit def apply(value: java.lang.String): CancelBatchErrorCode = value.asInstanceOf[CancelBatchErrorCode]
}

