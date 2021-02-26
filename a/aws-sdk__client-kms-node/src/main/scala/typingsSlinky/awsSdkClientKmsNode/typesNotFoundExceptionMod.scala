package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.cancelKeyDeletionExceptionsUnionMod.CancelKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.createGrantExceptionsUnionMod.CreateGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.decryptExceptionsUnionMod.DecryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.deleteAliasExceptionsUnionMod.DeleteAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.deleteImportedKeyMaterialExceptionsUnionMod.DeleteImportedKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.describeKeyExceptionsUnionMod.DescribeKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyExceptionsUnionMod.DisableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.disableKeyRotationExceptionsUnionMod.DisableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyExceptionsUnionMod.EnableKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.enableKeyRotationExceptionsUnionMod.EnableKeyRotationExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.encryptExceptionsUnionMod.EncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyExceptionsUnionMod.GenerateDataKeyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.generateDataKeyWithoutPlaintextExceptionsUnionMod.GenerateDataKeyWithoutPlaintextExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getKeyPolicyExceptionsUnionMod.GetKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getKeyRotationStatusExceptionsUnionMod.GetKeyRotationStatusExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.getParametersForImportExceptionsUnionMod.GetParametersForImportExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.importKeyMaterialExceptionsUnionMod.ImportKeyMaterialExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listGrantsExceptionsUnionMod.ListGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listKeyPoliciesExceptionsUnionMod.ListKeyPoliciesExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listResourceTagsExceptionsUnionMod.ListResourceTagsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.listRetirableGrantsExceptionsUnionMod.ListRetirableGrantsExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.putKeyPolicyExceptionsUnionMod.PutKeyPolicyExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.reEncryptExceptionsUnionMod.ReEncryptExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.retireGrantExceptionsUnionMod.RetireGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.revokeGrantExceptionsUnionMod.RevokeGrantExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.scheduleKeyDeletionExceptionsUnionMod.ScheduleKeyDeletionExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typingsSlinky.awsSdkClientKmsNode.updateKeyDescriptionExceptionsUnionMod.UpdateKeyDescriptionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_NotFoundExceptionDetails> * / any */ @js.native
  trait NotFoundException
    extends CancelKeyDeletionExceptionsUnion
       with CreateAliasExceptionsUnion
       with CreateGrantExceptionsUnion
       with DecryptExceptionsUnion
       with DeleteAliasExceptionsUnion
       with DeleteImportedKeyMaterialExceptionsUnion
       with DescribeKeyExceptionsUnion
       with DisableKeyExceptionsUnion
       with DisableKeyRotationExceptionsUnion
       with EnableKeyExceptionsUnion
       with EnableKeyRotationExceptionsUnion
       with EncryptExceptionsUnion
       with GenerateDataKeyExceptionsUnion
       with GenerateDataKeyWithoutPlaintextExceptionsUnion
       with GetKeyPolicyExceptionsUnion
       with GetKeyRotationStatusExceptionsUnion
       with GetParametersForImportExceptionsUnion
       with ImportKeyMaterialExceptionsUnion
       with ListGrantsExceptionsUnion
       with ListKeyPoliciesExceptionsUnion
       with ListResourceTagsExceptionsUnion
       with ListRetirableGrantsExceptionsUnion
       with PutKeyPolicyExceptionsUnion
       with ReEncryptExceptionsUnion
       with RetireGrantExceptionsUnion
       with RevokeGrantExceptionsUnion
       with ScheduleKeyDeletionExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateAliasExceptionsUnion
       with UpdateKeyDescriptionExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.NotFoundException = js.native
  }
  object NotFoundException {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.NotFoundException): NotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotFoundException]
    }
    
    @scala.inline
    implicit class NotFoundExceptionMutableBuilder[Self <: NotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.NotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessageType shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object NotFoundExceptionDetails {
    
    @scala.inline
    def apply(): NotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class NotFoundExceptionDetailsMutableBuilder[Self <: NotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
