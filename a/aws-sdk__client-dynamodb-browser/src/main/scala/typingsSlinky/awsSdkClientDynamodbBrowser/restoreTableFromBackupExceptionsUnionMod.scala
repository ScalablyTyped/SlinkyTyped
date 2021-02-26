package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreTableFromBackupExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait RestoreTableFromBackupExceptionsUnion extends StObject
  object RestoreTableFromBackupExceptionsUnion {
    
    @scala.inline
    def BackupInUseException(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupInUseException
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException]
    }
    
    @scala.inline
    def BackupNotFoundException(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException]
    }
    
    @scala.inline
    def InternalServerError(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InternalServerError
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def LimitExceededException(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.LimitExceededException
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def TableAlreadyExistsException(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableAlreadyExistsException
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException]
    }
    
    @scala.inline
    def TableInUseException(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableInUseException
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException]
    }
  }
}
