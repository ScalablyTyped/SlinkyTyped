package typingsSlinky.awsSdkClientXrayNode.deleteSamplingRuleExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait DeleteSamplingRuleExceptionsUnion extends js.Object

object DeleteSamplingRuleExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): DeleteSamplingRuleExceptionsUnion = value.asInstanceOf[DeleteSamplingRuleExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): DeleteSamplingRuleExceptionsUnion = value.asInstanceOf[DeleteSamplingRuleExceptionsUnion]
}

