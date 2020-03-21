package typingsSlinky.awsSdkClientLambdaNode.typesInvalidSecurityGroupIDExceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSecurityGroupIDException
  extends ServiceException[InvalidSecurityGroupIDExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidSecurityGroupIDException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException = js.native
}

