package typingsSlinky.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2UnexpectedException
  extends ServiceException[EC2UnexpectedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2UnexpectedException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException = js.native
}

object EC2UnexpectedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2UnexpectedExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException
  ): EC2UnexpectedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2UnexpectedException]
  }
  @scala.inline
  implicit class EC2UnexpectedExceptionOps[Self <: EC2UnexpectedException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

