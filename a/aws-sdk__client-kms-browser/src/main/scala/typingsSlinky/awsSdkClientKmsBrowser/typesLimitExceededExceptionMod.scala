package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_LimitExceededExceptionDetails> * / any */ @js.native
  trait LimitExceededException
    extends CreateAliasExceptionsUnion
       with CreateGrantExceptionsUnion
       with CreateKeyExceptionsUnion
       with EnableKeyExceptionsUnion
       with PutKeyPolicyExceptionsUnion
       with TagResourceExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException = js.native
  }
  object LimitExceededException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException): LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitExceededException]
    }
    
    @scala.inline
    implicit class LimitExceededExceptionMutableBuilder[Self <: LimitExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.LimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LimitExceededExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object LimitExceededExceptionDetails {
    
    @scala.inline
    def apply(): LimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class LimitExceededExceptionDetailsMutableBuilder[Self <: LimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
