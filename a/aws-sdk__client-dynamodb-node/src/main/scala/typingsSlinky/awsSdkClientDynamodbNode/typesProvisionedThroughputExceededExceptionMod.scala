package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.queryExceptionsUnionMod.QueryExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.scanExceptionsUnionMod.ScanExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvisionedThroughputExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ProvisionedThroughputExceededExceptionDetails> * / any */ @js.native
  trait ProvisionedThroughputExceededException
    extends BatchGetItemExceptionsUnion
       with BatchWriteItemExceptionsUnion
       with DeleteItemExceptionsUnion
       with GetItemExceptionsUnion
       with PutItemExceptionsUnion
       with QueryExceptionsUnion
       with ScanExceptionsUnion
       with UpdateItemExceptionsUnion {
    
    var name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ProvisionedThroughputExceededException = js.native
  }
  object ProvisionedThroughputExceededException {
    
    @scala.inline
    def apply(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ProvisionedThroughputExceededException
    ): ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisionedThroughputExceededException]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputExceededExceptionMutableBuilder[Self <: ProvisionedThroughputExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ProvisionedThroughputExceededException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProvisionedThroughputExceededExceptionDetails extends StObject {
    
    /**
      * <p>You exceeded your maximum allowed provisioned throughput.</p>
      */
    var message: js.UndefOr[String] = js.native
  }
  object ProvisionedThroughputExceededExceptionDetails {
    
    @scala.inline
    def apply(): ProvisionedThroughputExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvisionedThroughputExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class ProvisionedThroughputExceededExceptionDetailsMutableBuilder[Self <: ProvisionedThroughputExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
