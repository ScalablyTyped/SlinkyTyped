package typingsSlinky.awsSdkClientXrayNode.batchGetTracesExceptionsUnionMod

import typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
import typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
  - typingsSlinky.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
*/
trait BatchGetTracesExceptionsUnion extends js.Object

object BatchGetTracesExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidRequestException): BatchGetTracesExceptionsUnion = value.asInstanceOf[BatchGetTracesExceptionsUnion]
  @scala.inline
  implicit def apply(value: ThrottledException): BatchGetTracesExceptionsUnion = value.asInstanceOf[BatchGetTracesExceptionsUnion]
}

