package typingsSlinky.awsSdkClientSqsNode.typesInvalidIdFormatMod

import typingsSlinky.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidIdFormatDetails> * / any */ @js.native
trait InvalidIdFormat extends DeleteMessageExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat = js.native
}
object InvalidIdFormat {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): InvalidIdFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdFormat]
  }
  
  @scala.inline
  implicit class InvalidIdFormatOps[Self <: InvalidIdFormat] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.InvalidIdFormat): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
