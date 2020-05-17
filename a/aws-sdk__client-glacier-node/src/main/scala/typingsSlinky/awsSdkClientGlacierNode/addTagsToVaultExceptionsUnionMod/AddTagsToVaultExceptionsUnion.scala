package typingsSlinky.awsSdkClientGlacierNode.addTagsToVaultExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException
import typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
import typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
import typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
  - typingsSlinky.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
  - typingsSlinky.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait AddTagsToVaultExceptionsUnion extends js.Object

object AddTagsToVaultExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): AddTagsToVaultExceptionsUnion = value.asInstanceOf[AddTagsToVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: LimitExceededException): AddTagsToVaultExceptionsUnion = value.asInstanceOf[AddTagsToVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): AddTagsToVaultExceptionsUnion = value.asInstanceOf[AddTagsToVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): AddTagsToVaultExceptionsUnion = value.asInstanceOf[AddTagsToVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): AddTagsToVaultExceptionsUnion = value.asInstanceOf[AddTagsToVaultExceptionsUnion]
}

