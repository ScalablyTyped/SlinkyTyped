package typingsSlinky.awsSdkClientGlacierNode.removeTagsFromVaultExceptionsUnionMod

import typingsSlinky.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
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
  - typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
*/
trait RemoveTagsFromVaultExceptionsUnion extends js.Object

object RemoveTagsFromVaultExceptionsUnion {
  @scala.inline
  implicit def apply(value: InvalidParameterValueException): RemoveTagsFromVaultExceptionsUnion = value.asInstanceOf[RemoveTagsFromVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: MissingParameterValueException): RemoveTagsFromVaultExceptionsUnion = value.asInstanceOf[RemoveTagsFromVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ResourceNotFoundException): RemoveTagsFromVaultExceptionsUnion = value.asInstanceOf[RemoveTagsFromVaultExceptionsUnion]
  @scala.inline
  implicit def apply(value: ServiceUnavailableException): RemoveTagsFromVaultExceptionsUnion = value.asInstanceOf[RemoveTagsFromVaultExceptionsUnion]
}

