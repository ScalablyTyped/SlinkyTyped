package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.createTableExceptionsUnionMod.CreateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.queryExceptionsUnionMod.QueryExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.scanExceptionsUnionMod.ScanExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalServerErrorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InternalServerErrorDetails> * / any */ @js.native
  trait InternalServerError
    extends BatchGetItemExceptionsUnion
       with BatchWriteItemExceptionsUnion
       with CreateBackupExceptionsUnion
       with CreateGlobalTableExceptionsUnion
       with CreateTableExceptionsUnion
       with DeleteBackupExceptionsUnion
       with DeleteItemExceptionsUnion
       with DeleteTableExceptionsUnion
       with DescribeBackupExceptionsUnion
       with DescribeContinuousBackupsExceptionsUnion
       with DescribeGlobalTableExceptionsUnion
       with DescribeGlobalTableSettingsExceptionsUnion
       with DescribeTableExceptionsUnion
       with DescribeTimeToLiveExceptionsUnion
       with GetItemExceptionsUnion
       with ListTagsOfResourceExceptionsUnion
       with PutItemExceptionsUnion
       with QueryExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion
       with ScanExceptionsUnion
       with TagResourceExceptionsUnion
       with UntagResourceExceptionsUnion
       with UpdateContinuousBackupsExceptionsUnion
       with UpdateGlobalTableExceptionsUnion
       with UpdateGlobalTableSettingsExceptionsUnion
       with UpdateItemExceptionsUnion
       with UpdateTableExceptionsUnion
       with UpdateTimeToLiveExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InternalServerError = js.native
  }
  object InternalServerError {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InternalServerError
    ): InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalServerError]
    }
    
    @scala.inline
    implicit class InternalServerErrorMutableBuilder[Self <: InternalServerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InternalServerError
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InternalServerErrorDetails extends StObject {
    
    /**
      * <p>The server encountered an internal error trying to fulfill the request.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object InternalServerErrorDetails {
    
    @scala.inline
    def apply(): InternalServerErrorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalServerErrorDetails]
    }
    
    @scala.inline
    implicit class InternalServerErrorDetailsMutableBuilder[Self <: InternalServerErrorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
