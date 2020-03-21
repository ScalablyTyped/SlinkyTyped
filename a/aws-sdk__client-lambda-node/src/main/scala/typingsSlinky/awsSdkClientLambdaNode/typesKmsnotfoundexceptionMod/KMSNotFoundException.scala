package typingsSlinky.awsSdkClientLambdaNode.typesKmsnotfoundexceptionMod

import typingsSlinky.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typingsSlinky.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSNotFoundException
  extends ServiceException[KMSNotFoundExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSNotFoundException: typingsSlinky.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.KMSNotFoundException = js.native
}

