package typingsSlinky.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestTooLargeException
  extends ServiceException[RequestTooLargeExceptionDetails]
     with InvokeExceptionsUnion {
  
  @JSName("name")
  var name_RequestTooLargeException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException = js.native
}
object RequestTooLargeException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RequestTooLargeExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException
  ): RequestTooLargeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTooLargeException]
  }
  
  @scala.inline
  implicit class RequestTooLargeExceptionOps[Self <: RequestTooLargeException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
