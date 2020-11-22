package typingsSlinky.awsSdkClientCodecommitNode.typesBlobIdRequiredExceptionMod

import typingsSlinky.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BlobIdRequiredExceptionDetails> * / any */ @js.native
trait BlobIdRequiredException extends GetBlobExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException = js.native
}
object BlobIdRequiredException {
  
  @scala.inline
  def apply(
    name: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException
  ): BlobIdRequiredException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobIdRequiredException]
  }
  
  @scala.inline
  implicit class BlobIdRequiredExceptionOps[Self <: BlobIdRequiredException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BlobIdRequiredException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
