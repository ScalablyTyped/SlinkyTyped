package typingsSlinky.awsSdkClientKinesisBrowser.typesProvisionedThroughputExceededExceptionMod

import typingsSlinky.awsSdkClientKinesisBrowser.getRecordsExceptionsUnionMod.GetRecordsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.getShardIteratorExceptionsUnionMod.GetShardIteratorExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.putRecordExceptionsUnionMod.PutRecordExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.putRecordsExceptionsUnionMod.PutRecordsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionedThroughputExceededException
  extends ServiceException[ProvisionedThroughputExceededExceptionDetails]
     with GetRecordsExceptionsUnion
     with GetShardIteratorExceptionsUnion
     with PutRecordExceptionsUnion
     with PutRecordsExceptionsUnion {
  
  @JSName("name")
  var name_ProvisionedThroughputExceededException: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException = js.native
}
object ProvisionedThroughputExceededException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ProvisionedThroughputExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
  ): ProvisionedThroughputExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputExceededException]
  }
  
  @scala.inline
  implicit class ProvisionedThroughputExceededExceptionOps[Self <: ProvisionedThroughputExceededException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ProvisionedThroughputExceededException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
