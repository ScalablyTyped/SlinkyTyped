package typingsSlinky.awsSdkClientSqsNode.typesMessageNotInflightMod

import typingsSlinky.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_MessageNotInflightDetails> * / any */ @js.native
trait MessageNotInflight extends ChangeMessageVisibilityExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight = js.native
}
object MessageNotInflight {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): MessageNotInflight = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNotInflight]
  }
  
  @scala.inline
  implicit class MessageNotInflightOps[Self <: MessageNotInflight] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.MessageNotInflight): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
