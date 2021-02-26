package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
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
    
    var name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantTokenException = js.native
  }
  object InvalidGrantTokenException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantTokenException): InvalidGrantTokenException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidGrantTokenException]
    }
    
    @scala.inline
    implicit class InvalidGrantTokenExceptionMutableBuilder[Self <: InvalidGrantTokenException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.InvalidGrantTokenException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
