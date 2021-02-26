package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnsupportedOperationExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_UnsupportedOperationExceptionDetails> * / any */ @js.native
  trait UnsupportedOperationException
    extends CreateKeyExceptionsUnion
       with DeleteImportedKeyMaterialExceptionsUnion
       with DisableKeyRotationExceptionsUnion
       with EnableKeyRotationExceptionsUnion
       with GetKeyRotationStatusExceptionsUnion
       with GetParametersForImportExceptionsUnion
       with ImportKeyMaterialExceptionsUnion
       with PutKeyPolicyExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException = js.native
  }
  object UnsupportedOperationException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException): UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsupportedOperationException]
    }
    
    @scala.inline
    implicit class UnsupportedOperationExceptionMutableBuilder[Self <: UnsupportedOperationException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.UnsupportedOperationException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnsupportedOperationExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object UnsupportedOperationExceptionDetails {
    
    @scala.inline
    def apply(): UnsupportedOperationExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnsupportedOperationExceptionDetails]
    }
    
    @scala.inline
    implicit class UnsupportedOperationExceptionDetailsMutableBuilder[Self <: UnsupportedOperationExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
