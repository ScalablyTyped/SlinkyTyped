package typingsSlinky.awsSdkClientGlacierNode.describeVaultExceptionsUnionMod

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
trait DescribeVaultExceptionsUnion extends js.Object

object DescribeVaultExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): DescribeVaultExceptionsUnion = value.asInstanceOf[DescribeVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): DescribeVaultExceptionsUnion = value.asInstanceOf[DescribeVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): DescribeVaultExceptionsUnion = value.asInstanceOf[DescribeVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): DescribeVaultExceptionsUnion = value.asInstanceOf[DescribeVaultExceptionsUnion]
}

