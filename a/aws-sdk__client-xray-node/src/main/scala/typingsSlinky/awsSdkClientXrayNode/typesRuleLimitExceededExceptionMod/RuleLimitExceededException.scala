package typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod

import typingsSlinky.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleLimitExceededException
  extends ServiceException[RuleLimitExceededExceptionDetails]
     with CreateSamplingRuleExceptionsUnion {
  @JSName("name")
  var name_RuleLimitExceededException: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException
}

object RuleLimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RuleLimitExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException,
    stack: String = null
  ): RuleLimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleLimitExceededException]
  }
}

