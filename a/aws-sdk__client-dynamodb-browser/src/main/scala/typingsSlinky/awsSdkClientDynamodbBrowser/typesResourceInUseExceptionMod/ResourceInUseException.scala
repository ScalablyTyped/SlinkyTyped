package typingsSlinky.awsSdkClientDynamodbBrowser.typesResourceInUseExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.createTableExceptionsUnionMod.CreateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.deleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.tagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.untagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceInUseException
  extends ServiceException[ResourceInUseExceptionDetails]
     with CreateTableExceptionsUnion
     with DeleteTableExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  
  @JSName("name")
  var name_ResourceInUseException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException = js.native
}
object ResourceInUseException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceInUseExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseException]
  }
  
  @scala.inline
  implicit class ResourceInUseExceptionOps[Self <: ResourceInUseException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ResourceInUseException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
