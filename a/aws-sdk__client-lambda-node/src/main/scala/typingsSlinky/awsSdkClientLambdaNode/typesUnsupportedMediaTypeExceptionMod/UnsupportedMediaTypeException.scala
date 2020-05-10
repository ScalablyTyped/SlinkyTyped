package typingsSlinky.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedMediaTypeException
  extends ServiceException[UnsupportedMediaTypeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_UnsupportedMediaTypeException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException = js.native
}

object UnsupportedMediaTypeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: UnsupportedMediaTypeExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
  ): UnsupportedMediaTypeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedMediaTypeException]
  }
  @scala.inline
  implicit class UnsupportedMediaTypeExceptionOps[Self <: UnsupportedMediaTypeException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

