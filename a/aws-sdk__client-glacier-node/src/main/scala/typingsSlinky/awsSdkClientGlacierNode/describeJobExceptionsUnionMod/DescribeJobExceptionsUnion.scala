package typingsSlinky.awsSdkClientGlacierNode.describeJobExceptionsUnionMod

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
trait DescribeJobExceptionsUnion extends js.Object

object DescribeJobExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DescribeJobExceptionsUnion = value.asInstanceOf[DescribeJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): DescribeJobExceptionsUnion = value.asInstanceOf[DescribeJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeJobExceptionsUnion = value.asInstanceOf[DescribeJobExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): DescribeJobExceptionsUnion = value.asInstanceOf[DescribeJobExceptionsUnion]
}

