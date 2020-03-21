package typingsSlinky.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
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

