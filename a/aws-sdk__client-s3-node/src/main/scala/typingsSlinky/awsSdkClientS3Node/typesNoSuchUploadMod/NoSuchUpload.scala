package typingsSlinky.awsSdkClientS3Node.typesNoSuchUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchUploadDetails> * / any */ @js.native
trait NoSuchUpload extends js.Object {
  
  var name: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload = js.native
}
object NoSuchUpload {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload): NoSuchUpload = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchUpload]
  }
  
  @scala.inline
  implicit class NoSuchUploadOps[Self <: NoSuchUpload] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchUpload): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
