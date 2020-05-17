package typingsSlinky.awsSdkClientXrayNode.getTraceSummariesExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetTraceSummariesExceptionsUnion extends js.Object

object GetTraceSummariesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetTraceSummariesExceptionsUnion = value.asInstanceOf[GetTraceSummariesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetTraceSummariesExceptionsUnion = value.asInstanceOf[GetTraceSummariesExceptionsUnion]
}

