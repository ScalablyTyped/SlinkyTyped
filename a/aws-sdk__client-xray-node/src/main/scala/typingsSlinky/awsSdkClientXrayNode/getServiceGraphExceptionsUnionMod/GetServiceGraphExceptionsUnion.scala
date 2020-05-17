package typingsSlinky.awsSdkClientXrayNode.getServiceGraphExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait GetServiceGraphExceptionsUnion extends js.Object

object GetServiceGraphExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): GetServiceGraphExceptionsUnion = value.asInstanceOf[GetServiceGraphExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): GetServiceGraphExceptionsUnion = value.asInstanceOf[GetServiceGraphExceptionsUnion]
}

