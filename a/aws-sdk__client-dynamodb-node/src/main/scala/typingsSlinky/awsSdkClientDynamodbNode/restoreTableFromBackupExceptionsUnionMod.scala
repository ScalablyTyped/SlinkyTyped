package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreTableFromBackupExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
    - typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
    - typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException
    - typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException
    - typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
    - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait RestoreTableFromBackupExceptionsUnion extends StObject
  object RestoreTableFromBackupExceptionsUnion {
    
    @scala.inline
    def BackupInUseException(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException): typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException]
    }
    
    @scala.inline
    def BackupNotFoundException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupNotFoundException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException]
    }
    
    @scala.inline
    def InternalServerError(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def LimitExceededException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.LimitExceededException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def TableAlreadyExistsException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableAlreadyExistsException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException]
    }
    
    @scala.inline
    def TableInUseException(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException): typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException]
    }
  }
}
