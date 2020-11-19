package typingsSlinky.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMSAccessDeniedException
  extends ServiceException[KMSAccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  
  @JSName("name")
  var name_KMSAccessDeniedException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException = js.native
}
object KMSAccessDeniedException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: KMSAccessDeniedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException
  ): KMSAccessDeniedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSAccessDeniedException]
  }
  
  @scala.inline
  implicit class KMSAccessDeniedExceptionOps[Self <: KMSAccessDeniedException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
