package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.createTableExceptionsUnionMod.CreateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.queryExceptionsUnionMod.QueryExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.scanExceptionsUnionMod.ScanExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
    
    var name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError = js.native
  }
  object InternalServerError {
    
    @scala.inline
    def apply(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalServerError]
    }
    
    @scala.inline
    implicit class InternalServerErrorMutableBuilder[Self <: InternalServerError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
