package typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_CodeStorageExceededExceptionDetails> * / any */ @js.native
trait CodeStorageExceededException
  extends CreateFunctionExceptionsUnion
     with PublishVersionExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException = js.native
}
object CodeStorageExceededException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException
  ): CodeStorageExceededException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeStorageExceededException]
  }
  
  @scala.inline
  implicit class CodeStorageExceededExceptionOps[Self <: CodeStorageExceededException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
