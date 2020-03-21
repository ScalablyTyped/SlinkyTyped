package typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod

import typingsSlinky.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleLimitExceededException
  extends ServiceException[RuleLimitExceededExceptionDetails]
     with CreateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_RuleLimitExceededException: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException = js.native
}

