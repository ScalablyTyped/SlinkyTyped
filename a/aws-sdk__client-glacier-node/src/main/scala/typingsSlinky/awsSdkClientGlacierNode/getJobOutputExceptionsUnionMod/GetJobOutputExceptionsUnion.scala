package typingsSlinky.awsSdkClientGlacierNode.getJobOutputExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait GetJobOutputExceptionsUnion extends js.Object

object GetJobOutputExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): GetJobOutputExceptionsUnion = value.asInstanceOf[GetJobOutputExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): GetJobOutputExceptionsUnion = value.asInstanceOf[GetJobOutputExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): GetJobOutputExceptionsUnion = value.asInstanceOf[GetJobOutputExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): GetJobOutputExceptionsUnion = value.asInstanceOf[GetJobOutputExceptionsUnion]
}

