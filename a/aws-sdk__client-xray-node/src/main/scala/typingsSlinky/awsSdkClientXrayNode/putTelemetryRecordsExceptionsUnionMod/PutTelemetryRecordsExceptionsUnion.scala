package typingsSlinky.awsSdkClientXrayNode.putTelemetryRecordsExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait PutTelemetryRecordsExceptionsUnion extends js.Object

object PutTelemetryRecordsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): PutTelemetryRecordsExceptionsUnion = value.asInstanceOf[PutTelemetryRecordsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): PutTelemetryRecordsExceptionsUnion = value.asInstanceOf[PutTelemetryRecordsExceptionsUnion]
}

