package typingsSlinky.awsSdkClientGlacierNode.typesPolicyEnforcedExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.initiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PolicyEnforcedExceptionDetails> * / any */ @js.native
trait PolicyEnforcedException extends InitiateJobExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException = js.native
}
object PolicyEnforcedException {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException): PolicyEnforcedException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyEnforcedException]
  }
  
  @scala.inline
  implicit class PolicyEnforcedExceptionOps[Self <: PolicyEnforcedException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.PolicyEnforcedException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
