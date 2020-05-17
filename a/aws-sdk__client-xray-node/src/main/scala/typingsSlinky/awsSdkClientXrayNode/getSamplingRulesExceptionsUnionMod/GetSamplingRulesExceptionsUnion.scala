package typingsSlinky.awsSdkClientXrayNode.getSamplingRulesExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetSamplingRulesExceptionsUnion extends js.Object

object GetSamplingRulesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetSamplingRulesExceptionsUnion = value.asInstanceOf[GetSamplingRulesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetSamplingRulesExceptionsUnion = value.asInstanceOf[GetSamplingRulesExceptionsUnion]
}

