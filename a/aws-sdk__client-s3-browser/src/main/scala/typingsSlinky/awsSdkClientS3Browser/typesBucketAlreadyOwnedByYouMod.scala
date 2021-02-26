package typingsSlinky.awsSdkClientS3Browser

import typingsSlinky.awsSdkClientS3Browser.createBucketExceptionsUnionMod.CreateBucketExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBucketAlreadyOwnedByYouMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BucketAlreadyOwnedByYouDetails> * / any */ @js.native
  trait BucketAlreadyOwnedByYou extends CreateBucketExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou = js.native
  }
  object BucketAlreadyOwnedByYou {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou): BucketAlreadyOwnedByYou = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketAlreadyOwnedByYou]
    }
    
    @scala.inline
    implicit class BucketAlreadyOwnedByYouMutableBuilder[Self <: BucketAlreadyOwnedByYou] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BucketAlreadyOwnedByYou): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketAlreadyOwnedByYouDetails extends StObject
}
