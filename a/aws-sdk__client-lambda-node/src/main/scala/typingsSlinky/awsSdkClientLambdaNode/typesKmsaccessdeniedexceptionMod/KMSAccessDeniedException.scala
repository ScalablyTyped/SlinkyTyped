package typingsSlinky.awsSdkClientLambdaNode.typesKmsaccessdeniedexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSAccessDeniedException
  extends ServiceException[KMSAccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSAccessDeniedException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSAccessDeniedException = js.native
}

