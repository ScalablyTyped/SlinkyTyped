package typingsSlinky.awsSdkClientKinesisBrowser.typesExpiredNextTokenExceptionMod

import typingsSlinky.awsSdkClientKinesisBrowser.listShardsExceptionsUnionMod.ListShardsExceptionsUnion
import typingsSlinky.awsSdkClientKinesisBrowser.listStreamConsumersExceptionsUnionMod.ListStreamConsumersExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpiredNextTokenException
  extends ServiceException[ExpiredNextTokenExceptionDetails]
     with ListShardsExceptionsUnion
     with ListStreamConsumersExceptionsUnion {
  
  @JSName("name")
  var name_ExpiredNextTokenException: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException = js.native
}
object ExpiredNextTokenException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ExpiredNextTokenExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
  ): ExpiredNextTokenException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiredNextTokenException]
  }
  
  @scala.inline
  implicit class ExpiredNextTokenExceptionOps[Self <: ExpiredNextTokenException] (val x: Self) extends AnyVal {
    
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
      value: typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ExpiredNextTokenException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
