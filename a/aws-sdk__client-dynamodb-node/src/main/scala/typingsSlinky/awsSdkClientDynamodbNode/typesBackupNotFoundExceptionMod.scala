package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BackupNotFoundExceptionDetails> * / any */ @js.native
  trait BackupNotFoundException
    extends DeleteBackupExceptionsUnion
       with DescribeBackupExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupNotFoundException = js.native
  }
  object BackupNotFoundException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupNotFoundException
    ): BackupNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackupNotFoundException]
    }
    
    @scala.inline
    implicit class BackupNotFoundExceptionMutableBuilder[Self <: BackupNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackupNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object BackupNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): BackupNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class BackupNotFoundExceptionDetailsMutableBuilder[Self <: BackupNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
