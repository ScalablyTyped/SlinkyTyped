package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableNotFoundExceptionDetails> * / any */ @js.native
  trait TableNotFoundException
    extends CreateBackupExceptionsUnion
       with CreateGlobalTableExceptionsUnion
       with DescribeContinuousBackupsExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion
       with UpdateContinuousBackupsExceptionsUnion
       with UpdateGlobalTableExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableNotFoundException = js.native
  }
  object TableNotFoundException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableNotFoundException
    ): TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableNotFoundException]
    }
    
    @scala.inline
    implicit class TableNotFoundExceptionMutableBuilder[Self <: TableNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableNotFoundException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object TableNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): TableNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class TableNotFoundExceptionDetailsMutableBuilder[Self <: TableNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
