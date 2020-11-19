package typingsSlinky.awsSdkClientDynamodbNode.typesResourceNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbNode.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.queryExceptionsUnionMod.QueryExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.scanExceptionsUnionMod.ScanExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbNode.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceNotFoundException
  extends ServiceException[ResourceNotFoundExceptionDetails]
     with BatchGetItemExceptionsUnion
     with BatchWriteItemExceptionsUnion
     with DeleteItemExceptionsUnion
     with DeleteTableExceptionsUnion
     with DescribeTableExceptionsUnion
     with DescribeTimeToLiveExceptionsUnion
     with GetItemExceptionsUnion
     with ListTagsOfResourceExceptionsUnion
     with PutItemExceptionsUnion
     with QueryExceptionsUnion
     with ScanExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateItemExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  
  @JSName("name")
  var name_ResourceNotFoundException: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ResourceNotFoundException = js.native
}
object ResourceNotFoundException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceNotFoundExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ResourceNotFoundException
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
  
  @scala.inline
  implicit class ResourceNotFoundExceptionOps[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(
      value: typingsSlinky.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ResourceNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
