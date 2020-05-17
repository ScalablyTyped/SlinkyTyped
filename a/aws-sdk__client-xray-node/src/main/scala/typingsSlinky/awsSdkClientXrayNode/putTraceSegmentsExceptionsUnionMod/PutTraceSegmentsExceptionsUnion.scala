package typingsSlinky.awsSdkClientXrayNode.putTraceSegmentsExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait PutTraceSegmentsExceptionsUnion extends js.Object

object PutTraceSegmentsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): PutTraceSegmentsExceptionsUnion = value.asInstanceOf[PutTraceSegmentsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): PutTraceSegmentsExceptionsUnion = value.asInstanceOf[PutTraceSegmentsExceptionsUnion]
}

