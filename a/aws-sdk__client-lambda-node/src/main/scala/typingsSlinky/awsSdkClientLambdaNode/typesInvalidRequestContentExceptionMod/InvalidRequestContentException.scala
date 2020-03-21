package typingsSlinky.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRequestContentException
  extends ServiceException[InvalidRequestContentExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRequestContentException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException = js.native
}

