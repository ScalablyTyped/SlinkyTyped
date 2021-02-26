package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDisabledExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_DisabledExceptionDetails> * / any */ @js.native
  trait DisabledException
    extends CreateGrantExceptionsUnion
       with DecryptExceptionsUnion
       with DisableKeyRotationExceptionsUnion
       with EnableKeyRotationExceptionsUnion
       with EncryptExceptionsUnion
       with GenerateDataKeyExceptionsUnion
       with GenerateDataKeyWithoutPlaintextExceptionsUnion
       with ReEncryptExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException = js.native
  }
  object DisabledException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException): DisabledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisabledException]
    }
    
    @scala.inline
    implicit class DisabledExceptionMutableBuilder[Self <: DisabledException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DisabledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DisabledExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object DisabledExceptionDetails {
    
    @scala.inline
    def apply(): DisabledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledExceptionDetails]
    }
    
    @scala.inline
    implicit class DisabledExceptionDetailsMutableBuilder[Self <: DisabledExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
