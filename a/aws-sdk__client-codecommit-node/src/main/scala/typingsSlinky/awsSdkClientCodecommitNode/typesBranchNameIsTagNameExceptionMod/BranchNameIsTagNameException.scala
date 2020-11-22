package typingsSlinky.awsSdkClientCodecommitNode.typesBranchNameIsTagNameExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typingsSlinky.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BranchNameIsTagNameExceptionDetails> * / any */ @js.native
trait BranchNameIsTagNameException
  extends DeleteFileExceptionsUnion
     with PutFileExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException = js.native
}
object BranchNameIsTagNameException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
  ): BranchNameIsTagNameException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchNameIsTagNameException]
  }
  
  @scala.inline
  implicit class BranchNameIsTagNameExceptionOps[Self <: BranchNameIsTagNameException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BranchNameIsTagNameException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
