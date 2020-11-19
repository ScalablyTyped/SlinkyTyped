package typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.batchGetItemExceptionsUnionMod.BatchGetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.batchWriteItemExceptionsUnionMod.BatchWriteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteItemExceptionsUnionMod.DeleteItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeTableExceptionsUnionMod.DescribeTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeTimeToLiveExceptionsUnionMod.DescribeTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.getItemExceptionsUnionMod.GetItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.listTagsOfResourceExceptionsUnionMod.ListTagsOfResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.putItemExceptionsUnionMod.PutItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.queryExceptionsUnionMod.QueryExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.scanExceptionsUnionMod.ScanExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateItemExceptionsUnionMod.UpdateItemExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
  var name_ResourceNotFoundException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException = js.native
}
object ResourceNotFoundException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceNotFoundExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException
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
      value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
