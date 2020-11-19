package typingsSlinky.awsSdkClientDynamodbBrowser.typesGlobalTableNotFoundExceptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.describeGlobalTableExceptionsUnionMod.DescribeGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.describeGlobalTableSettingsExceptionsUnionMod.DescribeGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.updateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalTableNotFoundException
  extends ServiceException[GlobalTableNotFoundExceptionDetails]
     with DescribeGlobalTableExceptionsUnion
     with DescribeGlobalTableSettingsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion {
  
  @JSName("name")
  var name_GlobalTableNotFoundException: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableNotFoundException = js.native
}
object GlobalTableNotFoundException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: GlobalTableNotFoundExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableNotFoundException
  ): GlobalTableNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableNotFoundException]
  }
  
  @scala.inline
  implicit class GlobalTableNotFoundExceptionOps[Self <: GlobalTableNotFoundException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.GlobalTableNotFoundException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
