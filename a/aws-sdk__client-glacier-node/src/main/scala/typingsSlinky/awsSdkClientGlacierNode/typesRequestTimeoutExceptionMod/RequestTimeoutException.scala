package typingsSlinky.awsSdkClientGlacierNode.typesRequestTimeoutExceptionMod

import typingsSlinky.awsSdkClientGlacierNode.uploadArchiveExceptionsUnionMod.UploadArchiveExceptionsUnion
import typingsSlinky.awsSdkClientGlacierNode.uploadMultipartPartExceptionsUnionMod.UploadMultipartPartExceptionsUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RequestTimeoutExceptionDetails> * / any */ @js.native
trait RequestTimeoutException
  extends UploadArchiveExceptionsUnion
     with UploadMultipartPartExceptionsUnion {
  
  var name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException = js.native
}
object RequestTimeoutException {
  
  @scala.inline
  def apply(name: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException): RequestTimeoutException = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTimeoutException]
  }
  
  @scala.inline
  implicit class RequestTimeoutExceptionOps[Self <: RequestTimeoutException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.RequestTimeoutException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
