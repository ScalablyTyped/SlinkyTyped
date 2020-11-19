package typingsSlinky.awsSdkClientDynamodbBrowser.typesInvalidRestoreTimeExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidRestoreTimeException
  extends ServiceException[InvalidRestoreTimeExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  
  @JSName("name")
  var name_InvalidRestoreTimeException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InvalidRestoreTimeException = js.native
}
object InvalidRestoreTimeException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRestoreTimeExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InvalidRestoreTimeException
  ): InvalidRestoreTimeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRestoreTimeException]
  }
  
  @scala.inline
  implicit class InvalidRestoreTimeExceptionOps[Self <: InvalidRestoreTimeException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.InvalidRestoreTimeException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
