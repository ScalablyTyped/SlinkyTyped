package typingsSlinky.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestTooLargeException
  extends ServiceException[RequestTooLargeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_RequestTooLargeException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException = js.native
}

