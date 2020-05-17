package typingsSlinky.awsSdkClientXrayNode.getSamplingTargetsExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetSamplingTargetsExceptionsUnion extends js.Object

object GetSamplingTargetsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetSamplingTargetsExceptionsUnion = value.asInstanceOf[GetSamplingTargetsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetSamplingTargetsExceptionsUnion = value.asInstanceOf[GetSamplingTargetsExceptionsUnion]
}

