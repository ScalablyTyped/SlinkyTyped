package typingsSlinky.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
  - typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException
*/
trait CreateSamplingRuleExceptionsUnion extends js.Object

object CreateSamplingRuleExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): CreateSamplingRuleExceptionsUnion = value.asInstanceOf[CreateSamplingRuleExceptionsUnion]
  @scala.inline
  implicit def apply(value: RuleLimitExceededException): CreateSamplingRuleExceptionsUnion = value.asInstanceOf[CreateSamplingRuleExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): CreateSamplingRuleExceptionsUnion = value.asInstanceOf[CreateSamplingRuleExceptionsUnion]
}

