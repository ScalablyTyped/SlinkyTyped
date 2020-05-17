package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.fleetIdDoesNotExist
  - typingsSlinky.awsSdk.awsSdkStrings.fleetIdMalformed
  - typingsSlinky.awsSdk.awsSdkStrings.fleetNotInDeletableState
  - typingsSlinky.awsSdk.awsSdkStrings.unexpectedError
  - java.lang.String
*/
trait DeleteFleetErrorCode extends js.Object

object DeleteFleetErrorCode {
  @scala.inline
  def fleetIdDoesNotExist: typingsSlinky.awsSdk.awsSdkStrings.fleetIdDoesNotExist = "fleetIdDoesNotExist".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetIdDoesNotExist]
  @scala.inline
  def fleetIdMalformed: typingsSlinky.awsSdk.awsSdkStrings.fleetIdMalformed = "fleetIdMalformed".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetIdMalformed]
  @scala.inline
  def fleetNotInDeletableState: typingsSlinky.awsSdk.awsSdkStrings.fleetNotInDeletableState = "fleetNotInDeletableState".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.fleetNotInDeletableState]
  @scala.inline
  def unexpectedError: typingsSlinky.awsSdk.awsSdkStrings.unexpectedError = "unexpectedError".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.unexpectedError]
  @scala.inline
  implicit def apply(value: java.lang.String): DeleteFleetErrorCode = value.asInstanceOf[DeleteFleetErrorCode]
}

