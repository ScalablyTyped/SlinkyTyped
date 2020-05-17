package typingsSlinky.awsSdkClientXrayNode.getTraceGraphExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetTraceGraphExceptionsUnion extends js.Object

object GetTraceGraphExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetTraceGraphExceptionsUnion = value.asInstanceOf[GetTraceGraphExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetTraceGraphExceptionsUnion = value.asInstanceOf[GetTraceGraphExceptionsUnion]
}

