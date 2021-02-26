package typingsSlinky.awsSdkClientKmsBrowser

import typingsSlinky.awsSdkClientKmsBrowser.createKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsBrowser.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
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
    
    var name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.UnsupportedOperationException = js.native
  }
  object UnsupportedOperationException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.UnsupportedOperationException
    ): UnsupportedOperationException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsupportedOperationException]
    }
    
    @scala.inline
    implicit class UnsupportedOperationExceptionMutableBuilder[Self <: UnsupportedOperationException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.UnsupportedOperationException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
