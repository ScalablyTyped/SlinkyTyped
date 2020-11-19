package typingsSlinky.awsSdkClientLambdaNode.typesEc2accessdeniedexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2AccessDeniedException
  extends ServiceException[EC2AccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  
  @JSName("name")
  var name_EC2AccessDeniedException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException = js.native
}
object EC2AccessDeniedException {
  
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2AccessDeniedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException
  ): EC2AccessDeniedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2AccessDeniedException]
  }
  
  @scala.inline
  implicit class EC2AccessDeniedExceptionOps[Self <: EC2AccessDeniedException] (val x: Self) extends AnyVal {
    
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
    def setName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
