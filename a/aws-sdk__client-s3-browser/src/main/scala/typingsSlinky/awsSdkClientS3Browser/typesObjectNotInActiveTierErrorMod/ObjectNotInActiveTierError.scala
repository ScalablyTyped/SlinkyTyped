package typingsSlinky.awsSdkClientS3Browser.typesObjectNotInActiveTierErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ObjectNotInActiveTierErrorDetails> * / any */ @js.native
trait ObjectNotInActiveTierError extends js.Object {
  
  var name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError = js.native
}
object ObjectNotInActiveTierError {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError): ObjectNotInActiveTierError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNotInActiveTierError]
  }
  
  @scala.inline
  implicit class ObjectNotInActiveTierErrorOps[Self <: ObjectNotInActiveTierError] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ObjectNotInActiveTierError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
