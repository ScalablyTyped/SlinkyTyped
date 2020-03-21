package typingsSlinky.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSubnetIDException
  extends ServiceException[InvalidSubnetIDExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidSubnetIDException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException = js.native
}

