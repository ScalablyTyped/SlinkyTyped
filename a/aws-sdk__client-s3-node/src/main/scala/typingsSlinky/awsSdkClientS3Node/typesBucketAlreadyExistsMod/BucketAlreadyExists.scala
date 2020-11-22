package typingsSlinky.awsSdkClientS3Node.typesBucketAlreadyExistsMod

import typingsSlinky.awsSdkClientS3Node.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BucketAlreadyExistsDetails> * / any */ @js.native
trait BucketAlreadyExists extends CreateBucketExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists = js.native
}
object BucketAlreadyExists {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists): BucketAlreadyExists = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketAlreadyExists]
  }
  
  @scala.inline
  implicit class BucketAlreadyExistsOps[Self <: BucketAlreadyExists] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketAlreadyExists): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
