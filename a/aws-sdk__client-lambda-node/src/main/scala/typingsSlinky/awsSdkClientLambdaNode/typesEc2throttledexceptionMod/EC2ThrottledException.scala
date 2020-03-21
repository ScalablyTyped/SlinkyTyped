package typingsSlinky.awsSdkClientLambdaNode.typesEc2throttledexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ThrottledException
  extends ServiceException[EC2ThrottledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2ThrottledException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException = js.native
}

