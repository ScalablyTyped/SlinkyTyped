package typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeStorageExceededException
  extends ServiceException[CodeStorageExceededExceptionDetails]
     with CreateFunctionExceptionsUnion
     with PublishVersionExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion {
  @JSName("name")
  var name_CodeStorageExceededException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException = js.native
}

object CodeStorageExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: CodeStorageExceededExceptionDetails,
    message: String,
    name: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException
  ): CodeStorageExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeStorageExceededException]
  }
  @scala.inline
  implicit class CodeStorageExceededExceptionOps[Self <: CodeStorageExceededException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(
      value: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

