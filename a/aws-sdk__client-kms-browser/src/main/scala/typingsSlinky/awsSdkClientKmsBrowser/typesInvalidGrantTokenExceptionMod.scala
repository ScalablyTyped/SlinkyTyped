package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidGrantTokenExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidGrantTokenExceptionDetails> * / any */ @js.native
  trait InvalidGrantTokenException
    extends CreateGrantExceptionsUnion
       with DecryptExceptionsUnion
       with EncryptExceptionsUnion
       with GenerateDataKeyExceptionsUnion
       with GenerateDataKeyWithoutPlaintextExceptionsUnion
       with ReEncryptExceptionsUnion
       with RetireGrantExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantTokenException = js.native
  }
  object InvalidGrantTokenException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantTokenException
    ): InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidGrantTokenException]
    }
    
    @scala.inline
    implicit class InvalidGrantTokenExceptionMutableBuilder[Self <: InvalidGrantTokenException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.InvalidGrantTokenException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InvalidGrantTokenExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object InvalidGrantTokenExceptionDetails {
    
    @scala.inline
    def apply(): InvalidGrantTokenExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidGrantTokenExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidGrantTokenExceptionDetailsMutableBuilder[Self <: InvalidGrantTokenExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
