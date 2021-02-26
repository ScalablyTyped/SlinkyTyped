package typingsSlinky.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSamplingRuleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
    - typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException
  */
  trait CreateSamplingRuleExceptionsUnion extends StObject
  object CreateSamplingRuleExceptionsUnion {
    
    @scala.inline
    def InvalidRequestException(name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    @scala.inline
    def RuleLimitExceededException(name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException]
    }
    
    @scala.inline
    def ThrottledException(name: typingsSlinky.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
