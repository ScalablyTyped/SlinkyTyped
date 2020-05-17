package typingsSlinky.awsSdkClientXrayNode.getSamplingStatisticSummariesExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetSamplingStatisticSummariesExceptionsUnion extends js.Object

object GetSamplingStatisticSummariesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetSamplingStatisticSummariesExceptionsUnion = value.asInstanceOf[GetSamplingStatisticSummariesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetSamplingStatisticSummariesExceptionsUnion = value.asInstanceOf[GetSamplingStatisticSummariesExceptionsUnion]
}

