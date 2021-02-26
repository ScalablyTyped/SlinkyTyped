package typingsSlinky.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNoSuchKeyMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NoSuchKeyDetails> * / any */ @js.native
  trait NoSuchKey extends StObject {
    
    var name: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchKey = js.native
  }
  object NoSuchKey {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchKey): NoSuchKey = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoSuchKey]
    }
    
    @scala.inline
    implicit class NoSuchKeyMutableBuilder[Self <: NoSuchKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NoSuchKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NoSuchKeyDetails extends StObject
}
