package typingsSlinky.awsSdkClientXrayNode.updateSamplingRuleExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait UpdateSamplingRuleExceptionsUnion extends js.Object

object UpdateSamplingRuleExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): UpdateSamplingRuleExceptionsUnion = value.asInstanceOf[UpdateSamplingRuleExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): UpdateSamplingRuleExceptionsUnion = value.asInstanceOf[UpdateSamplingRuleExceptionsUnion]
}

