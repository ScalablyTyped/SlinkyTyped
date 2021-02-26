package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteItemExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbNode.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException
    - typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException
    - typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException
    - typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait DeleteItemExceptionsUnion extends StObject
  object DeleteItemExceptionsUnion {
    
    @scala.inline
    def ConditionalCheckFailedException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ConditionalCheckFailedException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesConditionalCheckFailedExceptionMod.ConditionalCheckFailedException]
    }
    
    @scala.inline
    def InternalServerError(name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InternalServerError): typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def ItemCollectionSizeLimitExceededException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ItemCollectionSizeLimitExceededException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesItemCollectionSizeLimitExceededExceptionMod.ItemCollectionSizeLimitExceededException]
    }
    
    @scala.inline
    def ProvisionedThroughputExceededException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ProvisionedThroughputExceededException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputExceededExceptionMod.ProvisionedThroughputExceededException]
    }
    
    @scala.inline
    def ResourceNotFoundException(
      name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ResourceNotFoundException
    ): typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
  }
}
