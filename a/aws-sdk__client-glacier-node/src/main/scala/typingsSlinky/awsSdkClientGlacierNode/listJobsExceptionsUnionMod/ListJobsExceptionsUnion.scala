package typingsSlinky.awsSdkClientGlacierNode.listJobsExceptionsUnionMod

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
trait ListJobsExceptionsUnion extends js.Object

object ListJobsExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): ListJobsExceptionsUnion = value.asInstanceOf[ListJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): ListJobsExceptionsUnion = value.asInstanceOf[ListJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): ListJobsExceptionsUnion = value.asInstanceOf[ListJobsExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): ListJobsExceptionsUnion = value.asInstanceOf[ListJobsExceptionsUnion]
}

