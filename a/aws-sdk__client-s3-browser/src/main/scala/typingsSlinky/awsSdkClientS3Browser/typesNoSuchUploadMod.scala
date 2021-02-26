package typingsSlinky.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchUploadMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchUploadDetails> * / any */ @js.native
  trait NoSuchUpload extends StObject {
    
    var name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload = js.native
  }
  object NoSuchUpload {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload): NoSuchUpload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoSuchUpload]
    }
    
    @scala.inline
    implicit class NoSuchUploadMutableBuilder[Self <: NoSuchUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchUpload): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoSuchUploadDetails extends StObject
}
